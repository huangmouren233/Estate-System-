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
	    <h2 style="color: black;">&nbsp&nbsp&nbsp欢迎工号为<%=id%>的管理员登录！</h2>
		<table border="6">
			<tr>
            	<td><h4><a href="addfangchan.jsp"><div align="center"style="color: black;">新添房产信息</div></a></h4></td>
			</tr>
			<tr>
            	<td><h4><a href="addfangchanjingji.jsp"><div align="center"style="color: black;">新增房产经纪人</div></a></h4></td>
			</tr>
			<tr>
            	<td><h4><a href="gukeshenheServlet"><div align="center"style="color: black;">顾客审核</div></a></h4></td>
			</tr>
			<tr>
            	<td><h4><a href="showfangchanServlet"><div align="center"style="color: black;">查询房产信息</div></a></h4></td>
			</tr>
			<tr>
            	<td><h4><a href="showfangchanServlet"><div align="center"style="color: black;">停售房产</div></a></h4></td>
			</tr>
			<tr>
            	<td><h4><a href="showfangchanServlet"><div align="center"style="color: black;">房产授权</div></a></h4></td>
			</tr>
			<tr>
            	<td><h4><a href="updateadminpassword.jsp"><div align="center"style="color: black;">密码重置</div></a></h4></td>
			</tr>
		</table>
    </div>
</body>
</html>