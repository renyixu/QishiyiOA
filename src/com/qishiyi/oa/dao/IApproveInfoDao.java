package com.qishiyi.oa.dao;

import java.util.List;
import com.qishiyi.oa.base.IBaseDao;
import com.qishiyi.oa.domain.ApproveInfo;

public interface IApproveInfoDao extends IBaseDao<ApproveInfo>{

	public List<ApproveInfo> findApproveInfoListByApplicationId(Long applicationId);

}
