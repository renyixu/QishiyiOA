<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link rel="icon" href="${pageContext.request.contextPath }/style/images/oa.ico">
<title>骑士逸OA系统</title>
<%@include file="/WEB-INF/jsp/public/header.jsp"%>
</head>
<frameset rows="100,*,25" framespacing="0" border="0" frameborder="0">
	<frame src="${pageContext.request.contextPath }/home_top.do"
		name="TopMenu" scrolling="no" noresize />
	<frameset cols="180,*" id="resize">
		<frame noresize name="menu"
			src="${pageContext.request.contextPath }/home_left.do"
			scrolling="yes" />
		<frame noresize name="right"
			src="${pageContext.request.contextPath }/home_right.do"
			scrolling="yes" />
	</frameset>
	<frame noresize name="status_bar" scrolling="no"
		src="${pageContext.request.contextPath }/home_bottom.do" />
</frameset>
<noframes>
</noframes>
</html>
