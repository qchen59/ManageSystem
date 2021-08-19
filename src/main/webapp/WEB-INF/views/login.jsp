


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns:th="http://www.thymeleaf.org">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
  <title>登陆</title>
  <link rel="stylesheet" type="text/css" href="css/app.css" media="all"/>
  <script type="text/javascript" src="view.js"></script>

</head>
<body id="main_body" >

<div id="login_container">

  <h1><a>用户登陆</a></h1>
  <form class = "login">

    <div class="container">
      <label for="uname"><b>Username</b></label>
      <input type="text" placeholder="Enter Username" name="uname" />

      <label for="psw"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" name="psw" />

      <button type="submit">Login</button>
    </div>

  </form>

</div>
</body>
</html>