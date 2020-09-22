<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>login page</h1>
	<nav>
		<a href="/sts10/">page1</a>
		<a href="/sts10/emp/page2">page2</a>
		<a href="/sts10/dept/page3">page3</a>
		<a href="/sts10/page4">page4</a>
		<c:if test="${sessionScope.login }">
			${who }님이 로그인 중... <a href="./logout">[ logout ]</a>
		</c:if>
		<c:if test="${sessionScope.login eq null}">
			<a href="./login">[ login ]</a>
		</c:if>
	</nav>
	<div>
		<form action="result" method="post">
			<div>
				<label for="id">id</label>
				<input type="text" name="id" id="id" />
			</div>
			<div>
				<label for="pw">pw</label>
				<input type="text" name="pw" id="pw" />
			</div>
			<div>
				<button type="submit">로그인</button>
			</div>
		</form>
	</div>
</body>
</html>