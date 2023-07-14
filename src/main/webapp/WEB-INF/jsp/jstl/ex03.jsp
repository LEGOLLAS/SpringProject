<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 포맷 라이브러리</title>
</head>
<body>
	<h1>JSTL 포맷 라이브러리</h1>
	
	<h3>숫자출력</h3>
	<c:set var="number" value="12345678"/>
	<h4><fmt:formatNumber value="${number}" /></h4>
	<hr>
	
	<h3>퍼센트</h3>
	<h4><fmt:formatNumber value="0.43" type="percent" /></h4>
	<h4><fmt:formatNumber value="${2/6 }" type="percent" /></h4>
	<hr>
	
	<h3>통화</h3>
	<h4><fmt:formatNumber value="${number }" type="currency" /></h4>
	<h4><fmt:formatNumber value="${number }" type="currency" currencySymbol="$" /></h4>
	<hr>
	
	<h3>소수점 표현</h3>
	<c:set var="pi" value="3.14158343764"/>
	<h4>${pi}</h4>
	<h4><fmt:formatNumber value="${pi }" pattern="#.##"/></h4>
	<h4><fmt:formatNumber value="${pi }" pattern="0.00000000000000000000"/> </h4>
	<h4><fmt:formatNumber value="${pi }" pattern="#.#####################"/></h4>
	<h4><fmt:formatNumber value="${pi }" pattern="#.##" var="pi2"/></h4>
	<h4>${pi2 }</h4>
	<hr>
	
	<h3>날짜 포맷</h3>
	<h4><fmt:formatDate value="${now }" pattern="yyyy년 MM월 dd일 mm분 ss초"/>  </h4>
	
	<%-- 2023/07/14 20:53:12 --%>
	<%-- 2023/07/14 08:53:12 --%>
	
	<%-- String -> Date -> String --%>
	<fmt:parseDate value="${dateString }" var="date" pattern="yyyy/MM/DD HH:mm:ss" />
	<h4>${date }</h4>
	
	<hr>
</body>
</html>