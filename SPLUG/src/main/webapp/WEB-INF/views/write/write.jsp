<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<title>글쓰기</title>
<%@ include file="../naviBar.jsp"%>
<%@ include file="wHeader.jsp"%>

</head>
<body>
	<div id="wrapper">
		<div id="page-wrapper">

			<br> <br>
			<br>
			<br>

			<div class="alert alert-info">${where}글쓰기</div>
			<!-- /.row -->
			<br>
			
			
			<form action="writeContent" method="post">
				<input name="title" class="form-control" placeholder="제목을 입력하세요">
				<textarea name="contents" id="summernote"></textarea>
				<br>
				<button type="submit" class="btn btn-primary">작성완료</button>


			</form>
			
			
			<br>
			<br>
			<br>
		</div>
	</div>





	<script>
				$(document).ready(function() {
					$('#summernote').summernote({
						height : 400, // 에디터의 높이 
						minHeight : null,
						maxHeight : null,
						focus : true,
						lang : 'ko-KR' // 기본 메뉴언어 US->KR로 변경
					});
				});
			</script>
</body>
</html>
