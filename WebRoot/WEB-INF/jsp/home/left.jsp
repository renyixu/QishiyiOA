<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
<title>left</title>
<%@include file="/WEB-INF/jsp/public/header.jsp"%>
<script language="JavaScript"
	src="${pageContext.request.contextPath }/script/menu.js"></script>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath }/style/blue/menu.css" />
</head>
<body style="margin: 0">
	<div id="Menu">
		<ul id="MenuUl">
			<s:iterator value="#application.privilegeTopList">
			<!-- 从Session中获取登录用户，根据用户的角色最终获取对应的权限，判断此权限是否和当前循环出的权限是否一致，如果一致就显示 -->
		    <!-- 使用OGNL调用对象的方法 -->
			<s:if test="#session.loginUser.hasPrivilegeByName(name)">
				<li class="level1">
					<div onClick="menuClick(this);" class="level1Style">
						<img
							src="${pageContext.request.contextPath }/style/images/MenuIcon/${id }.gif"
							class="Icon" /> ${name }
					</div> <s:iterator value="children">
					<s:if test="#session.loginUser.hasPrivilegeByName(name)">
						<ul style="display: none;" class="MenuLevel2">
							<li class="level2">
								<div class="level2Style">
									<img
										src="${pageContext.request.contextPath }/style/images/MenuIcon/menu_arrow_single.gif" />
									<a target="right"
										href="${pageContext.request.contextPath }${url}.do">${name }</a>
								</div>
							</li>
						</ul>
						</s:if>
					</s:iterator>	
				</li>
				</s:if>
			</s:iterator>
			
			 <li class="level1">
            <div onClick="menuClick(this);" class="level1Style"><img src="style/images/MenuIcon/FUNC20076.gif" class="Icon" /> 实用工具</div>
            <ul style="display: none;" class="MenuLevel2">
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> <a target="_blank" href="http://www.taobao.com">购物网站</a></div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> <a target="_blank" href="http://qq.ip138.com/train/">火车时刻</a></div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> <a target="_blank" href="http://www.airchina.com.cn/">飞机航班</a></div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> <a target="_blank" href="http://www.ip138.com/post/">邮编/区号</a></div>
                </li>
            </ul>
        </li>
			
			<li class="level1">
            <div onClick="menuClick(this)" class="level1Style"><img src="style/images/MenuIcon/FUNC20001.gif" class="Icon" />个人办公</div>
            <ul style="display: none;" class="MenuLevel2">
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> 个人考勤</div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> 日程安排</div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> 工作计划</div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> 工作日记</div>
                </li>
                <li class="level2">
                	<div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> 通讯录</div>
                </li>
            </ul>
        </li>
        
        <li class="level1">
            <div onClick="menuClick(this);" class="level1Style"><img src="style/images/MenuIcon/FUNC20070.gif" class="Icon" /> 综合行政</div>
            <ul style="display: none;" class="MenuLevel2">
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> 考勤管理</div>
                </li>
                <li class="level2">
                    <div onClick="subMenuClick(this);" class="level2Style"><img src="style/images/MenuIcon/menu_arrow_close.gif" /> 会议管理</div>
                    <ul style="display: none;" class="MenuLevel2">
                        <li class="level3Head">会议申请</li>
                        <li class="level33">暂存会议查询</li>
                        <li class="level33">待我参加会议</li>
                        <li class="level33">我已参加会议</li>
                        <li class="level33">新建会议纪要</li>
                        <li class="level33">会议纪要查询</li>
                        <li class="level33">待开会议查询</li>
                        <li class="level33">已开会议查询</li>
                        <li class="level33">会议室设置</li>
                        <li class="level32">会议类型设置</li>
                    </ul>
                </li>
                <li class="level2">
                    <div onClick="subMenuClick(this);" class="level2Style"><img src="style/images/MenuIcon/menu_arrow_close.gif" /> 车辆管理</div>
                    <ul style="display: none;" class="MenuLevel2">
                        <li class="level3Head">用车申请</li>
                        <li class="level33">派车管理</li>
                        <li class="level33">我的申请记录</li>
                        <li class="level33">车辆状态</li>
                        <li class="level33">车辆档案</li>
                        <li class="level32">私车公用</li>
                    </ul>
                </li>
            </ul>
        </li>
        
         <li class="level1">
            <div onClick="menuClick(this);" class="level1Style"><img src="style/images/MenuIcon/FUNC261000.gif" class="Icon" /> 人力资源</div>
            <ul style="display: none;" class="MenuLevel2">
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> 档案管理</div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> 培训记录</div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> 奖惩记录</div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> 职位变更</div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> 人事合同</div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> 类别维护</div>
                </li>
            </ul>
        </li>
        
        <li class="level1">
            <div onClick="menuClick(this);" class="level1Style"><img src="style/images/MenuIcon/FUNC20077.gif" class="Icon" /> 个人设置</div>
            <ul style="display: none;" class="MenuLevel2">
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" />个人信息</div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> 密码修改</div>
                </li>
            </ul>
        </li>
			
			
		</ul>
	</div>
</body>
</html>
