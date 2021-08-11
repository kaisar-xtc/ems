<%@page contentType="text/html; utf-8" pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
<title>用户注册</title>
</head>
<body>
<div>
    <form action="${pageContext.request.contextPath}/user/regist" method="post">
        用户名：<input name="username" type="text"><br><br>
        真实名称：<input name="realname" type="text"><br><br>
        密码:<input name="password" type="password"><br><br>
        性别：<br>
        <input type="radio" name="sex" value="男" checked="checked">男
        <input type="radio" name="sex" value="女">女
        <input type="submit" value="注 册">
    </form>
    <a  href="${pageContext.request.contextPath}/login.jsp">登录</a>
</div>
</body>
</html>