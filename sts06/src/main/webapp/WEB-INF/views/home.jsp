<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>파일 업로드 페이지</h1>
	<form action="up" method="post" enctype="multipart/form-data">
	sabun<input type="text" name="sabun"/><br/>
	file<input type="file" name="file"/><br/>
	<button type="submit">전송</button>
	</form>
</body>
</html>