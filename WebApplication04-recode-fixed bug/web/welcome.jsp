<%-- 
    Document   : welcome
    Created on : May 26, 2025, 11:17:47 PM
    Author     : an0other
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.UserDTO" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            UserDTO user = (UserDTO)request.getAttribute("User");
        %>
        <h1>Welcome <%= user.getFullname() %> ! </h1>
    </body>
</html>
