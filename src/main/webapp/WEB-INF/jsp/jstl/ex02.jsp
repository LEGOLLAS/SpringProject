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
	<h1>조건문, 반복문</h1>
	<h2>if else if</h2>
	<%-- 몸무게가 70이하이면 프로틴, 80이하이면 달가슴살, 그게 아니면 다이어트 --%>
	
	<c:set var="weight" value="87"/>
	<c:choose>
		<c:when test="${weight <= 70 }">
			<h4>프로틴</h4>
		</c:when>
		<c:when test="${weight <= 80 }">
			<h4>닭가슴살</h4>
		</c:when>
		<c:otherwise>
			<h4>다이어트</h4>
		</c:otherwise>
	</c:choose>
	
	<h2>반복문</h2>
	
	<%-- for(int i =0; i<10; i++) --%>
	<c:forEach var="i" begin="0" end="9" step="1">
		${i}
	</c:forEach>
	
	<%-- 
	for(String fruit:fruitList)
	varStatus => 반복문의 상태값을 말한다
	 --%>
	<c:forEach var="fruit" items="${fruitList}" varStatus="status">
		<h4>${fruit} ::::: ${status.count} ::::: ${status.index } :::: ${status.first } ::::: ${status.last }</h4>
	</c:forEach>
	
	
</body>
</html>