<%-- 
    Document   : login
    Created on : 03-Aug-2022, 12:43:16 PM
    Author     : CDAC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <form action="userauthentication" method="post">
            <input name="username" type="text"><br>
            <input name="password" type="password"><br><br>
            <input type="submit" value="Login">
        </form>
    </center>
    </body>
</html>
