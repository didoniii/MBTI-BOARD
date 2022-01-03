<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2 class="title">게시글 수정</h2>
		<form action = "mBoardUpdate.do" method="post" name= "frm">
		<input type="hidden" name="pageNum" value="${pageNum}">
		<input type="hidden" name="mbo_no" value="${mboard.mbo_no}">
		<input type="hidden" name="id" value="${mboard.id }">
			<table class="table">
				<tr>
					<th>MBTI</th><td>${mboard.mbti }</td>
				</tr>
				<tr>
					<th>제목</th><td><input type="text" name="subject" required="required"
						autofocus="autofocus" value="${mboard.subject }"></td>
				</tr>
				<tr>
					<th>내용</th><td><textarea rows="20" cols="130" name="content" required="required">${mboard.content }</textarea>
				</tr>
				<tr>
					<th>첨부파일</th><td><input type="file" name="img" value ="${mboard.img }"multiple="multiple">
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" class="btn btn-warning" value="수정"></td>
				</tr>
			
			</table>
		</form>
	</div>
</body>
</html>