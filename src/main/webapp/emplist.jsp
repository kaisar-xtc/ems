<%@ page contentType="text/html; utf-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

</head>
<body>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Salary</th>
        <th>Age</th>
        <th>operation</th>
    </tr>
    <c:forEach items="${requestScope.emps}" var="emp">
        <tr>
            <th>
                ${emp.id}
            </th>
            <th>
                ${emp.name}
            </th>
            <th>
                ${emp.salary}
            </th>
            <th>
                ${emp.age}
            </th>
            <th>
                <a href="${pageContext.request.contextPath}/emp/delete?name=${emp.name}">删除</a>、
                <a href="${pageContext.request.contextPath}/emp/findOne?name=${emp.name}">更改</a>
            </th>
        </tr>
    </c:forEach>
    <tr>
        <th>1</th>
        <th>小黑</th>
        <th>1000</th>
        <th>20</th>
        <th>
            <a href="${pageContext.request.contextPath}/emp/delete?name=${emp.name}">删除</a>、
            <a href="${pageContext.request.contextPath}/emp/findOne?name=${emp.name}">更改</a>
        </th>
    </tr>
</table>
<br>
<a href="${pageContext.request.contextPath}/addEmp.jsp">添加员工</a>
</body>
</html>