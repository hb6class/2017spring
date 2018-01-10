<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Insert title here</title>
<link rel="apple-touch-icon" href="resources/img/logo.png">
<link rel="stylesheet" href="resources/css/jquery.mobile-1.4.5.css" />
<link rel="stylesheet" href="resources/css/custom.css" />
<script src="resources/js/jquery-1.12.4.min.js"></script>
<script src="resources/js/jquery.mobile-1.4.5.js"></script>
</head>
<body>
	<div data-role="page" id="main">
		<div data-role="header" data-theme="b">
			<h1>MAIN</h1>
		</div>
		<div data-role="content" >
			<a href="#p2" data-role="button"  data-theme="b">NEXT</a>
		</div>
		<div data-role="footer" data-position="fixed"  data-theme="b">
			<div data-role="navbar">
				<ul>
					<li><a data-icon="home" href="#">HOME</a></li>
					<li><a data-icon="grid" href="#">MENU</a></li>
					<li><a data-icon="info" href="#">INFO</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div data-role="page" id="p2"  data-theme="c">
		<div data-role="header" data-add-back-btn="true">
			<h1>PAGE 2</h1>
		</div>
		<div data-role="content">
			<ul data-role="listview">
				<li><a href="#">item 1</a></li>
				<li><a href="#">item 2</a></li>
				<li><a href="#">item 3</a></li>
				<li><a href="#">item 4</a></li>
			</ul>
		</div>
		<div data-role="footer" data-position="fixed">
			<div data-role="navbar">
				<ul>
					<li><a data-icon="home" href="#">HOME</a></li>
					<li><a data-icon="grid" href="#">MENU</a></li>
					<li><a data-icon="info" href="#">INFO</a></li>
				</ul>
			</div>
		</div>
	</div>
</body>
</html>












