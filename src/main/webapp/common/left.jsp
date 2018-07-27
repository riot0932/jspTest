<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="col-sm-3 col-md-2 sidebar">
	<ul class="nav nav-sidebar">
		<li class="active"><a href="/jsp/main.jsp">메인화면</a></li>
		<li class="active"><a href="/boardManager">게시판 관리</a></li>
		
		<c:forEach items="${boardList}" var="vo" >
		<li class="active" method="get"><a href="/Board?boardName=${vo.BOARD_NM }&boardNumber=${vo.BOARD_NO}" >${vo.BOARD_NM }</a></li>
		</c:forEach>
		
		<li class="active"><a href="/freeBoard?page=1&pageSize=2">sample게시판</a></li>
	
	</ul>
</div>
