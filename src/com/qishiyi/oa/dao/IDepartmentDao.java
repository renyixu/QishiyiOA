package com.qishiyi.oa.dao;

import java.util.List;

import com.qishiyi.oa.base.IBaseDao;
import com.qishiyi.oa.domain.Department;


public interface IDepartmentDao extends IBaseDao<Department>{

	public List<Department> findTopList();

	public List<Department> findChildren(Long parentId);

}
