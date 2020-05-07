<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<style>

</style>
<script type="text/javascript"></script>
</head>
<body>
<h1>
	&lt;context-param&gt; 에 설정된 정보 확인하기<p>
	메세지: <%=application.getInitParameter("message") %><p>
	나이: <%=application.getInitParameter("age") %><p>
</h1>
</body>
</html>