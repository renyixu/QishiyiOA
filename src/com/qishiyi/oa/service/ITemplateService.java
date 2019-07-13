package com.qishiyi.oa.service;

import java.io.InputStream;
import java.util.List;

import com.qishiyi.oa.domain.PageBean;
import com.qishiyi.oa.domain.Template;
import com.qishiyi.oa.utils.HQLHelper;

public interface ITemplateService {
	public List<Template> findAll();
	public void save(Template model);
	public void delete(Long id);
	public Template getById(Long id);
	public void update(Template template);
	public InputStream getInputStreamById(Long id);
	public PageBean getPageBean(HQLHelper hh, int currentPage);
}
