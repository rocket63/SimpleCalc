<%--
  Created by IntelliJ IDEA.
  User: Rob
  Date: 2/28/2017
  Time: 10:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="processForm" method="post">
    First Number<input type="number" name="FNum"> <br>
    Second Number <input type="number"name="SNum"> <br>

    <input type="submit" value="Add">

    ${confMessage}<br>
    <a href="/">back</a>
</form>
</body>
</html>
