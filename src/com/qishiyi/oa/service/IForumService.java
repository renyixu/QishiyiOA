package com.qishiyi.oa.service;

import java.util.List;

import com.qishiyi.oa.domain.Forum;
import com.qishiyi.oa.domain.PageBean;
import com.qishiyi.oa.utils.HQLHelper;

public interface IForumService {
	public List<Forum> findAll();
	public Forum getById(Long id);
	public PageBean getPageBean(HQLHelper hh, int currentPage);
}
