package com.qishiyi.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qishiyi.oa.dao.IForumDao;
import com.qishiyi.oa.dao.ITopicDao;
import com.qishiyi.oa.domain.Forum;
import com.qishiyi.oa.domain.PageBean;
import com.qishiyi.oa.domain.Topic;
import com.qishiyi.oa.service.ITopicService;
import com.qishiyi.oa.utils.HQLHelper;

/**
 * 主题操作
 */
@Service
@Transactional
public class TopicServiceImpl implements ITopicService{
	@Resource
	private ITopicDao topicDao;
	@Resource
	private IForumDao forumDao;
	public List<Topic> findTopicByForum(Forum model) {
		return topicDao.findTopicByForum(model);
	}
	
	/**
	 * 发表主题
	 */
	public void save(Topic model) {
		topicDao.save(model);//model为持久对象
		Forum forum = model.getForum();//forum为持久对象
		forum.setTopicCount(forum.getTopicCount() + 1);//当前主题所在版块的主题数量加1
		forum.setArticleCount(forum.getArticleCount() + 1);//当前主题所在版块的文章数量加1
		forum.setLastTopic(model);//设置版块的最后发表的主题为当前主题
		System.out.println(forum);
		forumDao.update(forum); //此处需要进行update
	}

	/**
	 * 根据id查询主题
	 */
	public Topic getById(Long id) {
		return topicDao.getById(id);
	}

	/**
	 * 分页查询
	 */
	public PageBean getPageBean(HQLHelper hh, int currentPage) {
		return topicDao.getPageBean(hh, currentPage);
	}
}
