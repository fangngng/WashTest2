<%--
  Created by IntelliJ IDEA.
  User: fa
  Date: 2015/4/10
  Time: 20:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="zh-CN">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <link rel="icon" href="../../favicon.ico">

  <title>登录</title>

  <!-- Bootstrap core CSS -->
  <link href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="css/signin.css" rel="stylesheet">

  <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
  <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
  <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

  <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
  <!--[if lt IE 9]>
  <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
  <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
  <![endif]-->
</head>

<body>

<div class="container text-center ">

  <form class="form-signin" action="login.action" method="post">
    <h2 class="form-signin-heading">登录</h2>
    <label for="name" class="sr-only">Email address</label>
    <input type="text" id="name" name="name" class="form-control" placeholder="用户名" required autofocus>
    <label for="passwd" class="sr-only">Password</label>
    <input type="password" id="passwd" name="passwd" class="form-control" placeholder="密码" required>
    <div class="checkbox">
      <label>
        <input type="checkbox" value="remember-me"> 记住我
      </label>
    </div>
    <input class="btn btn-lg btn-primary btn-block" type="submit" value="登录"/>
  </form>

</div> <!-- /container -->


<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>

