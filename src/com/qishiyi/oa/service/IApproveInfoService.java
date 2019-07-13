package com.qishiyi.oa.service;

import java.util.List;
import com.qishiyi.oa.domain.ApproveInfo;

public interface IApproveInfoService {

	public List<ApproveInfo> findApproveInfoListByApplicationId(Long applicationId);

}
