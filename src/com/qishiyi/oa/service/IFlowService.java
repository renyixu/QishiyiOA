package com.qishiyi.oa.service;

import java.util.List;
import com.qishiyi.oa.domain.Application;
import com.qishiyi.oa.domain.ApproveInfo;
import com.qishiyi.oa.domain.TaskView;
import com.qishiyi.oa.domain.User;

public interface IFlowService {
	public void submit(Application app);
	public List<TaskView> findTaskList(User currentUser);
	public void approve(ApproveInfo ai, String taskId);
}
