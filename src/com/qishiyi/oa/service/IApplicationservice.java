package com.qishiyi.oa.service;

import java.io.InputStream;

import com.qishiyi.oa.domain.Application;
import com.qishiyi.oa.domain.PageBean;
import com.qishiyi.oa.utils.HQLHelper;


public interface IApplicationservice {

	public PageBean getPageBean(HQLHelper hh, int currentPage);

	public InputStream getInputStreamById(Long applicationId);

	public Application getById(Long applicationId);

}
