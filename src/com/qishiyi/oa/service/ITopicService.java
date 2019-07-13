package com.qishiyi.oa.service;

import java.util.List;

import com.qishiyi.oa.domain.Forum;
import com.qishiyi.oa.domain.PageBean;
import com.qishiyi.oa.domain.Topic;
import com.qishiyi.oa.utils.HQLHelper;

public interface ITopicService {
	List<Topic> findTopicByForum(Forum model);
	public void save(Topic model);

	public Topic getById(Long id);
	PageBean getPageBean(HQLHelper hh, int currentPage);

}
