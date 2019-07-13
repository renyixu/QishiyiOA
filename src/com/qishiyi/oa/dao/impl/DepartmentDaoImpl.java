package com.qishiyi.oa.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.qishiyi.oa.base.BaseDaoImpl;
import com.qishiyi.oa.dao.IDepartmentDao;
import com.qishiyi.oa.domain.Department;



/**
 * 部门管理
 */
@Repository
@SuppressWarnings("unchecked")
public class DepartmentDaoImpl extends BaseDaoImpl<Department> implements IDepartmentDao{

	/**
	 * 查询顶级部门列表
	 */
	public List<Department> findTopList() {
		String hql = "FROM Department d WHERE d.parent IS NULL";
		return this.getSession().createQuery(hql).list();
	}

	/**
	 * 查询指定部门的子部门列表
	 */
	public List<Department> findChildren(Long parentId) {
		String hql = "FROM Department d WHERE d.parent.id = ?";
		return this.getSession().createQuery(hql).setParameter(0, parentId).list();
	}

}
