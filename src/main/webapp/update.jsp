<%@page contentType="text/html; utf-8" pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>

</head>
<body>
<form action="${pageContext.request.contextPath}/emp/update" method="post">
    <h3>更新员工信息</h3>
    id:${requestScope.emps.id}<br><br>
    <input type="hidden" value="${requestScope.emps.name}">
    name:<input type="text" name="name" value="${requestScope.emps.name}"><br><br>
    salary:<input type="text" name="salary" value="${requestScope.emps.salary}"><br><br>
    age: <input type="text" name="age" value="${requestScope.emps.age}"><br><br>
    <input type="submit" value="添加">
</form>
</body>
</html>