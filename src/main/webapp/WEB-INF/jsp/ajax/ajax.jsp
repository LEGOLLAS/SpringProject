<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<div id="nameDiv">sdsds</div>
	
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>

	<script>
	    $.ajax({
	        type:"GET",
	        url:"/jsp/ajax/ajax.jsp",
	        dataType:"JSON", 
	        data: {"name":"boram", "nickname":"marobiana"},
	        success : function(data) {
	            // 통신 성공시 함수 수행. data에 response 값이 들어있다.
	        },
	        complete : function(data) {
	            // 통신이 성공했거나 실패해도 완료되면 함수 수행
	        },
	        error : function(xhr, status, error) {
	            // 통신 후 에러 발생시 함수 수행
	        }
	    });
	</script>
</body>
</html>