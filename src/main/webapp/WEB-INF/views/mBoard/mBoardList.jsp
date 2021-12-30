<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2 class = "title">모두 모여라</h2>
		<table class="table">
			<tr>
				<th>No.</th>
				<th>제목</th>
				<th>MBTI</th>
				<th>작성일</th>
				<th>좋아요</th>
				<th>조회수</th>
			</tr>
			
			<c:if test="${empty mbList }">
				<tr>
					<th colspan="6">등록된 게시글이 없습니다.</th>
				</tr>
			</c:if>
			<c:if test="${not empty mbList }">
				<c:forEach var="mboard" items="${mbList }">
					<tr>
						<c:if test="${mboard.del == 'N' }">
							<td>${mboard.mbo_no }</td>
							<td><a href="mBoardContent.do?mbo_no=${mboard.mbo_no }">${mboard.subject }></a></td>
							<td>${mboard.mbti }</td>
							<td>${mboard.regdate }</td>
							<td>${mboard.likes }</td>
							<td>${mboard.r_count }</td>
						</c:if>
					</tr>
				</c:forEach>
			</c:if>
				<tr>
					<th colspan="6" class="text-ceneter">
						<div align = "right">
							<a href = "mBoardInsertForm.do?pageNum=1" class="btn btn-warning">게시글 등록</a>
						</div>
					</th>
				</tr>
		</table>
	</div>

</body>
</html>