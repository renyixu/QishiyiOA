package com.qishiyi.oa.service;

import java.util.List;

import com.qishiyi.oa.domain.PageBean;
import com.qishiyi.oa.domain.Reply;
import com.qishiyi.oa.domain.Topic;
import com.qishiyi.oa.utils.HQLHelper;


public interface IReplyService {

	public void save(Reply model);

	public List<Reply> getReplyByTopic(Topic model);

	public PageBean getPageBean(HQLHelper hh, int currentPage);

}
