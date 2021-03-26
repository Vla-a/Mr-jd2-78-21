<%@ page import="by.it_academy.jd2.core.Usersss" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>hi</title>
    <meta charset="utf-8">
</head>
<body>
<%=(String)request.getSession().getAttribute("list")%>
</body>
</html>