package com.qishiyi.oa.base;

import java.util.List;

import com.qishiyi.oa.domain.PageBean;
import com.qishiyi.oa.utils.HQLHelper;



/**
 * 通用Dao接口
 */
public interface IBaseDao<T> {
	/**
	 * 添加
	 */
	public void save(T entity);
	
	/**
	 * 根据id删除
	 */
	public void delete(Long id);
	
	/**
	 * 根据id修改
	 */
	public void update(T entity);
	
	public void merge(T entity);
	
	/**
	 * 根据id查询
	 */
	public T getById(Long id);
	
	/**
	 * 一次查询多个对象
	 */
	public List<T> getByIds(Long[] ids);
	
	/**
	 * 查询所有
	 */
	public List<T> findAll();
	
	/**
	 * 公共分页方法
	 */
	public PageBean getPageBean(HQLHelper hh,int currentPage);
}
