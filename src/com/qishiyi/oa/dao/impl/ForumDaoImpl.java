package com.qishiyi.oa.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.qishiyi.oa.base.BaseDaoImpl;
import com.qishiyi.oa.dao.IForumDao;
import com.qishiyi.oa.domain.Forum;

/**
 * 参与版块操作
 */
@Repository
@SuppressWarnings("unchecked")
public class ForumDaoImpl extends BaseDaoImpl<Forum> implements IForumDao{
	/**
	 * 查询板块列表，按照position属性进行排序
	 */
	public List<Forum> findAll() {
		String hql = "FROM Forum f ORDER BY f.position";
		return this.getSession().createQuery(hql).list();
	}

}
