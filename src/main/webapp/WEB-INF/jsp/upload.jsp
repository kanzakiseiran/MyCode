<%--
  Created by IntelliJ IDEA.
  User: kingboya
  Date: 2020/4/23
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>文件上传</title>
</head>
<body>
<form enctype="multipart/form-data" method="post" action="/upload">
    <input type="file" name="file"/><br>
    <input type="submit" value="上传"/>
</form>
<%--<a href="/file/download">文件下载</a>--%>
</body>
</html>
