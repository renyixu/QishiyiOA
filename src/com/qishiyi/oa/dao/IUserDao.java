package com.qishiyi.oa.dao;

import com.qishiyi.oa.base.IBaseDao;
import com.qishiyi.oa.domain.User;


public interface IUserDao extends IBaseDao<User> {

	public int findByLoginName(String loginName);
	public User login(User model);
}
