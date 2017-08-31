<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="include/header.jsp"%>
<%@include file="include/left_menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>News</title>
<style>
#container {
	width: 960px;
	margin: 0 auto;
	text-align: center;

}


.main-navbar-fixed-top {
  position: fixed;
  top: 0;
  right: 0;
  left: 0;
  height: 42px; 
  background-color: #9A8781;
  }
  
  .main-sidebar {
  position: fixed;
  top: 0;
  bottom: 0;
  background-color: #9A8781;
  font-size:14px;
  color: #0C0330;
  width: 300px; }
  
  .main-sidebar a:before{
  color: #0C0330;
  }
  
  
.nav nav-tabs {
	list-style: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
}
/* Float the list items side by side */
.nav nav-tabs li {
	float: left;
	width: 300px;
}
/* Style the links inside the list items */
.nav nav-tabs li a {
	display: inline-block;
	color: #9A8781;
	text-align: center;
	text-decoration: none;
	padding: 20px 20px;
	font-size: 20px;
	transition: 0.3s;
}
/* Style the tab content */
.nav nav-tabscontent {
	display: none;
	background-color: #9A8781;
	padding: 6px 12px;
	color: #fff;
}

ul.nav nav-tabs li.current {
	background-color: #9A8781;
	color: #222;
}

.tabcontent.current {
	display: block;
}

.main-sidebar {
	position: fixed;
	top: 0;
	bottom: 0;
	background-color: #9A8781;
	font-size: 14px;
	color: black;
	width: 300px;
}

.green_window3 {
	display: inline-block;
	width: 366px;
	height: 34px;
	border: 3px solid #D2917F;
	background: white;
}

.input_text3 {
	width: 348px;
	height: 21px;
	margin: 6px 0 0 9px;
	border: 0;
	line-height: 21px;
	font-weight: bold;
	font-size: 16px;
	outline: none;
}
</style>

<script type="text/javascript">
	function search() {
		var word = document.getElementById("search");
		console.log("검색이 되어라 얍!");

		if (word.value == '') {
			alert("검색어를 입력해 주세요.");
		} else {
			location.href = '/search?query=' + word.value;
			console.log(word.value);
		}
	}

	$(function() {

		document.body.onkeypress = function(event) {
			if (event.keyCode == '13') {
				search();
			}
		}
		$("#btn").on("click", function() {
			search();
		})
	})
</script>

</head>
<body>
	<header>
		<div class="wrap1">
			<span class='green_window1'> <!-- 	<button type='button' class='btn btn-default'>
					<a href="/user/login">로그인</a>
				</button> 
			-->
			</span>
		</div>
		<div class="wrap">
			<span class='green_window3'> <input type='text' id='search'
				class='input_text3' style='color: black' />
			</span>

			<button id="btn" class="btn btn-default">검색</button>
		</div>
	</header>


	<nav>
		<!-- 		<div class="wrap">
			<ul class="nav nav-tabs">
				<li><a href="/" class="on">헤드라인</a></li>
				<li><a href="/sboard/list">게시판</a></li>
			</ul>
		</div> -->
		<div id="container">


			<ul class="nav nav-tabs">
				<li><a href="/" class="on">헤드라인</a></li>
				<li><a href="/sboard/list">게시판</a></li>
			</ul>
	</nav>




	<!-- Main content -->
	<section class="content" id="contents">
		<div class="row">
			<div class="box-body">
				<table class="table table-hover">
					<tr>
						<th style="width: 50px">이미지</th>
						<th style="width: 50px">제목</th>
						<th style="width: 100px">요약내용</th>
						<th style="width: 80px">원본링크</th>
						<th style="width: 50px">날짜</th>
					</tr>

					<c:forEach items="${first_news}" var="news">

						<tr>
							<td><img src="${news.imagelink}" alt="" width="200px" height="150"/></td>
							<td><a href='${news.link}'>${news.title}</a></td>
							<td>${news.description}</td>
							<td><a href='${news.originallink}'>${news.originallink}</a></td>
							<td>${news.pubDate }</td>
						</tr>

					</c:forEach>


				</table>
			</div>

		</div>
		<!-- /.row -->
	</section>
	<!-- /.content -->

	<%@include file="include/footer.jsp"%>