<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LOGIN</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/LOGIN" method="post">
        姓名:<input type="text" name="userName">
        密码:<input type="text" name="pwd">
        <input type="submit" value="登入">
    </form>
</body>
</html>