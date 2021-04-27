<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>房产信息列表</title>
</head>
<%
	String houseid = request.getParameter("HouseID");
	String roomtype = request.getParameter("RoomType");
	String address = request.getParameter("Address");
	String year = request.getParameter("Year");
	String sales = request.getParameter("Sales");
	String area = request.getParameter("Area");
	String status = request.getParameter("Status");
	String agentid = request.getParameter("AgentID");
	String userid = request.getParameter("UserID");
%>
<body>
    <div align="center">
        <h1 style="color: black;">信息列表</h1>
        
        <a href="menu1.jsp"><div style="color: black;">返回主页</div></a>
        <br>
        <table border="6">
            <tr>
                <td>序号</td>
                <td>户型</td>
                <td>房产地址</td>
                <td>建造年份</td>
               	<td>建造面积</td>
                <td>销售报价</td>
                <td>销售状态</td>
                <td>顾客ID</td>
                <td>房产经纪人ID</td>
                <td></td>
                <td></td>
				<td></td>	
            </tr>
                <tr>
                    <td><%=houseid%></td>
                    <td><%=roomtype%></td>
                    <td><%=address%></td>
                    <td><%=year%></td>
                    <td><%=sales%></td>
                    <td><%=area%></td>
                    <td><%=status%></td>
                    <td><%=userid%></td>
                    <td><input type="text" name="agent" id ="agent" value=<%=agentid%>></td>
                    <td><button type=button onclick="get()">修改</button>
                    <td><button type=button onclick="window.location.href='updatestatusServlet?status=待售&houseid=<%=houseid%>'">授权</button></td>
                	<td><button type=button onclick="window.location.href='updatestatusServlet?status=停售&houseid=<%=houseid%>'">停售</button></td>
                </tr>
        </table>
    </div>
    <script type="text/javascript">
    function get(){
	var agent = document.getElementById("agent").value;
	 	window.open("updateagentServlet?houseid="+<%=houseid%>+"&"+"agentid="+agent);
	}
    </script>
</body>
</html>