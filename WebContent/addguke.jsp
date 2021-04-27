<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>注册</title>
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
	<form action="addgukeServlet" method="post">
	<div align="center">
	    <h1 style="color: black;">&nbsp&nbsp&nbsp欢迎注册信息！</h1>
	    <a href="menu1.jsp"><div style="color: black;">返回主页</div></a>
	       <br>
		<table border="6px">
			<tr>
            	<td><h4><div style="color: black;">账号：</div></h4></td>
            	<td><input type="text" name="UserID" required maxlength="8" placeholder="请输入账号"/></td>
			</tr>
			<tr>
            	<td><h4><div style="color: black;">密码：</div></h4></td>
            	<td><input type="text" name="password" required  placeholder="请输入密码"/></td>
			</tr>
			<tr>
            	<td><h4><div style="color: black;">姓名：</div></h4></td>
            	<td><input type="text" name="UserName" required maxlength="4" placeholder="请输入姓名"/></td>
			</tr>
			<tr>
				<td><h4><div style="color: black;">姓别：</div></h4></td>
                        <td>男<input type="radio" name="sex" value="男" checked="checked">
		        女<input type="radio" name="sex" value="女" ></td>
		    </tr>
			<tr>
            	<td><h4><div style="color: black;">身份证号：</div></h4></td>
            	<td><input type="text" name="IdNumber" id="IdNumber" required maxlength="18" onblur="checkIdc(this.value)" placeholder="请输入身份证号"><span id="span1"></span></td>
			</tr>
			<tr>
            	<td><h4><div style="color: black;">家庭住址：</div></h4></td>
            	<td><input type="text" name="User" id="User" onblur="checkUser(this.value)" required placeholder="XX省XX市XX区（县）" /><span id="span3"></span></td>
			</tr>
			<tr>
            	<td><h4><div style="color: black;">电话：</div></h4></td>
            	<td><input type="number" name="Phone" id="Phone" required  placeholder="请输入电话" onblur="checkPhone(this.value)" ><span id="span2"></span></td>
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
</body>
<script type="text/javascript">
function checkUser(str){
	var idc = document.getElementById("User").value;
	var sp = document.getElementById("span3");
	var re = /([^省]+省|.+自治区|[^市]+市)([^自治州]+自治州|[^市]+市|[^盟]+盟|[^地区]+地区|.+区划)([^市]+市|[^县]+县|[^旗]+旗|.+区)/;
	if (re.test(str)) {
	    sp.innerHTML = "格式正确"
	} else {
	sp.innerHTML = "输入格式有误"
	}
	}
function checkIdc(str){
	var idc = document.getElementById("IdNumber").value;
	var sp = document.getElementById("span1");
	var re = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
	if (re.test(str)) {
	    sp.innerHTML = "格式正确"
	} else {
	sp.innerHTML = "输入格式有误"
	}
	}
function checkPhone(str){
	var phone = document.getElementById("Phone").value;
	var sp = document.getElementById("span2");
	var re = /^([1]\d{10}|([\(（]?0[0-9]{2,3}[）\)]?[-]?)?([2-9][0-9]{6,7})+(\-[0-9]{1,4})?)$/;
	if (re.test(str)) {
	    sp.innerHTML = "格式正确"
	} else {
	sp.innerHTML = "输入格式有误"
	}
	}

</script>
</html>