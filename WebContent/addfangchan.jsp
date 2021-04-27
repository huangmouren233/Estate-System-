<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>添加房产信息</title>
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
	<form action="addfangchanServlet" method="post">
	<div align="center">
	    <h1 style="color: black;">&nbsp&nbsp&nbsp欢迎进行房产信息添加！</h1>
	    <a href="menu1.jsp"><div style="color: black;">返回主页</div></a>
	       <br>
		<table border="6px">
			<tr>
            	<td><h4><div style="color: black;">户型：</div></h4></td>
            	<td>四室两厅<input type="radio"  name="RoomType" value="四室两厅" checked="checked">
                                        四室一厅<input type="radio" name="RoomType" value="四室一厅" >
 					三室两厅<input type="radio" name="RoomType" value="三室两厅" >
 			                三室一厅<input type="radio" name="RoomType" value="三室一厅" >
 			                两室两厅<input type="radio" name="RoomType" value="两室两厅" >
			                两室一厅<input type="radio" name="RoomType" value="两室一厅" >  </td>
			</tr>
			<tr>
            	<td><h4><div style="color: black;">房产地址：</div></h4></td>
            	<td><input type="text" name="Address" id="Address" onblur="checkUser(this.value)"  required  placeholder="XX省XX市XX区（县）"/><span id="span3"></span></td>
			</tr>
			<tr>
            	<td><h4><div style="color: black;">建造年份：</div></h4></td>
            	<td><input type="text" name="Year" required placeholder="请输入建造年份"/></td>
			</tr>
			<tr>
            	<td><h4><div style="color: black;">销售报价：</div></h4></td>
            	<td><input type="text" name="Sales"  required  placeholder="请输入销售报价" /></td>
			</tr>
			<tr>
            	<td><h4><div style="color: black;">建造面积：</div></h4></td>
            	<td><input type="text" name="Area" required  placeholder="请输入建造面积"  /></td>
			</tr>
			<tr>
            	<td><h4><div style="color: black;">销售状态：</div></h4></td>
            	<td>在售<input type="radio"  name="Status" value="在售" checked="checked">
                                        待售<input type="radio" name="Status" value="待售" >
 					意向<input type="radio" name="Status" value="意向" >
 			                售出<input type="radio" name="Status" value="售出" >
 			                停售<input type="radio" name="Status" value="停售" >
			     </td>
			</tr>
			<tr>
            	<td><h4><div style="color: black;">房产经纪人ID：</div></h4></td>
            	<td><input type="number" name="AgentID" required  placeholder="请输入房产经纪人ID"/></td>
			</tr>
			<tr>
            	<td><h4><div style="color: black;">顾客ID：</div></h4></td>
            	<td><input type="number" name="UserID" required  placeholder="请输入顾客ID"/></td>
			</tr>
			<tr>
				<td></td>
				<td>
				<div align="center">
				<button type="submit">提&nbsp&nbsp&nbsp交</button>
				&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
				<button type="reset">清&nbsp&nbsp&nbsp空</button>
				</div>
				</td>
			</tr>
		</table>
    </div>
    </form>
	<script type="text/javascript">

    function checkUser(str){
	var idc = document.getElementById("Address").value;
	var sp = document.getElementById("span3");
	var re = /([^省]+省|.+自治区|[^市]+市)([^自治州]+自治州|[^市]+市|[^盟]+盟|[^地区]+地区|.+区划)([^市]+市|[^县]+县|[^旗]+旗|.+区)/;
	if (re.test(str)) {
	    sp.innerHTML = "格式正确"
	} else {
	sp.innerHTML = "输入格式有误"
	}
	}
    </script>
</body>
</html>