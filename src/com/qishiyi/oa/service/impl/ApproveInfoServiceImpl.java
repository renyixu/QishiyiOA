package com.qishiyi.oa.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.qishiyi.oa.dao.IApproveInfoDao;
import com.qishiyi.oa.domain.ApproveInfo;
import com.qishiyi.oa.service.IApproveInfoService;


/**
 * 审批操作
 */
@Service
@Transactional
public class ApproveInfoServiceImpl implements IApproveInfoService{
	@Resource
	private IApproveInfoDao approveInfoDao;

	/**根据申请id查询对应的审批集合
	 * 
	 */
	public List<ApproveInfo> findApproveInfoListByApplicationId(
			Long applicationId) {
		return approveInfoDao.findApproveInfoListByApplicationId(applicationId);
	}
}
