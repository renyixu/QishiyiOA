package com.qishiyi.oa.dao;

import com.qishiyi.oa.base.IBaseDao;
import com.qishiyi.oa.domain.Forum;

public interface IForumManageDao extends IBaseDao<Forum>{
	public void  moveUp(Long id);
	public void moveDown(Long id);
}
