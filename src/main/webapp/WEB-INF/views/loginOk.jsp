<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 확인</title>
</head>
<body>
   	<%
		int checkId = Integer.parseInt(request.getAttribute("checkIdFlag").toString()); //${checkIdFlag}
		int checkPw = Integer.parseInt(request.getAttribute("checkPwFlag").toString()); //${checkIdFlag}
		if(checkId == 0){
	%>
		<script language="JavaScript">
			alert("입력하신 아이디가 존재하지 않습니다. 다시 확인해 주세요.");
			history.go(-1);
		</script>
	<%
		}else if(checkPw == 0) {
	%>
		
			<script language="JavaScript">
			alert("비밀번호가 맞지 않습니다. 다시입력해주세요");
			history.go(-1);
		</script>
	<% 	
		}
	%>	
	
	<h2>로그인이 성공하셨습니다 .</h2>
	<h2>${mid}님 반갑습니다.</h2>
</body>
</html>