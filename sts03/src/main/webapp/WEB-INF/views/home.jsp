<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Home</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/css/bootstrap.css"/>
	<style type="text/css">
		.item > img{
			margin: 0px auto;
		}
	</style>
	<script type="text/javascript" src="${pageContext.request.contextPath }/resources/js/jquery-1.12.4.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/resources/js/bootstrap.js"></script>
	<script type="text/javascript">
	
	</script>
</head>
<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">비트교육센터</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="dropList">
      <ul class="nav navbar-nav">
        <li class="active"><a href="${pageContext.request.contextPath }/">HOME <span class="sr-only">(current)</span></a></li>
        <li><a href="${pageContext.request.contextPath }/login">LOGIN</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">TABLE <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="${pageContext.request.contextPath }/dept/">DEPT LIST</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="${pageContext.request.contextPath }/emp/">EMP LIST</a></li>
          </ul>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
<div class="container">
	<div class="row" id="header">
		<div class="col-md-12"></div>
	</div>
	<div class="row" id="content">
		<div class="col-md-12">
			<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div class="item active">
      <img src="resources/imgs/big01.jpg" alt="...">
      <div class="carousel-caption">
        <h3>닭고깅</h3>
        <p>치킨한마리 씨게 뜯고싶넹..</p>
      </div>
    </div>
    <div class="item">
      <img src="resources/imgs/big02.jpg" alt="...">
      <div class="carousel-caption">
        <h3>목쨜</h3>
        <p>목살은 찌개 야무지게 끼리무야징</p>
      </div>
    </div>
    <div class="item">
      <img src="resources/imgs/big03.jpg" alt="...">
      <div class="carousel-caption">
        <h3>삼겹쨜</h3>
        <p>바베큐로 개박살내고싶다...</p>
      </div>
    </div>
    <div class="item">
      <img src="resources/imgs/big04.jpg" alt="...">
      <div class="carousel-caption">
        <h3>뚜박</h3>
        <p>한여름엔 뚜박 화채 개박살</p>
      </div>
    </div>
    ...
  </div>

  <!-- Controls -->
  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
		</div>
	</div>
	<div class="row" id="footer">
		<div class="col-md-12">
			<address>비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)</address>
					Copy &copy; 오영문
		</div>
	</div>
</div>
</body>
</html>
