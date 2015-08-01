<%-- Created by IntelliJ IDEA. User: fa Date: 2015/4/22 Time: 3:02 To change this template use File | Settings | File Templates. --%>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>

        <!DOCTYPE html>
        <html lang="zh-CN">

        <head>
            <meta charset="utf-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
            <meta name="description" content="">
            <meta name="author" content="">
            <link rel="icon" href="../../favicon.ico">

            <title>洗衣房管理系统</title>

            <!-- Bootstrap core CSS -->
            <link href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap.min.css" rel="stylesheet">

            <!-- Custom styles for this template -->
            <link href="css/dashboard.css" rel="stylesheet">

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

            <nav class="navbar navbar-inverse navbar-fixed-top">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="#">洗衣房</a>
                    </div>
                    <div id="navbar" class="navbar-collapse collapse">
                        <ul class="nav navbar-nav navbar-right">
                            <li><a href="#">数据</a>
                            </li>
                            <li><a href="#">设置</a>
                            </li>
                            <li><a href="#">文档</a>
                            </li>
                            <li><a href="#">帮助</a>
                            </li>
                        </ul>
                        <form class="navbar-form navbar-right">
                            <input type="text" class="form-control" placeholder="Search...">
                        </form>
                    </div>
                </div>
            </nav>

            <div class="container-fluid">
                <div class="row">
                    <div class="col-sm-3 col-md-2 sidebar">
                        <ul class="nav nav-sidebar">
                            <li><a href="#">功能列表 <span class="sr-only">(current)</span></a>
                            </li>
                        </ul>
                        <ul class="nav nav-sidebar">
                            <li class="active"><a href="#">个人信息</a>
                            </li>
                            <li><a href="#">修改密码</a>
                            </li>
                            <li><a href="#">安全设置</a>
                            </li>
                            <li><a href="#">我的地址</a>
                            </li>
                        </ul>
                        <ul class="nav nav-sidebar">
                            <li><a href="">订单中心</a>
                            </li>
                            <li><a href="">最近一个月的订单</a>
                            </li>
                            <li><a href="">全部订单</a>
                            </li>
                            </li>
                        </ul>
                    </div>
                    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
                        <h1 class="page-header">个人中心</h1>

                        <div class="row placeholders">
                            <div class="col-xs-6 col-sm-3 placeholder">
                                <img src="img/daniu.jpg" class="img-responsive" alt="Generic placeholder thumbnail">
                                <h4>username</h4>
                                <span class="text-muted">introduce</span>
                            </div>
                            <div class="col-xs-6 col-sm-4 placeholder">
                                <img data-src="holder.js/200x200/auto/vine" class="img-responsive" alt="Generic placeholder thumbnail">
                                <h4>积分</h4>
                                <span class="text-muted">10000</span>
                                <h4>Label</h4>
                                <h4>Label</h4>
                                <span class="text-muted">Something else</span>
                            </div>
                            <div class="col-xs-6 col-sm-5 placeholder">
                                <img data-src="holder.js/200x200/auto/vine" class="img-responsive" alt="Generic placeholder thumbnail">
                                <h4>账户余额：</h4>
                                <h3><b>￥</b>0</h3>
                                <button type="button" class="">立即充值</button>
                                <h4><span class="text-muted">完成的订单</span>
                                <span class="text-muted">20张</span>
                                </h4>
                            </div>
                            
                        </div>

                        <h2 class="sub-header">最近完成的订单：</h2>
                        <div class="table-responsive">
                            <table class="table table-striped">
                                <thead>
                                    <tr>
                                        <th>订单号</th>
                                        <th>下单时间</th>
                                        <th>订单详情</th>
                                        <th>订单金额</th>
                                        <th>订单状态</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>1,001</td>
                                        <td>Lorem</td>
                                        <td>ipsum</td>
                                        <td>dolor</td>
                                        <td>sit</td>
                                    </tr>
                                    <tr>
                                        <td>1,002</td>
                                        <td>amet</td>
                                        <td>consectetur</td>
                                        <td>adipiscing</td>
                                        <td>elit</td>
                                    </tr>
                                    <tr>
                                        <td>1,003</td>
                                        <td>Integer</td>
                                        <td>nec</td>
                                        <td>odio</td>
                                        <td>Praesent</td>
                                    </tr>
                                    <tr>
                                        <td>1,003</td>
                                        <td>libero</td>
                                        <td>Sed</td>
                                        <td>cursus</td>
                                        <td>ante</td>
                                    </tr>
                                    <tr>
                                        <td>1,004</td>
                                        <td>dapibus</td>
                                        <td>diam</td>
                                        <td>Sed</td>
                                        <td>nisi</td>
                                    </tr>
                                    <tr>
                                        <td>1,005</td>
                                        <td>Nulla</td>
                                        <td>quis</td>
                                        <td>sem</td>
                                        <td>at</td>
                                    </tr>
                                    <tr>
                                        <td>1,006</td>
                                        <td>nibh</td>
                                        <td>elementum</td>
                                        <td>imperdiet</td>
                                        <td>Duis</td>
                                    </tr>
                                    <tr>
                                        <td>1,007</td>
                                        <td>sagittis</td>
                                        <td>ipsum</td>
                                        <td>Praesent</td>
                                        <td>mauris</td>
                                    </tr>
                                    <tr>
                                        <td>1,008</td>
                                        <td>Fusce</td>
                                        <td>nec</td>
                                        <td>tellus</td>
                                        <td>sed</td>
                                    </tr>
                                    <tr>
                                        <td>1,009</td>
                                        <td>augue</td>
                                        <td>semper</td>
                                        <td>porta</td>
                                        <td>Mauris</td>
                                    </tr>
                                    <tr>
                                        <td>1,010</td>
                                        <td>massa</td>
                                        <td>Vestibulum</td>
                                        <td>lacinia</td>
                                        <td>arcu</td>
                                    </tr>
                                    <tr>
                                        <td>1,011</td>
                                        <td>eget</td>
                                        <td>nulla</td>
                                        <td>Class</td>
                                        <td>aptent</td>
                                    </tr>
                                    <tr>
                                        <td>1,012</td>
                                        <td>taciti</td>
                                        <td>sociosqu</td>
                                        <td>ad</td>
                                        <td>litora</td>
                                    </tr>
                                    <tr>
                                        <td>1,013</td>
                                        <td>torquent</td>
                                        <td>per</td>
                                        <td>conubia</td>
                                        <td>nostra</td>
                                    </tr>
                                    <tr>
                                        <td>1,014</td>
                                        <td>per</td>
                                        <td>inceptos</td>
                                        <td>himenaeos</td>
                                        <td>Curabitur</td>
                                    </tr>
                                    <tr>
                                        <td>1,015</td>
                                        <td>sodales</td>
                                        <td>ligula</td>
                                        <td>in</td>
                                        <td>libero</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Bootstrap core JavaScript
    ================================================== -->
            <!-- Placed at the end of the document so the pages load faster -->
            <script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
            <script src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
            <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
            <script src="../../assets/js/vendor/holder.js"></script>
            <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
            <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
        </body>

        </html>
