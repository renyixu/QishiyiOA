<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Top</title>
   	<%@include file="/WEB-INF/jsp/public/header.jsp" %>
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/style/blue/top.css" />
</head>
<body class="PageBody" style="margin: 0">
	<div id="Head1">
		<div id="Logo">
			<a id="msgLink" href="javascript:void(0)"></a>
            <font color="#0000CC" style="color:#F1F9FE; font-size:28px; font-family:Arial Black, Arial">
            	骑士逸OA系统
            </font> 
        </div>
		
		<div id="Head1Right">
			<div id="Head1Right_UserName">
                <img border="0" width="13" height="14" src="${pageContext.request.contextPath }/style/images/top/user.gif" /> 您好，<b>${sessionScope.loginUser.name }</b>
			</div>
			<div id="Head1Right_UserDept"></div>
			<div id="Head1Right_UserSetup">
            	<a href="javascript:void(0)">
					<img border="0" width="13" height="14" src="${pageContext.request.contextPath }/style/images/top/user_setup.gif" /> 个人设置
				</a>
			</div>
			<div id="Head1Right_Time"></div>
		</div>
		
        <div id="Head1Right_SystemButton">
           <s:a target="_parent" action="user_logout" namespace="/">
				<img width="78" height="20" alt="退出系统" src="${pageContext.request.contextPath }/style/blue/images/top/logout.gif" />
			</s:a>
        </div>
		
        <div id="Head1Right_Button">
            <a target="desktop" href="javascript:void(0)">
				<img width="65" height="20" alt="显示桌面" src="${pageContext.request.contextPath }/style/blue/images/top/desktop.gif" />
			</a>
        </div>
	</div>
    
    <div id="Head2">
        <div id="Head2_Awoke">
            <ul id="AwokeNum">
                <li><a target="desktop" href="javascript:void(0)">
						<img border="0" width="11" height="13" src="${pageContext.request.contextPath }/style/images/top/msg.gif" /> 消息
						<span id="msg"></span>
					</a>
				</li>
                <li class="Line"></li>
                <li><a target="_blank" href="https://mail.163.com">
						<img border="0" width="16" height="11" src="${pageContext.request.contextPath }/style/images/top/mail.gif" /> 邮件
						<span id="mail"></span>
					</a>
				</li>
                <li class="Line"></li>
                <li><a href="javascript:void(0)">
                		<img border="0" width="12" height="14" src="${pageContext.request.contextPath }/style/images/top/wait.gif" /> 
                		待办事项
                	</a>
                </li>
                
                <li class="Line"></li>
                <li><a href="http://www.xurenyi.xyz" target="_blank">
                		<img border="0" width="12" height="14" src="${pageContext.request.contextPath }/style/images/top/text.gif" /> 
                		博客
                	</a>
                </li>
				  
                <li id="messageArea">欢迎使用本OA系统！</li>
            </ul>
        </div>
        
		<div id="Head2_FunctionList">
			<marquee style="WIDTH: 100%;" onMouseOver="this.stop()" onMouseOut="this.start()" 
				scrollamount=2 scrolldelay=30 direction=left>
				<b>欢迎使用骑士逸OA系统！</b>
			</marquee>
		</div>
	</div>

</body>
</html>
