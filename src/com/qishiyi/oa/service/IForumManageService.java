package com.qishiyi.oa.service;

import java.util.List;

import com.qishiyi.oa.domain.Forum;
import com.qishiyi.oa.domain.PageBean;
import com.qishiyi.oa.utils.HQLHelper;

public interface IForumManageService {
	public List<Forum> findAll();
	public void delete(Forum model);
	public void save(Forum model);
	public Forum getById(Long id);
	public void update(Forum forum);
	public void moveUp(Long id);
	public void moveDown(Long id);
	public PageBean getPageBean(HQLHelper hh, int currentPage);

}
