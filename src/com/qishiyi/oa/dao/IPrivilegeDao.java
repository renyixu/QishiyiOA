package com.qishiyi.oa.dao;

import java.util.List;

import com.qishiyi.oa.base.IBaseDao;
import com.qishiyi.oa.domain.Privilege;

public interface IPrivilegeDao extends IBaseDao<Privilege> {
	public List<Privilege> findTopList();

	public List<String> findAllUrl();

}
