
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>SignIn</title>
    <meta charset="utf-8">
</head>
<body>
<c:if test="${Boolean.parseBoolean(invalidUserLogin)}">
    <h4><span>Не верный логин или пароль, повторите<br>
    </span></h4>
</c:if>
<%request.setAttribute("invalidUserLogin", false);%>


<form action="signIn" method="post">
    <h1>Авторизация</h1>
 <br> <br>
    Логин<br>
    <input type="text" placeholder="Введите логин" name="login" required><br><br>
    Пароль<br>
    <input type="password" placeholder="Введите пароль" name="psw" required><br><br>

    <button type="submit">Войти</button><br><br>
</form>
</body>
</html>