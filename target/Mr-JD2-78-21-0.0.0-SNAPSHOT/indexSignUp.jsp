<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<c:if test="${Boolean.parseBoolean(invalidUserLogin)}">
    <h4><span >Пользователь с таким логином уже зарегистрирован!<br>

    </span></h4>
</c:if>
<%request.setAttribute("invalidUserLogin", false);%>
<html>

<head>
    <title>SignUp</title>
    <meta charset="utf-8">
</head>
<body>

<form method="post" action="signUp">
    <h1>Ругестрация</h1>

    ФИО<br>
    <input type="text"  name="name" required><br><br>

    Логин<br>
    <input type="text" name="login" required><br><br>

    Пароль<br>
    <input type="password" name="psw" required><br><br>

    Дата рождения<br>
    <input type="date" name="birthday" required><br><br>

    <button type="submit">Зарегистрироваться</button><br><br>

</form>
</body>
</html>