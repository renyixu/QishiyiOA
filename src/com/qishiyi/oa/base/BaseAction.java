package com.qishiyi.oa.base;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
import com.qishiyi.oa.domain.User;
import com.qishiyi.oa.service.IDepartmentService;
import com.qishiyi.oa.service.IForumManageService;
import com.qishiyi.oa.service.IForumService;
import com.qishiyi.oa.service.IPrivilegeService;
import com.qishiyi.oa.service.IProcessDefinitionService;
import com.qishiyi.oa.service.IReplyService;
import com.qishiyi.oa.service.IRoleService;
import com.qishiyi.oa.service.ITemplateService;
import com.qishiyi.oa.service.ITopicService;
import com.qishiyi.oa.service.IUserService;

/**
 * 通用父类Action
 */
public class BaseAction<T> extends ActionSupport implements ModelDriven<T>{
	@Resource
	protected IRoleService roleService;
	@Resource
	protected IDepartmentService departmentService;
	@Resource
	protected IUserService userService;
	@Resource
	protected IPrivilegeService privilegeService;
	@Resource
	protected IForumManageService forumManageService;
	@Resource
	protected IForumService forumService;
	@Resource
	protected ITopicService topicService;
	@Resource
	protected IReplyService replyService;
	@Resource
	protected ITemplateService templateService;
	@Resource
	protected IProcessDefinitionService processDefinitionService;
	
	//在构造方法中获得model类型
	public BaseAction(){
		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();//父类Action类型
		Type[] types = type.getActualTypeArguments();
		Class<T> clazz = (Class<T>) types[0];
		try {
			model = clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	protected T model;

	public T getModel() {
		return model;
	}
	
	/**
	 * 获得值栈
	 * @return
	 */
	protected ValueStack getValueStack(){
		return ActionContext.getContext().getValueStack();
	}
	
	/**
	 * 获得客户端的ip地址
	 */
	public String getIpAddress(){
		return ServletActionContext.getRequest().getRemoteAddr();
	}
	
	/**
	 * 获得当前登录用户
	 */
	public User getLoginUser(){
		return (User) ServletActionContext.getRequest().getSession().getAttribute("loginUser");
	}
	
	//--
	protected int currentPage = 1;//属性驱动，当前页码

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
}
