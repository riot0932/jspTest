<%@page import="kr.or.ddit.board.freeBoard.model.freeBoardVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>Jsp</title>

<script src="/js/jquery-1.12.4.js"></script>
<link href="/bootstrap/css/bootstrap.css" rel="stylesheet">
<!-- Bootstrap core CSS -->
<script src="/bootstrap/js/bootstrap.js"></script>
<!-- Custom styles for this template -->
<link href="/css/dashboard.css" rel="stylesheet">
<link href="/css/blog.css" rel="stylesheet">


</head>
<body>
	<!-- top.jsp -->
	<%@ include file="/common/top.jsp"%>

	<form action="/freeBoard" method="get" id="frm">
		<input type="hidden" name="id" id="id">
	</form>

	<div class="container-fluid">
		<div class="row">

			<!-- left.jsp -->
			<%@ include file="/common/left.jsp"%>

			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">

				<div class="row">
					<div class="col-sm-8 blog-main">
						<h2 class="sub-header">sample게시판</h2>
						<div class="table-responsive">
							<table class="table table-striped table-hover">
								<tr>
									<th>게시글 번호</th>
									<th>제목</th>
									<th>작성자 ID</th>
									<th>작성 일시</th>
								</tr>
								<c:forEach items="${list}" var="vo">

									<tr>
										<td>${vo.POSTS_NO }</td>
										<td>${vo.TITLE }</td>
										<td>${vo.CONTENT }</td>
										<td><fmt:formatDate value="${vo.WRITE_DATE }"
												pattern="yyyy-MM-dd" /></td>
									</tr>
								</c:forEach>
							</table>
						</div>

						<a href="/newPosts" class="btn btn-default pull-right"
							id="newPosts">새글 등록</a>

						<div class="text-center"></div>
						<ul class="pagination">
							<%=request.getAttribute("pageNavi")%>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>