<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글내용</title>
</head>
<body>
	<h2> 글 내용 보기</h2>
	<hr>
	<table width="500" border="1" cellspacing="0" cellpadding="0">
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
			<td>${content.fname }</td>
		
		</tr>
		<tr>
			<th>글제목</th>
			<td>${content.ftitle }</td>
		
		</tr>
		<tr>
			<th >내용</th>
			<td height="100" valign="top">${content.fcontent }</td>
		
		</tr>
		<tr>
			<th>등록일</th>
			<td>${content.fdate }</td>
		
		</tr>
		<tr>
			<td colspan="2" align="right">
				
				<input type="button" value="수정" onclick="javascript:window.location='mview?fnum=${content.fnum}'">
				<input type="button" value="삭제" onclick="javascript:window.location='delete?fnum=${content.fnum}'">
				<input type="button" value="목록" onclick="javascript:window.location='list'">
			</td>
		</tr>
		
	</table>
</body>
</html>