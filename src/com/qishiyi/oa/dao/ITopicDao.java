package com.qishiyi.oa.dao;

import java.util.List;
import com.qishiyi.oa.base.IBaseDao;
import com.qishiyi.oa.domain.Forum;
import com.qishiyi.oa.domain.Topic;

public interface ITopicDao extends IBaseDao<Topic>{
	public List<Topic> findTopicByForum(Forum model);
}
