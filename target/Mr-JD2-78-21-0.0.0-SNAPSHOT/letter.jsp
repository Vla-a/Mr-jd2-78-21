<!DOCTYPE html>

<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Message</title>
    <meta charset="utf-8">
</head>
<body>
<%
    if (request.getSession().getAttribute("send") != null) {
        if ((Boolean) request.getSession().getAttribute("send")) {
            out.println("<p><span>Письмо отправленно!</span></p>");
        }
        request.getSession().setAttribute("send", null);
    }
%>
<p>Кому отправить письмо</p>


<form method="POST" action="message" >

    Кому:<select name="userReceiver">
    <c:forEach var="a" items="${setUsers}">
        <option value="${a}"> ${a}<br></option>
    </c:forEach>
</select>

    <br><br>

    Сообщение:<br>
    <input type="text" name="message"/>
    <br><br>
    <button type="submit">Отправить</button>
</form>
<form action="menu" method="get">    <br>
    <button type="submit">Выйти в меню</button>
    <br><br>
</form>
<form action="start.jsp">
    <button type="submit">Выйти в главное меню</button>
    <br><br>
</form>
</body>
</html>