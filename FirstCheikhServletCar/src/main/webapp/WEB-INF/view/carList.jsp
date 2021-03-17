<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h> Welcome carList </h1>
<c:forEach items="${cheikh}" var="dan">

<h1>${dan.year} ${dan.mark} ${dan.model} - <a =href="/delete.do?id=${dan.id}"> Delete</a></h1>
</body>
</html>