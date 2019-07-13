package com.qishiyi.oa.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.qishiyi.oa.base.BaseDaoImpl;
import com.qishiyi.oa.dao.IPrivilegeDao;
import com.qishiyi.oa.domain.Privilege;
/**
 * 权限管理
 */
@Repository
@SuppressWarnings("unchecked")
public class PrivilegeDaoImpl extends BaseDaoImpl<Privilege> implements IPrivilegeDao{
	/**
	 * 查询顶级权限列表
	 */
	public List<Privilege> findTopList() {
		String hql = "FROM Privilege p WHERE p.parent IS NULL";
		return this.getSession().createQuery(hql).list();
	}

	public List<String> findAllUrl() {
		String hql = "SELECT url FROM Privilege WHERE url IS NOT NULL";
		return this.getSession().createQuery(hql).list();
	}
	
	

}
