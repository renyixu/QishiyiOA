package com.qishiyi.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qishiyi.oa.dao.IForumDao;
import com.qishiyi.oa.domain.Forum;
import com.qishiyi.oa.domain.PageBean;
import com.qishiyi.oa.service.IForumService;
import com.qishiyi.oa.utils.HQLHelper;


/**
 * 参与版块操作
 */
@Service
@Transactional
public class ForumServiceImpl implements IForumService{
	@Resource
	private IForumDao forumDao;
	public List<Forum> findAll() {
		return forumDao.findAll();
	}
	public Forum getById(Long id) {
		return forumDao.getById(id);
	}
	public PageBean getPageBean(HQLHelper hh, int currentPage) {
		return forumDao.getPageBean(hh, currentPage);
	}

}
