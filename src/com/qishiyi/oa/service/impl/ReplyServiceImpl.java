package com.qishiyi.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qishiyi.oa.dao.IForumDao;
import com.qishiyi.oa.dao.IReplyDao;
import com.qishiyi.oa.dao.ITopicDao;
import com.qishiyi.oa.domain.Forum;
import com.qishiyi.oa.domain.PageBean;
import com.qishiyi.oa.domain.Reply;
import com.qishiyi.oa.domain.Topic;
import com.qishiyi.oa.service.IReplyService;
import com.qishiyi.oa.utils.HQLHelper;


/**
 * 回复操作
 */
@Service
@Transactional
public class ReplyServiceImpl implements IReplyService{
	@Resource
	private IReplyDao replyDao;
	@Resource
	private IForumDao forumDao;
	@Resource
	private ITopicDao topicDao;
	
	/**
	 * 发表回复
	 */
	public void save(Reply model) {
		replyDao.save(model);
		Forum forum = model.getTopic().getForum();//持久对象
		forum.setArticleCount(forum.getArticleCount() + 1);//版块的文章数量加1
		Topic topic = model.getTopic();//持久对象
		topic.setLastUpdateTime(model.getPostTime());//回复对应的主题的最后更新时间为回复时间
		topic.setLastReply(model);//主题的最后一个回复为当前回复
		topic.setReplyCount(topic.getReplyCount() + 1);//回复数量加1
		forumDao.update(forum);
		topicDao.update(topic);
	}

	/**
	 * 根据主题查询对应的回复列表
	 */
	public List<Reply> getReplyByTopic(Topic model) {
		return replyDao.getReplyByTopic(model);
	}

	/**
	 * 分页查询
	 */
	public PageBean getPageBean(HQLHelper hh, int currentPage) {
		return replyDao.getPageBean(hh, currentPage);
	}

}
