<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table>
			<tr>
				<th>id</th>
				<th>name</th>
				<th>phone</th>
			</tr>
			
			<c:forEach items="${count}" var="countVO">
			<tr>
				<td>${countVO.id}</td>
				<td>${countVO.name}</td>
				<td>${countVO.phone}</td>
			</tr>
		</c:forEach>	
	</table>
</body>
</html>