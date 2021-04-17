<!DOCTYPE html>
<%@ page import="by.it_academy.jd2.core.dto.vui.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>

    <meta charset="utf-8">
</head>
<body>

<% User userSender = (User) request.getSession().getAttribute("userSender");%>
<p><span> Вы зарегистрированы <%=userSender.getName()%> </span></p>
Ваши возможности:

<form action="message" method="get" >
    <button type="submit">Отправить сообщение</button><br><br>
</form>
<form action="chats" >
    <button type="submit">Посмотреть сообщения</button><br><br>
</form>
<form action="start.jsp" >
    <button type="submit">Выйти в главное меню</button><br><br>
</form>
</body>
</html>