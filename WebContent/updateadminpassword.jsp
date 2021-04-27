<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>密码重置</title>
</head>
	<%
         Object message = request.getAttribute("message");
         if(message!=null && !"".equals(message)){
     
    %>
         <script type="text/javascript">
              alert("<%=request.getAttribute("message")%>");
         </script>
    <%} %>
<body>
	<form action="searchServlet" method="post">
	<div align="center">
	    <h1 style="color: black;">&nbsp&nbsp&nbsp密码重置</h1>
	    <a href="menu1.jsp"><div style="color: black;">返回主页</div></a>
	       <br>
		<table border="6">
			<tr>
            	<td><h4><div style="color: black;">工号：</div></h4></td>
            	<td><input type="text" name="AgentID" id="AgentID" onblur="checkID(this.value)"  required  placeholder="八位数字:年份+四位序号"/><span id="span3"></span></td>
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
    function checkID(str){
	var birthday = document.getElementById("AgentID").value;
	var sp = document.getElementById("span3");
	var re = /^((19|20)[0-9]{6})$/;
	if (re.test(str)) {
	    sp.innerHTML = "格式正确"
	} else {
	sp.innerHTML = "输入格式有误"
	}
	}
    </script>
</body>
</html>