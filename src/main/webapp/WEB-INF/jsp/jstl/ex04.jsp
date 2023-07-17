<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 포맷 라이브러리</title>
</head>
<body>
	<h3>문자열 앞뒤 공백 제거</h3>
	<c:set var="string3" value="    hello   " />
	<textarea>${string3}</textarea>
	<textarea>${fn:trim(string3)}</textarea>
</body>
</html>