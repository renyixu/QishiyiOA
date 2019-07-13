package com.qishiyi.oa.service;

import java.util.List;
import com.qishiyi.oa.domain.Privilege;

public interface IPrivilegeService {
	public List<Privilege> findAll();
	public List<Privilege> getByIds(Long[] privilegeIds);
	public List<Privilege> findTopList();
	public List<String> findAllUrl();
}
