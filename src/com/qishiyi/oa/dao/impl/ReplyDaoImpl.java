package com.qishiyi.oa.dao.impl;

import java.util.List;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import com.qishiyi.oa.base.BaseDaoImpl;
import com.qishiyi.oa.dao.IReplyDao;
import com.qishiyi.oa.domain.Reply;
import com.qishiyi.oa.domain.Topic;


/**
 * 回复操作
 */
@Repository
@SuppressWarnings("unchecked")
public class ReplyDaoImpl extends BaseDaoImpl<Reply> implements IReplyDao{
	/**
	 * 根据主题查询对应的回复列表
	 */
	public List<Reply> getReplyByTopic(Topic model) {
		String hql = "FROM Reply r WHERE r.topic = ? ORDER BY r.postTime ASC";
		Query query = this.getSession().createQuery(hql);
		query.setParameter(0, model);
		return query.list();
	}


}
