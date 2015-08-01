<%--
  Created by IntelliJ IDEA.
  User: fa
  Date: 2015/4/10
  Time: 20:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <meta name="viewport" content="width=device-width,initial-scale=1" />
  <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap.min.css">

  <style>
    body {
      padding-top: 70px;
    }
  </style>
  <title></title>
</head>

<body>

<nav class="navbar navbar-default  navbar-fixed-top">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">洗衣房</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">主页 <span class="sr-only">(current)</span></a>
        </li>
        <li><a href="#">帮助</a>
        </li>
        <li><a href="#">关于</a>
        </li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="login.jsp?type=login">登录</a>
        <li><a href="login.jsp?type=register">注册</a>
        </li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">我 <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="#">Action</a>
            </li>
            <li><a href="#">Another action</a>
            </li>
            <li><a href="#">Something else here</a>
            </li>
            <li class="divider"></li>
            <li><a href="#">Separated link</a>
            </li>
          </ul>
        </li>
      </ul>
    </div>
    <!-- /.navbar-collapse -->
  </div>
  <!-- /.container-fluid -->
</nav>



<div class="container-fluid">
  <form method="get" action="main.action">
    <div class="jumbotron text-center">

      <h2>开启便捷的洗衣体验，从现在开始！</h2>
      <p>点击按钮，将会有工作人员联系您，开始洗衣。</p>
      <p><input class="btn btn-primary btn-lg " name="wash" onclick="" type="submit" value="我要洗衣"/>
      </p>

    </div>

    <div class="text-center">
      <div class="row">
        <div class="col-sm-2">
        </div>
        <div class="col-sm-4">
          <div class="input-group">
            <span class="input-group-addon" id="basic-addon1">我的地址：</span>
            <input type="text" name="addr" class="form-control" placeholder="Address" aria-describedby="basic-addon1" required>
          </div>
        </div>

        <div class="col-sm-4">
          <div class="input-group">
            <span class="input-group-addon" id="basic-addon2">联系方式：</span>
            <input type="number" name="tel" class="form-control" placeholder="TelePhone" aria-describedby="basic-addon2" required>
          </div>
        </div>
        <div class="col-sm-2">
        </div>
      </div>
    </div>

    <div class="page-header text-center">
      <h2>衣物类型</h2>
      <h4>您也可以选择您的衣物类型，以作参考。</h4>
    </div>
    <div class="row">
      <div class="col-sm-2">
      </div>
      <div class="col-sm-4">
        <div class="panel panel-default">
          <div class="panel-heading">
            <h3 class="panel-title">干洗</h3>
          </div>
          <div class="panel-body">
            <ul class="list-group">
              <li class="list-group-item" id="li_1_1">
                Cras justo odio
                <a name="main" href="#" onclick="numAdd()"> <span class="glyphicon glyphicon-plus pull-right" aria-hidden="true">&nbsp;</span>
                </a>

                <span class="badge " id="num"> 42 </span>
                <a href="#" onclick="numMinus()"> <span class="glyphicon glyphicon-minus pull-right" aria-hidden="true">&nbsp;</span>
                </a>

              </li>
              <li class="list-group-item">Dapibus ac facilisis in
                <a href="#"> <span class="glyphicon glyphicon-plus pull-right" aria-hidden="true">&nbsp;</span>
                </a>

                <span class="badge "> 42 </span> &nbsp;
                <a href="#"> <span class="glyphicon glyphicon-minus pull-right" aria-hidden="true">&nbsp;</span>
                </a>
              </li>
              <li class="list-group-item">Morbi leo risus
                <a href="#"> <span class="glyphicon glyphicon-plus pull-right" aria-hidden="true">&nbsp;</span>
                </a>

                <span class="badge "> 42 </span>
                <a href="#"> <span class="glyphicon glyphicon-minus pull-right" aria-hidden="true">&nbsp;</span>
                </a>
              </li>
              <li class="list-group-item">Porta ac consectetur ac
                <a href="#"> <span class="glyphicon glyphicon-plus pull-right" aria-hidden="true">&nbsp;</span>
                </a>

                <span class="badge "> 42 </span>
                <a href="#"> <span class="glyphicon glyphicon-minus pull-right" aria-hidden="true">&nbsp;</span>
                </a>
              </li>
              <li class="list-group-item">Vestibulum at eros
                <a href="#"> <span class="glyphicon glyphicon-plus pull-right" aria-hidden="true">&nbsp;</span>
                </a>

                <span class="badge "> 42 </span>
                <a href="#"> <span class="glyphicon glyphicon-minus pull-right" aria-hidden="true">&nbsp;</span>
                </a>
              </li>
            </ul>
          </div>
        </div>

      </div>
      <!-- /.col-sm-4 -->
      <div class="col-sm-4">

        <div class="panel panel-default">
          <div class="panel-heading">
            <h3 class="panel-title">水洗</h3>
          </div>
          <div class="panel-body">
            <ul class="list-group">
              <li class="list-group-item">Cras justo odio
                <a href="#"> <span class="glyphicon glyphicon-plus pull-right" aria-hidden="true">&nbsp;</span>
                </a>
                <span class="badge "> 42 </span>
                <a href="#"> <span class="glyphicon glyphicon-minus pull-right" aria-hidden="true">&nbsp;</span>
                </a>

              </li>
              <li class="list-group-item">Dapibus ac facilisis in
                <a href="#"> <span class="glyphicon glyphicon-plus pull-right" aria-hidden="true">&nbsp;</span>
                </a>

                <span class="badge "> 42 </span>
                <a href="#"> <span class="glyphicon glyphicon-minus pull-right" aria-hidden="true">&nbsp;</span>
                </a>
              </li>
              <li class="list-group-item">Morbi leo risus
                <a href="#"> <span class="glyphicon glyphicon-plus pull-right" aria-hidden="true">&nbsp;</span>
                </a>

                <span class="badge "> 42 </span>
                <a href="#"> <span class="glyphicon glyphicon-minus pull-right" aria-hidden="true">&nbsp;</span>
                </a>
              </li>
              <li class="list-group-item">Porta ac consectetur ac
                <a href="#"> <span class="glyphicon glyphicon-plus pull-right" aria-hidden="true">&nbsp;</span>
                </a>

                <span class="badge "> 42 </span>
                <a href="#"> <span class="glyphicon glyphicon-minus pull-right" aria-hidden="true">&nbsp;</span>
                </a>
              </li>
              <li class="list-group-item">Vestibulum at eros
                <a href="#"> <span class="glyphicon glyphicon-plus pull-right" aria-hidden="true">&nbsp;</span>
                </a>

                <span class="badge "> 42 </span>
                <a href="#"> <span class="glyphicon glyphicon-minus pull-right" aria-hidden="true">&nbsp;</span>
                </a>
              </li>
            </ul>
          </div>
        </div>
      </div>
      <!-- /.col-sm-4 -->
      <div class="col-sm-2"></div>
    </div>

    <div class="page-header">

      <div class="text-center">

        <p><input class="btn btn-primary btn-lg " type="submit" value="我要洗衣"/>
        </p>
      </div>
    </div>

  </form>
  <div class="page-header">

    <div class="text-center">

      <p><a class=" " href="#">想了解更多？</a>&nbsp;
        <a class=" " href="#">加入我们</a>
      </p>
    </div>
  </div>

  <div class="mastfoot text-center">
    <div class="inner">
      <p>WashRoom for xx
        <a href="http://getbootstrap.com"></a>, by ff
        <a href="https://twitter.com/mdo"></a>.</p>
    </div>
  </div>
</div>


<script>
  function numAdd() {
    var x = document.getElementById("num").innerHTML;
    var y = parseInt(x);
    if (y < 50) {
      y++;
    }
    document.getElementById("num").innerHTML = y.toString();
    location.href = "#main";
  }

  function numMinus() {
    var x = document.getElementById("num").innerHTML;
    var y = parseInt(x);
    if (y > 0) {
      y--;
    }
    document.getElementById("num").innerHTML = y.toString();

  }
</script>

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</body>

</html>
