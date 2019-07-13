package com.qishiyi.oa.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qishiyi.oa.dao.ITemplateDao;
import com.qishiyi.oa.domain.PageBean;
import com.qishiyi.oa.domain.Template;
import com.qishiyi.oa.service.ITemplateService;
import com.qishiyi.oa.utils.HQLHelper;

/**
 * 模板管理
 */
@Service
@Transactional
public class TemplateServiceImpl implements ITemplateService {
	@Resource
	private ITemplateDao templateDao;

	/**
	 * 查询所有模板列表
	 */
	public List<Template> findAll() {
		return templateDao.findAll();
	}

	/**
	 * 保存模板对象
	 */
	public void save(Template model) {
		templateDao.save(model);
	}

	/**
	 * 根据id删除模板对象
	 */
	public void delete(Long id) {
		templateDao.delete(id);
	}

	/**
	 * 根据id查询模板对象
	 */
	public Template getById(Long id) {
		return templateDao.getById(id);
	}

	/**
	 * 修改模板实体
	 */
	public void update(Template template) {
		templateDao.update(template);
	}

	/**
	 * 根据模板id获取此模板对应的文件输入流
	 */
	public InputStream getInputStreamById(Long id) {
		Template template = templateDao.getById(id);
		String filePath = template.getFilePath();
		InputStream in = null;
		try {
			in = new FileInputStream(new File(filePath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return in;
	}

	public PageBean getPageBean(HQLHelper hh, int currentPage) {
		return templateDao.getPageBean(hh, currentPage);
	}

}
