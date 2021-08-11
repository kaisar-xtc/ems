<%@page contentType="text/html; utf-8" pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>

</head>
<body>
<form action="${pageContext.request.contextPath}/emp/save" method="post">
    <h3>添加员工</h3>
    name:<input type="text" name="name"><br><br>
    salary:<input type="text" name="salary"><br><br>
    age: <input type="text" name="age"><br><br>
    <input type="submit" value="添加">
</form>
</body>
</html>