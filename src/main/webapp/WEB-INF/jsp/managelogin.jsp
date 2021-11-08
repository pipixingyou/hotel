<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>后台管理系统</title>

    <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath }/statics/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="${pageContext.request.contextPath }/statics/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="${pageContext.request.contextPath }/statics/css/nprogress.css" rel="stylesheet">
    <!-- Animate.css -->
    <link href="https://colorlib.com/polygon/gentelella/css/animate.min.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="${pageContext.request.contextPath }/statics/css/custom.min.css" rel="stylesheet">
  </head>

  <body class="login">
    <div>
      <a class="hiddenanchor" id="signup"></a>
      <a class="hiddenanchor" id="signin"></a>

      <div class="login_wrapper">
        <div class="animate form login_form">
          <section class="login_content">
            <form action="dologin" method="post">
              <h1>帆船酒店管理系统</h1>
              <div>
                <input type="text" class="form-control" name="mcode" placeholder="请输入用户名" required="" />
              </div>
              <div>
                <input type="password" class="form-control" name="password" placeholder="请输入密码" required="" />
              </div>
              <span style="color: red">${error }</span>
              <div>
              	<button type="submit" class="btn btn-success">登      录</button>
              	<button type="reset" class="btn btn-default">重　填</button>
              </div>

              <div class="clearfix"><a href="${pageContext.request.contextPath}/manager/backend/app/lookRoom" style=" color:cornflowerblue; text-decoration: none;">点击订房</a></div>

              <div class="separator">
                <div>
                  <p>©2021 Sailboat Hotel . </p>
                </div>
              </div>
            </form>
          </section>
        </div>
      </div>
    </div>
  </body>
</html>