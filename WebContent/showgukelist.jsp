<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>顾客信息列表</title>
</head>
<body>
    <div align="center">
        <h1 style="color: black;">信息列表</h1>
        <a href="menu3.jsp"><div style="color: black;">返回主页</div></a>
        <br>
        <table border="6">
            <tr>
                <td>账号</td>
                <td>密码</td>
                <td>姓名</td>
                <td>性别</td>
                <td>身份证号</td>
                <td>电话</td>
                <td>地址</td>
                <td></td>
            </tr>
            <c:forEach items="${gukes}" var="item" varStatus="status">
                <tr>
                    <td>${item.userid}</td>
                    <td>${item.password}</td>
                    <td>${item.username}</td>
                    <td>${item.sex}</td>
                    <td>${item.idnumber}</td>
                    <td>${item.phone}</td>
                    <td>${item.user}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>