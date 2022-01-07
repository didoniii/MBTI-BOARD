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
	<div>
		<div>댓글</div>
		<div>
			<c:if test="${empty rpList }">
				<div>댓글이 없습니다.</div>
			</c:if>
			<c:if test="${not empty rpList }">
				<c:forEach var="reply" items="rpList">
					<div>
						<div>${reply.mbti }</div>
						<div>${reply.content }</div>
						<div>${reply.likes }</div>
						<div>${reply.report }</div>
						<div>${reply.report }</div>
						<a href = "replyDelete.do?re_no=${reply.re_no}" class="btn btn-danger">삭제</a>
					</div>
				</c:forEach>
			</c:if>
		</div>
		<div>
			<textarea rows="5" cols="100" placeholder="댓글 달기 ..."></textarea>
			<a href="replyInsert.do?mbo_no=${mbo_no }&id=${id}" class="btn btn-info">게시</a>
		</div>
	</div>
</body>
</html>