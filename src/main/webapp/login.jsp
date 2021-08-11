<%@page contentType="text/html; utf-8" pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>

</head>
<body>
    <form action="${pageContext.request.contextPath}/user/login" method="post">
        用户名：<input name="username" type="text"><br><br>
        密码:<input name="password" type="password"><br><br>
        <input type="submit" value="登 录">
    </form>
    <a  href="${pageContext.request.contextPath}/regist.jsp">注册</a>
</body>
</html>