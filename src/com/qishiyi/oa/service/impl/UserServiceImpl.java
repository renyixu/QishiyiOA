package com.qishiyi.oa.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.qishiyi.oa.dao.IUserDao;
import com.qishiyi.oa.domain.PageBean;
import com.qishiyi.oa.domain.User;
import com.qishiyi.oa.service.IUserService;
import com.qishiyi.oa.utils.HQLHelper;
import com.qishiyi.oa.utils.MD5Utils;

/**
 * 用户管理
 */
@Service
@Transactional
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;

	/**
	 * 查询所有用户列表
	 */
	public List<User> findAll() {
		return userDao.findAll();
	}

	/**
	 * 根据id删除用户
	 */
	public void delete(User model) {
		userDao.delete(model.getId());
	}

	public void save(User model) {
		model.setPassword(MD5Utils.md5("1234")); //为新用户指定默认密码1234
		userDao.save(model);
	}

	/**
	 * 根据id查询用户
	 */
	public User getById(Long id) {
		return userDao.getById(id);
	}

	/**
	 * 根据id修改用户
	 */
	public void update(User user) {
		userDao.update(user);
	}

	/**
	 *根据登录名查询
	 */
	public int findByLoginName(String loginName) {
		return userDao.findByLoginName(loginName);
	}
	/**
	 * 用户登录
	 */
	public User login(User model) {
		return userDao.login(model);
	}

	/**
	 * 分页查询
	 */
	public PageBean getPageBean(HQLHelper hh, int currentPage) {
		return userDao.getPageBean(hh, currentPage);
	}
}
