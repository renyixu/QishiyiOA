package com.qishiyi.oa.action;

import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import javax.annotation.Resource;
import org.jbpm.api.ProcessDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.qishiyi.oa.service.IProcessDefinitionService;

/**
 * 流程定义管理
 */
@Controller
@Scope("prototype")
public class ProcessDefinitionAction extends ActionSupport {
	private File resource;// 用于文件上传
	private String key;// 属性驱动，流程定义的key
	private InputStream inputStream;// 用于文件下载的输入流
	private String id;// 属性驱动，流程定义的id
	@Resource
	private IProcessDefinitionService processDefinitionService;

	/**
	 * 查询流程定义列表
	 */
	public String list() {
		List<ProcessDefinition> list = processDefinitionService.findLastList();
		ActionContext.getContext().getValueStack().set("list", list);
		return "list";
	}

	/**
	 * 根据key删除流程定义
	 */
	public String delete() {
		try {
			key = new String(key.getBytes("iso-8859-1"), "utf-8");
			processDefinitionService.deleteByKey(key);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return "toList";
	}

	/**
	 * 跳转到流程定义部署页面
	 */
	public String addUI() {
		return "addUI";
	}

	/**
	 * 部署流程定义
	 */
	public String add() {
		// 使用上传的文件来部署流程定义
		processDefinitionService.deploy(resource);
		return "toList";
	}

	/**
	 * 查询流程图
	 */
	public String showImage() {
		try {
			id = new String(id.getBytes("ISO8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		inputStream = processDefinitionService.getImageInputStream(id);
		return "showImage";
	}

	public void setResource(File resource) {
		this.resource = resource;
	}

	public File getResource() {
		return resource;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

}
