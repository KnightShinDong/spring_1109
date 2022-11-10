<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 글 내용 수정</title>
</head>
<body>
	<h2> 글 내용 보기</h2>
	<hr>
	<table width="500" border="1" cellspacing="0" cellpadding="0">
		<form action="modify">
		<input type="hidden" name="fnum" value="${content.fnum }">
		<tr>
			<th with="100">아이디</th>
			<td >
			 ${content.fid }
			</td>
		
		</tr>
		<tr>
			<th with="100">글번호</th>
			<td >
			 ${content.fnum }
			</td>
		
		</tr>
		<tr>
			<th>조회수</th>
			<td>${content.fhit }</td>
		
		</tr>
		<tr>
			<th>글쓴이</th>
			<td>${content.fname } </td>
		
		</tr>
		<tr>
			<th>글제목</th>
			<td><input type="text" name="ftitle" value="${content.ftitle }"> </td>
		
		</tr>
		<tr>
			<th >내용</th>
			<td height="100"  valign="top">
			<textarea rows="10" cols="40" name="fcontent">${content.fcontent }</textarea>
			</td>
		
		</tr>
		<tr>
			<th>등록일</th>
			<td>${content.fdate }</td>
		
		</tr>
		<tr>
			<td colspan="2" align="right">
				
				<input type="submit" value="수정" >
				<input type="button" value="삭제" onclick="javascript:window.location='delete?fnum=${content.fnum}'">
				<input type="button" value="목록" onclick="javascript:window.location='list'">
			</td>
		</tr>
	</form>	
	</table>

</body>
</html>