package com.qishiyi.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qishiyi.oa.dao.IDepartmentDao;
import com.qishiyi.oa.domain.Department;
import com.qishiyi.oa.service.IDepartmentService;



/**
 * 部门管理
 */
@Service
@Transactional
public class DepartmentServiceImpl implements IDepartmentService{
	@Resource
	private IDepartmentDao departmentDao;
	
	public List<Department> findAll() {
		return departmentDao.findAll();
	}

	public void delete(Department model) {
		departmentDao.delete(model.getId());
	}

	public Department getById(Long parentId) {
		return departmentDao.getById(parentId);
	}

	public void save(Department model) {
		departmentDao.save(model);
	}

	public void update(Department dept) {
		departmentDao.update(dept);
	}

	public List<Department> findTopList() {
		// TODO Auto-generated method stub
		return departmentDao.findTopList();
	}

	public List<Department> findChildren(Long parentId) {
		return departmentDao.findChildren(parentId);
	}

}
