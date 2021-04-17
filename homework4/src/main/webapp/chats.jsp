-
<!DOCTYPE html>

<%@ page import="by.it_academy.jd2.core.dto.vui.User" %>
<%@ page import="by.it_academy.jd2.core.dto.vui.Message" %>

<%@ page import="by.it_academy.jd2.core.dto.vui.DataMessage" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Chat</title>
    <meta charset="utf-8">
</head>
<body>

<% User userSender = (User) request.getSession().getAttribute("userSender");%>
<p><span style='color: red;'> Получатель <%=userSender.getName()%> </span></p>

    <%
    if (DataMessage.searchMessageUserLogin(userSender.getLogin()).size() != 0) {
        for (Message message : DataMessage.searchMessageUserLogin(userSender.getLogin())) {
            out.write("<p><span style='color: blue;'>" + message.toString() + "</span></p>");
        }
    } else {
        out.write("<p><span style='color: blue;'> У вас пока нет сообщений!!!</span></p>");
    }
%>


<form action="menu" method="get">
    <br>
    <button type="submit">Назад в меню</button>
    <br><br>
</form>

</body>
</html>