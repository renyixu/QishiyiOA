package com.qishiyi.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qishiyi.oa.dao.IPrivilegeDao;
import com.qishiyi.oa.domain.Privilege;
import com.qishiyi.oa.service.IPrivilegeService;

/**
 * 权限管理
 */
@Service
@Transactional
public class PrivilegeServiceImpl implements IPrivilegeService{
	@Resource
	private IPrivilegeDao privilegeDao;
	
	/**
	 * 查询所有权限列表
	 */
	public List<Privilege> findAll() {
		return privilegeDao.findAll();
	}

	/**
	 * 根据id数组查询多个权限
	 */
	public List<Privilege> getByIds(Long[] privilegeIds) {
		return privilegeDao.getByIds(privilegeIds);
	}

	/**
	 * 查询顶级权限列表
	 */
	public List<Privilege> findTopList() {
		return privilegeDao.findTopList();
	}

	/**
	 * 查询所有权限对应的URL
	 */
	public List<String> findAllUrl() {
		return privilegeDao.findAllUrl();
	}

}
