package com.qishiyi.oa.dao;

import java.util.List;
import com.qishiyi.oa.base.IBaseDao;
import com.qishiyi.oa.domain.Reply;
import com.qishiyi.oa.domain.Topic;


public interface IReplyDao extends IBaseDao<Reply>{

	public List<Reply> getReplyByTopic(Topic model);

}
