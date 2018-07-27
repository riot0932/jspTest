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

	<div class="container-fluid">
		<div class="row">

			<!-- left.jsp -->
			<%@ include file="/common/left.jsp"%>

			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<form action="/newBoard" method="post">
					<input type="hidden" name="id" value="${userVo.STD_ID}">
					<tr>
						<td>게시판 이름</td>
						<td><input type="text" name="boardName" ></td>
						<td><select id="selectbox" name="selectValue">
								<option value="1">사용</option>
								<option value="0">미사용</option>
						</select></td>
					</tr>
						<input type="submit" id="newBoard" value="생성">
				</form>
				<td>━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━</td>
				<br>
				<br>
				<br>
				<tr>
				<c:forEach items="${boardList}" var="vo">
					<form action="/updateBoard" method="post">
						<td>게시판 이름</td>
						<td>
							<input type="text" name="updateBoardName" value="${vo.BOARD_NM }"> 
							<input type="hidden" name="boardNo" value="${vo.BOARD_NO }">
							<select	id='selectbox' name="updateSelectValue">
								<option value="1">사용</option>
								<option value="0">미사용</option>
							</select>
						</td>
						<input type="submit" value="수정"> <br>
						<br>
						</form>
					</c:forEach>
				</tr>

			</div>
		</div>
	</div>
</body>
</html>
