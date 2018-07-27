<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

<title>게시판</title>

<!-- Bootstrap core CSS -->
<link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="/css/signin.css" rel="stylesheet">

<%@ include file="/common/jquery.jsp"%>


</head>

	<form class="form-signin" action="/login" method="post">

		<label for="userId" class="sr-only">userId</label> 
		<input type="text" id="userId" name="userId" class="form-control"placeholder="Email address" required autofocus value="${param.userId}"> 
		
		<label for="password" class="sr-only">Password</label> 
		<input type="password" id="password" name="password" class="form-control" placeholder="Password" required>

		<button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
	</form>

</body>
</html>
