<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div id=PageSelectorBar>
	<div id=PageSelectorMemo>页码${currentPage }/${pageCount } &nbsp;
		每页${pageSize }条记录 &nbsp; 总共${recordCount }条记录</div>
	<div id=PageSelectorSelectorArea>
		<c:if test="${currentPage==1 }">第一页</c:if>
		<c:if test="${currentPage!=1 }">
		<a href="#" onclick="gotoPageNum(1)" title="首页" style="cursor: hand;">
			第一页
		</a>
		</c:if>
		
		<!-- 上一页 -->
		<c:if test="${currentPage==1 }">&lt;&lt;上一页</c:if>
		<c:if test="${currentPage!=1 }">
		<a href="#" onclick="gotoPageNum(${currentPage-1})">&lt;&lt;上一页</a>
		</c:if>
		
		<!-- 下一页 -->
		<c:if test="${currentPage==pageCount }">下一页&gt;&gt;</c:if>
		<c:if test="${currentPage!=pageCount }">
		<a href="#" onclick="gotoPageNum(${currentPage+1})">下一页&gt;&gt;</a>
		</c:if>
		
		<c:if test="${currentPage==pageCount }">尾页</c:if>
		<c:if test="${currentPage!=pageCount }">
		<a href="#" onclick="gotoPageNum(${pageCount})" title="尾页"
			style="cursor: hand;"> 
			尾页
			</a>
		</c:if>
		跳转到 <select id="pages" onchange="gotoPageNum(this.value)">
			<s:iterator begin="1" end="pageCount" var="s">
				<option value='<s:property value="#s"/>'>
					<s:property value="#s" />
				</option>
			</s:iterator>
		</select>
		<script type="text/javascript">
					$("#pages").val(${currentPage});
				</script>
	</div>
</div>

<script type="text/javascript">
			function gotoPageNum(pageNum){
				//动态添加一个隐藏输入框，传递页码
				$("#pageForm").append('<input type="hidden" value="'+pageNum+'" name="currentPage"/>');
				$("#pageForm").submit();
			}
		</script>
