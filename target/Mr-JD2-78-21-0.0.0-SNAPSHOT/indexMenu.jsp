<!DOCTYPE html>
<%@ page import="by.it_academy.jd2.core.dto.vui.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Menu</title>
    <meta charset="utf-8">
</head>
<body>


<%--<%User userSender = (User) (request.getSession().getAttribute("userSender"));%>--%>
Привет, <c:out value="${userSender}"/> !<br>
ТЫ можешь
<hr>
<form action="message" method="get" >
    <button type="submit">Отправить сообщение</button><br><br>
</form>
<form action="chats" >
    <button type="submit">Посмотреть сообщения</button><br><br>
</form>
<form action="index.jsp" >
    <button type="submit">Выйти из приложения</button><br><br>
</form>
<hr>
</body>
</html>