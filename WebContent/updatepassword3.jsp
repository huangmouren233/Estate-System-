<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>修改个人密码</title>
	<script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>

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
	<form action="updatepassword3Servlet?UserID=<%=id%>" method="post" onsubmit="return checkpwd()">
	<div align="center">
	    <h1 style="color: black;">&nbsp&nbsp&nbsp欢迎进行个人密码修改！</h1>
	    <a href="menu3.jsp"><div style="color: black;">返回主页</div></a>
	       <br>
		<table border="6px">
			<tr>
            	<td><h4><div style="color: black;">旧密码：</div></h4></td>
            	<td><input type="text" name="password"  required  placeholder="请输入旧密码"/></td>
			</tr>
			<tr>
            	<td><h4><div style="color: black;">新密码：</div></h4></td>
            	<td><input type="password" name="newpassword" id="newpassword" required placeholder="请输入新密码"/></td>
			</tr>
			<tr>
            	<td><h4><div style="color: black;">新密码确认：</div></h4></td>
            	<td><input type="password" name="newpassword1" id="newpassword1" required  placeholder="请输入新密码确认"/></td>
			</tr>
			<tr>
				<td></td>
				<td>
				<button type="submit">提&nbsp&nbsp&nbsp交</button>
				&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
				<button type="reset">清&nbsp&nbsp&nbsp空</button>
				</td>
			</tr>
		</table>
    </div>
    </form>
    <script type="text/javascript">
    function checkpwd(){
	var pwd = document.getElementById("newpassword").value;
	var pwd1 = document.getElementById("newpassword1").value;
	if (pwd == pwd1) {
		return true;
	} else {
		alert('两次密码不一致！');
		return false;
	}
	}
    </script>
</body>
</html>