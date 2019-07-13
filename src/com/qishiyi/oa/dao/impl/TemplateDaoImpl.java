package com.qishiyi.oa.dao.impl;

import java.io.File;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Repository;

import com.qishiyi.oa.base.BaseDaoImpl;
import com.qishiyi.oa.dao.ITemplateDao;
import com.qishiyi.oa.domain.Template;

/**
 * 模板管理
 */
@Repository
public class TemplateDaoImpl extends BaseDaoImpl<Template> implements
		ITemplateDao {

	/**
	 * 重写删除方法，删除模板对象时，删除对应的文件
	 */
	public void delete(Long id) {
		Template template = super.getById(id);
		String filePath = template.getFilePath();// 获得文件的存储路径
		super.delete(id);// 先删数据，如果数据不能删，那么就抛异常，自然而然，文件就不能删
	}

}
