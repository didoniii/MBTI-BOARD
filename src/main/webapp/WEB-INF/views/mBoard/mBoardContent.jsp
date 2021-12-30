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
		<h2 class="title">모두 모여라</h2>
		<table class="table">
			<tr>
				<th>No.</th>
				<td>${mboard.mbo_no }</td>
				<th colspan="2">제목</th>
				<td>${mboard.subject }</td>
				<th>작성일</th>
				<td>${mboard.regdate }</td>
			</tr>
			<tr>
				<th colspan="2">MBTI</th>
				<td>${mboard.mbti }</td>
				<th>좋아요</th>
				<td>${mboard.likes }</td>
				<th>조회수</th>
				<td>${mboard.r_count }</td>
			</tr>

			<tr>
				<th>내용</th>
				<td colspan="3">${mboard.img }${mboard.r_count }</td>
			</tr>
		</table>
		<a href="mBoardList.do?pageNum=" class="btn btn-info">목록</a>
		 <a href="mBoardUpdateForm.do?mbo_no=${mboard.mbo_no }"
			class="btn btn-warning">수정</a>
	</div>
</body>
</html>