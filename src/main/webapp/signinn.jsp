<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*, java.text.*" %>

<html>
<head>
    <title>SignIn</title>
    <meta charset="utf-8">
</head>
<body>


<br>

  <h1>Вход в систему</h1>

  <form action="hello" method="GET">

 Логин<br>
    <input type="text" placeholder="Введите логин" name="login" required><br><br>

    Пароль<br>
    <input type="password" placeholder="Введите пароль" name="psw" required><br><br>


      <p>

      <table>

          <tr>

          <th><small>

              <input type="submit" name="login" value="Войти в систему">

          </small>

          <th><small>

              <input type="submit" name="registration" value="Зарегистрироваться">

              </small>

      </table>

  </form>

  <br>
</body>
</html>