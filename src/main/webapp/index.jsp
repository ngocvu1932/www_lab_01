<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
  <h1> Logon </h1>
    <form action="/account" method="post">
      Username: <input type="text" name="username"> </br> </br>
      Password:<input type="text" name="password"> </br> </br>
      <input type="submit" value="logon">
      <input type="hidden" name="action" value="logon">
    </form>
</body>
</html>