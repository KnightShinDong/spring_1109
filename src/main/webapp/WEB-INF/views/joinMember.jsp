<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>

	<h2>회원 가입</h2>
	<hr>
	<table width="600" border="1" cellspacing="0" cellpadding="0">
      <form action="joinOk" method="post">
	      <tr height="40">
	         <th align="center" bgcolor="pink">
	            아이디 
	         </th>
	         <td>
	            <input type="text" name="mid" size="60">
	         </td>
	      </tr>
	      
	      <tr height="40">
	         <th align="center" bgcolor="pink">
	            비밀번호 
	         </th>
	         <td>
	            <input type="password" name="mpw" size="60">
	         </td>
	      </tr>
	      
	      <tr height="40">
	         <th align="center" bgcolor="pink">
	            회원 이름 
	         </th>
	         <td>
	            <input type="text" name="mname" size="60">
	         </td>
	      </tr>
	      
	      <tr height="40">
	         <th align="center" bgcolor="pink">
	            회원 이메일 :
	         </th>
	         <td>
	            <input type="text" name="memail" size="60">
	         </td>
	      </tr>
	      <tr height="40"> 
	         <td colspan="4">
	            <input type="submit" value="회원가입">
	            <input type="reset" value="취소"> 
	         </td>
	      </tr>
      </form>
   </table>

</body>
</html>