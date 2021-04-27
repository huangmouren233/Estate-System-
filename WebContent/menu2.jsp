<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>功能菜单</title>
</head>
	<%! String id;%>
	<%
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie :cookies)
		{
			if(cookie.getName().equals("id"))
			{
				id = cookie.getValue();
			}
		}
		%>
	<%
         Object message = request.getAttribute("message");
         if(message!=null && !"".equals(message)){
     
    %>
         <script type="text/javascript">
              alert("<%=request.getAttribute("message")%>");
         </script>
    <%} %>
<body>
	<div align="center">
	    <h2 style="color: black;">&nbsp&nbsp&nbsp欢迎工号为<%=id%>的房产经纪人登录！</h2>
		<table border="6">
			<tr>
            	<td><h4><a href="showfangchanjingjirenServlet?AgentID=<%=id%>"><div align="center"style="color: black;">查看个人信息</div></a></h4></td>
			</tr>
			<tr>
            	<td><h4><a href="showfangchan2Servlet?AgentID=<%=id%>"><div align="center"style="color: black;">浏览房产信息</div></a></h4></td>
			</tr>
			<tr>
            	<td><h4><a href="searchfangchan2.jsp?AgentID=<%=id%>"><div align="center"style="color: black;">查询房产信息</div></a></h4></td>
			</tr>
			<tr>
            	<td><h4><a href="jiaoyiServlet?AgentID=<%=id%>"><div align="center"style="color: black;">房产交易</div></a></h4></td>
			</tr>
			<tr>
            	<td><h4><a href="updatepassword2.jsp?AgentID=<%=id%>"><div align="center"style="color: black;">修改个人密码</div></a></h4></td>
			</tr>
		</table>
    </div>
</body>
</html>