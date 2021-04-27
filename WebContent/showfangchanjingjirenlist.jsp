<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>个人信息列表</title>
</head>
<body>
	<%
         Object message = request.getAttribute("message");
         if(message!=null && !"".equals(message)){
     
    %>
         <script type="text/javascript">
              alert("<%=request.getAttribute("message")%>");
         </script>
    <%} %>
    <div align="center">
        <h1 style="color: black;">信息列表</h1>
        <a href="menu2.jsp"><div style="color: black;">返回主页</div></a>
        <br>
        <table border="6">
            <tr>
                <td>工号</td>
                <td>姓名</td>
                <td>家庭住址</td>
                <td>手机</td>
				<td>密码</td>
				<td></td>
            </tr>
            <c:forEach items="${fangchanjingjirens}" var="item" varStatus="status">
                <tr>
                    <td>${item.agentid}</td>
                    <td>${item.agentname}</td>
                    <td>${item.agentaddress}</td>
                    <td>${item.phone}</td>
                    <td>${item.password}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>