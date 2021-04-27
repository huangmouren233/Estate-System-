package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DBUtil.DBUtil;
import pojo.fangchan;
import pojo.fangchanjingjiren;
import pojo.guke;
public class Dao {
    //
    
	public static boolean searchagentid(String id) {
        boolean f = false;
        String sql = "select * from fangchanjingjiren where AgentID = '" + id + "'";
        //
        Connection conn = DBUtil.getConn();
        Statement state = null;
        ResultSet rs = null;       
        try {
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            if (rs.next()) {
                f = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(rs, state, conn);
        }
        return f;
    	} 
	public static List<fangchanjingjiren> searchagent(String id) {
        String sql = "select * from fangchanjingjiren where AgentID = '" + id + "'";
        List<fangchanjingjiren> list = new ArrayList<>();
        Connection conn = DBUtil.getConn();
        Statement state = null;
        ResultSet rs = null;

        try {
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            fangchanjingjiren bean = null;
            while (rs.next()) {
            	String AgentID = rs.getString("AgentID");
            	String AgentName = rs.getString("AgentName");
                String AgentAddress = rs.getString("AgentAddress");
                String Phone = rs.getString("Phone");
                String password = rs.getString("password");
                bean = new fangchanjingjiren(AgentID,AgentName,AgentAddress,Phone,password);
                list.add(bean);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(rs, state, conn);
        }
        
        return list;
    }
	 public static boolean fangchanjingjiren(String id,String pwd) {
         boolean f = false;
         String sql = "select * from fangchanjingjiren where AgentID = '" + id + "' and password = '"+ pwd +"'";
         //
         Connection conn = DBUtil.getConn();
         Statement state = null;
         ResultSet rs = null;       
         try {
             state = conn.createStatement();
             rs = state.executeQuery(sql);
             if (rs.next()) {
                 f = true;
             }
         } catch (SQLException e) {
             e.printStackTrace();
         } finally {
             DBUtil.close(rs, state, conn);
         }
         return f;
     } 
	 public static boolean guke(String id,String pwd) {
         boolean f = false;
         String sql = "select * from guke where UserID = '" + id + "' and password = '"+ pwd +"'";
         //
         Connection conn = DBUtil.getConn();
         Statement state = null;
         ResultSet rs = null;       
         try {
             state = conn.createStatement();
             rs = state.executeQuery(sql);
             if (rs.next()) {
            	 String zhuangtai = rs.getString("zhuangtai");
            	 if("过审".equals(zhuangtai))
            	 {
                 f = true;
            	 }
             }
         } catch (SQLException e) {
             e.printStackTrace();
         } finally {
             DBUtil.close(rs, state, conn);
         }
         return f;
     }
	 
	 
        public static boolean admin(String id,String pwd) {
            boolean f = false;
            String sql = "select * from admin where id = '" + id + "' and password = '"+ pwd +"'";
            //
            Connection conn = DBUtil.getConn();
            Statement state = null;
            ResultSet rs = null;       
            try {
                state = conn.createStatement();
                rs = state.executeQuery(sql);
                if (rs.next()) {
                    f = true;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                DBUtil.close(rs, state, conn);
            }
            return f;
        }
        
        
        public static boolean addfangchan(fangchan fangchan)
    	{
    		
    	        String sql = "insert into fangchan(HouseID,RoomType,Address,Year,Area,Sales,Status,AgentID,UserID) values('" + "20201222"+ "','" + fangchan.getRoomtype() + "','" +  fangchan.getAddress() + "','" + fangchan.getYear() + "','" + fangchan.getArea() + "','" + fangchan.getSales() + "','" + fangchan.getStatus() + "','" + fangchan.getAgentid() + "','" + fangchan.getUserid() + "')";
    	        //创建数据库链接
    	        Connection conn = DBUtil.getConn();
    	        Statement state = null;
    	        boolean f = false;
    	        int a = 0;
    	        
    	        try {
    	            state = conn.createStatement();
    	            a = state.executeUpdate(sql);
    	        } catch (Exception e) {
    	            e.printStackTrace();
    	        } finally {
    	            //关闭连接
    	            DBUtil.close(state, conn);
    	        }
    	        if (a > 0) {
    	            f = true;
    	        }
    	        return f;
    	}
        
        public static boolean addfangchanjingji(fangchanjingjiren fangchanjingji)
    	{
    		
    	        String sql = "insert into fangchanjingjiren(AgentID,AgentName,AgentAddress,Phone) values('" + fangchanjingji.getAgentid() + "','" +  fangchanjingji.getAgentname() + "','" + fangchanjingji.getAgentaddress() + "','" + fangchanjingji.getPhone() +  "')";
    	        //创建数据库链接
    	        Connection conn = DBUtil.getConn();
    	        Statement state = null;
    	        boolean f = false;
    	        int a = 0;
    	        
    	        try {
    	            state = conn.createStatement();
    	            a = state.executeUpdate(sql);
    	        } catch (Exception e) {
    	            e.printStackTrace();
    	        } finally {
    	            //关闭连接
    	            DBUtil.close(state, conn);
    	        }
    	        if (a > 0) {
    	            f = true;
    	        }
    	        return f;
    	}
        public static boolean addguke(guke guke)
    	{
    		
    	        String sql = "insert into guke(UserID,UserName,sex,IdNumber,Phone,User,password,zhuangtai) values('" + guke.getUserid() + "','" +  guke.getUsername() + "','" + guke.getSex() + "','" + guke.getIdnumber() + "','" + guke.getPhone() + "','" + guke.getUser() + "','" + guke.getPassword() + "','" + guke.getZhuangtai() +  "')";
    	        //创建数据库链接
    	        Connection conn = DBUtil.getConn();
    	        Statement state = null;
    	        boolean f = false;
    	        int a = 0;
    	        
    	        try {
    	            state = conn.createStatement();
    	            a = state.executeUpdate(sql);
    	        } catch (Exception e) {
    	            e.printStackTrace();
    	        } finally {
    	            //关闭连接
    	            DBUtil.close(state, conn);
    	        }
    	        if (a > 0) {
    	            f = true;
    	        }
    	        return f;
    	}
        
        
        static String  passwordyanzheng;
        public static boolean findpassword(String agentid,String password) {
	        String sql = "select * from fangchanjingjiren where AgentID = '" + agentid + "'";
	        Connection conn = DBUtil.getConn();
	        Statement state = null;
	        ResultSet rs = null;
	        boolean f = false;
	        try {
	        	state = conn.createStatement();
	            rs = state.executeQuery(sql);
	            while (rs.next()) {
	            	passwordyanzheng = rs.getString("password");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DBUtil.close(state, conn);
	        }
	        
	        if (password.equals(passwordyanzheng)) {
	            f = true;
	        }
	        return f;
	    }
        
        public static boolean updatepassword2(String agentid,String newpassword) {
	        String sql = "update fangchanjingjiren set password='" + newpassword + "' where AgentID='" + agentid + "'";
	        Connection conn = DBUtil.getConn();
	        Statement state = null;
	        boolean f = false;
	        int a = 0;

	        try {
	            state = conn.createStatement();
	            a = state.executeUpdate(sql);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DBUtil.close(state, conn);
	        }
	        
	        if (a > 0) {
	            f = true;
	        }
	        return f;
	    }
        
        
        
        
        static String  passwordyanzheng1;
        public static boolean findpassword1(String userid,String password) {
	        String sql = "select * from guke where UserID = '" + userid + "'";
	        Connection conn = DBUtil.getConn();
	        Statement state = null;
	        ResultSet rs = null;
	        boolean f = false;
	        try {
	        	state = conn.createStatement();
	            rs = state.executeQuery(sql);
	            while (rs.next()) {
	            	passwordyanzheng1 = rs.getString("password");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DBUtil.close(state, conn);
	        }
	        
	        if (password.equals(passwordyanzheng1)) {
	            f = true;
	        }
	        return f;
	    }
        
        
        
        
        public static boolean updatepassword3(String userid,String newpassword) {
	        String sql = "update guke set password='" + newpassword + "' where UserID='" + userid + "'";
	        Connection conn = DBUtil.getConn();
	        Statement state = null;
	        boolean f = false;
	        int a = 0;

	        try {
	            state = conn.createStatement();
	            a = state.executeUpdate(sql);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DBUtil.close(state, conn);
	        }
	        
	        if (a > 0) {
	            f = true;
	        }
	        return f;
	    }
        
        
        
        public static List<guke> gukelist() {
	        String sql = "select * from guke";
	        List<guke> list = new ArrayList<>();
	        Connection conn = DBUtil.getConn();
	        Statement state = null;
	        ResultSet rs = null;

	        try {
	            state = conn.createStatement();
	            rs = state.executeQuery(sql);
	            guke bean = null;
	            while (rs.next()) {
	            	String UserID = rs.getString("UserID");
	            	String UserName = rs.getString("UserName");
	                String sex = rs.getString("sex");
	                String IdNumber = rs.getString("IdNumber");
	                String Phone = rs.getString("Phone");
	                String User = rs.getString("User");
	                String zhuangtai = rs.getString("zhuangtai");
	                String password = rs.getString("password");
	            if("未过审".equals(zhuangtai)) {
	                bean = new guke(UserID,UserName,sex,IdNumber,Phone,User,password);
	                bean.setZhuangtai(zhuangtai);
	                list.add(bean);
	            }
	                else {
	                }
	            }
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DBUtil.close(rs, state, conn);
	        }
	        
	        return list;
	    }
        public static boolean resetjingjirenpassword(String agentid) {
	        String sql = "update fangchanjingjiren set password='" + "123456" + "' where AgentID='" + agentid + "'";
	        Connection conn = DBUtil.getConn();
	        Statement state = null;
	        boolean f = false;
	        int a = 0;

	        try {
	            state = conn.createStatement();
	            a = state.executeUpdate(sql);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DBUtil.close(state, conn);
	        }
	        
	        if (a > 0) {
	            f = true;
	        }
	        return f;
	    }
        public static boolean tongguoshenhe(String UserID) {
	        String sql = "update guke set zhuangtai='" + "过审" + "' where UserID='" + UserID + "'";
	        Connection conn = DBUtil.getConn();
	        Statement state = null;
	        boolean f = false;
	        int a = 0;

	        try {
	            state = conn.createStatement();
	            a = state.executeUpdate(sql);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DBUtil.close(state, conn);
	        }
	        
	        if (a > 0) {
	            f = true;
	        }
	        return f;
	    }
        public static boolean updatefangchanagentid(String agentid,String houseid) {
	        String sql = "update fangchan set AgentID='" + agentid + "' where HouseID='" + houseid + "'";
	        Connection conn = DBUtil.getConn();
	        Statement state = null;
	        boolean f = false;
	        int a = 0;

	        try {
	            state = conn.createStatement();
	            a = state.executeUpdate(sql);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DBUtil.close(state, conn);
	        }
	        
	        if (a > 0) {
	            f = true;
	        }
	        return f;
	    }
        public static boolean updatestatus(String status,String houseid) {
	        String sql = "update fangchan set Status='" + status + "' where HouseID='" + houseid + "'";
	        Connection conn = DBUtil.getConn();
	        Statement state = null;
	        boolean f = false;
	        int a = 0;

	        try {
	            state = conn.createStatement();
	            a = state.executeUpdate(sql);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DBUtil.close(state, conn);
	        }
	        
	        if (a > 0) {
	            f = true;
	        }
	        return f;
	    }
        public static boolean tingshou(String HouseID) {
	        String sql = "update fangchan set Status='" + "停售" + "' where HouseID='" + HouseID + "'";
	        Connection conn = DBUtil.getConn();
	        Statement state = null;
	        boolean f = false;
	        int a = 0;

	        try {
	            state = conn.createStatement();
	            a = state.executeUpdate(sql);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DBUtil.close(state, conn);
	        }
	        
	        if (a > 0) {
	            f = true;
	        }
	        return f;
	    }
        public static boolean fangchanshenhe(String HouseID,String AgentID) {
	        String sql = "update fangchan set Status='" + "待售" +"', AgentID='" + AgentID +  "' where HouseID='" + HouseID + "'";
	        Connection conn = DBUtil.getConn();
	        Statement state = null;
	        boolean f = false;
	        int a = 0;

	        try {
	            state = conn.createStatement();
	            a = state.executeUpdate(sql);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DBUtil.close(state, conn);
	        }
	        
	        if (a > 0) {
	            f = true;
	        }
	        return f;
	    }
        public static boolean buyfangchan1(String HouseID) {
	        String sql = "update fangchan set Status='" + "意向" +"' where HouseID='" + HouseID + "'";
	        Connection conn = DBUtil.getConn();
	        Statement state = null;
	        boolean f = false;
	        int a = 0;

	        try {
	            state = conn.createStatement();
	            a = state.executeUpdate(sql);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DBUtil.close(state, conn);
	        }
	        
	        if (a > 0) {
	            f = true;
	        }
	        return f;
	    }
        public static boolean jiaoyifangchan1(String HouseID) {
	        String sql = "update fangchan set Status='" + "售出" +"'where HouseID='" + HouseID + "'";
	        Connection conn = DBUtil.getConn();
	        Statement state = null;
	        boolean f = false;
	        int a = 0;

	        try {
	            state = conn.createStatement();
	            a = state.executeUpdate(sql);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DBUtil.close(state, conn);
	        }
	        
	        if (a > 0) {
	            f = true;
	        }
	        return f;
	    }
        public static List<fangchan> fangchanlist() {
	        String sql = "select * from fangchan";
	        List<fangchan> list = new ArrayList<>();
	        Connection conn = DBUtil.getConn();
	        Statement state = null;
	        ResultSet rs = null;

	        try {
	            state = conn.createStatement();
	            rs = state.executeQuery(sql);
	            fangchan bean = null;
	            while (rs.next()) {
	            	String HouseID = rs.getString("HouseID");
	            	String RoomType = rs.getString("RoomType");
	                String Address = rs.getString("Address");
	                String Year = rs.getString("Year");
	                String Area = rs.getString("Area");
	                String Sales = rs.getString("Sales");
	                String Status = rs.getString("Status");
	                String AgentID = rs.getString("AgentID");
	                String UserID = rs.getString("UserID");
	                bean = new fangchan(RoomType,Address,Year,Area,Sales,Status,AgentID,UserID);
	                bean.setHouseid(HouseID);
	                list.add(bean);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DBUtil.close(rs, state, conn);
	        }
	        
	        return list;
	    }
        public static List<fangchanjingjiren> fangchanjingjirenlist(String id) {
	        String sql = "select * from fangchanjingjiren where AgentID = '" + id + "'";
	        List<fangchanjingjiren> list = new ArrayList<>();
	        Connection conn = DBUtil.getConn();
	        Statement state = null;
	        ResultSet rs = null;

	        try {
	            state = conn.createStatement();
	            rs = state.executeQuery(sql);
	            fangchanjingjiren bean = null;
	            while (rs.next()) {
	            	String agentid = rs.getString("agentid");
	            	String agentname = rs.getString("agentname");
	                String agentaddress = rs.getString("agentaddress");
	                String phone = rs.getString("phone");
	                String password = rs.getString("password");
	                bean = new fangchanjingjiren(agentid,agentname,agentaddress,phone,password);
	                list.add(bean);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DBUtil.close(rs, state, conn);
	        }
	        
	        return list;
	    }
        
        public static List<guke> gukelist(String id) {
	        String sql = "select * from guke where UserID = '" + id + "'";
	        List<guke> list = new ArrayList<>();
	        Connection conn = DBUtil.getConn();
	        Statement state = null;
	        ResultSet rs = null;

	        try {
	            state = conn.createStatement();
	            rs = state.executeQuery(sql);
	            guke bean = null;
	            while (rs.next()) {
	            	String userid = rs.getString("userid");
	            	String username = rs.getString("username");
	                String idnumber = rs.getString("idnumber");
	                String sex = rs.getString("idnumber");
	                String phone = rs.getString("phone");
	                String user = rs.getString("user");
	                String password = rs.getString("password");
	                bean = new guke(userid,username,sex,idnumber,phone,user,password);
	                list.add(bean);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DBUtil.close(rs, state, conn);
	        }
	        
	        return list;
	    }
        public static List<fangchan> find(String houseid) {
	        String sql = "select * from fangchan where HouseID ='"+ houseid +"'";
	        List<fangchan> list = new ArrayList<>();
	        Connection conn = DBUtil.getConn();
	        Statement state = null;
	        ResultSet rs = null;
	        try {
	            state = conn.createStatement();
	            rs = state.executeQuery(sql);
	            fangchan bean = null;
	            while (rs.next()) {
	            	String HouseID = rs.getString("HouseID");
	            	String RoomType = rs.getString("RoomType");
	                String Address = rs.getString("Address");
	                String Year = rs.getString("Year");
	                String Area = rs.getString("Area");
	                String Sales = rs.getString("Sales");
	                String Status = rs.getString("Status");
	                String AgentID = rs.getString("AgentID");
	                String UserID = rs.getString("UserID");
	                bean = new fangchan(RoomType,Address,Year,Area,Sales,Status,AgentID,UserID);
	                bean.setHouseid(HouseID);
	                list.add(bean);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DBUtil.close(rs, state, conn);
	        }
	        
	        return list;
	    }
        public static List<fangchan> showfangchan2(String id) {
	        String sql = "select * from fangchan where AgentID ='"+ id +"'";
	        List<fangchan> list = new ArrayList<>();
	        Connection conn = DBUtil.getConn();
	        Statement state = null;
	        ResultSet rs = null;
	        try {
	            state = conn.createStatement();
	            rs = state.executeQuery(sql);
	            fangchan bean = null;
	            while (rs.next()) {
	            	String HouseID = rs.getString("HouseID");
	            	String RoomType = rs.getString("RoomType");
	                String Address = rs.getString("Address");
	                String Year = rs.getString("Year");
	                String Area = rs.getString("Area");
	                String Sales = rs.getString("Sales");
	                String Status = rs.getString("Status");
	                String AgentID = rs.getString("AgentID");
	                String UserID = rs.getString("UserID");
	                bean = new fangchan(RoomType,Address,Year,Area,Sales,Status,AgentID,UserID);
	                bean.setHouseid(HouseID);
	                list.add(bean);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DBUtil.close(rs, state, conn);
	        }
	        
	        return list;
	    }
        
        public static List<fangchan> showfangchan4(String id) {
	        String sql = "select * from fangchan where AgentID like '%"+ id +"%' and Status like '%"+ "意向" +"%'";
	        List<fangchan> list = new ArrayList<>();
	        Connection conn = DBUtil.getConn();
	        Statement state = null;
	        ResultSet rs = null;
	        try {
	            state = conn.createStatement();
	            rs = state.executeQuery(sql);
	            fangchan bean = null;
	            while (rs.next()) {
	            	String HouseID = rs.getString("HouseID");
	            	String RoomType = rs.getString("RoomType");
	                String Address = rs.getString("Address");
	                String Year = rs.getString("Year");
	                String Area = rs.getString("Area");
	                String Sales = rs.getString("Sales");
	                String Status = rs.getString("Status");
	                String AgentID = rs.getString("AgentID");
	                String UserID = rs.getString("UserID");
	                bean = new fangchan(RoomType,Address,Year,Area,Sales,Status,AgentID,UserID);
	                bean.setHouseid(HouseID);
	                list.add(bean);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DBUtil.close(rs, state, conn);
	        }
	        
	        return list;
	    }
        public static List<fangchan> searchfangchan2(fangchan bean) {
        	String sql = "select * from fangchan where AgentID like '%" + bean.getAgentid() + "%' and ";
            
            if (bean.getAddress() != "") {
                sql += "Address like '%" + bean.getAddress() + "%'";
            }
            else if (bean.getArea() != "") {
                sql += "Area like '%" + bean.getArea() + "%'";
            }
            else if (bean.getRoomtype() != "") {
                sql += "RoomType like '%" + bean.getRoomtype() + "%'";
            }
            else if (bean.getSales() != "") {
                sql += "Sales like '%" + bean.getSales() + "%'";
            }
            else if (bean.getYear() != "") {
                sql += "Year like '%" + bean.getYear() + "%'";
            }
            else 
            {
            }
	        List<fangchan> list = new ArrayList<>();
	        Connection conn = DBUtil.getConn();
	        Statement state = null;
	        ResultSet rs = null;
	        try {
	            state = conn.createStatement();
	            rs = state.executeQuery(sql);
	            fangchan bean1 = null;
	            while (rs.next()) {
	            	String HouseID = rs.getString("HouseID");
	            	String RoomType = rs.getString("RoomType");
	                String Address = rs.getString("Address");
	                String Year = rs.getString("Year");
	                String Area = rs.getString("Area");
	                String Sales = rs.getString("Sales");
	                String Status = rs.getString("Status");
	                String AgentID = rs.getString("AgentID");
	                String UserID = rs.getString("UserID");
	                bean1 = new fangchan(RoomType,Address,Year,Area,Sales,Status,AgentID,UserID);
	                bean1.setHouseid(HouseID);
	                list.add(bean1);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DBUtil.close(rs, state, conn);
	        }
	        return list;
	    }
        public static List<fangchan> showfangchan3() {
	        String sql = "select * from fangchan where Status ='"+ "在售" +"'";
	        List<fangchan> list = new ArrayList<>();
	        Connection conn = DBUtil.getConn();
	        Statement state = null;
	        ResultSet rs = null;
	        try {
	            state = conn.createStatement();
	            rs = state.executeQuery(sql);
	            fangchan bean = null;
	            while (rs.next()) {
	            	String HouseID = rs.getString("HouseID");
	            	String RoomType = rs.getString("RoomType");
	                String Address = rs.getString("Address");
	                String Year = rs.getString("Year");
	                String Area = rs.getString("Area");
	                String Sales = rs.getString("Sales");
	                String Status = rs.getString("Status");
	                String AgentID = rs.getString("AgentID");
	                String UserID = rs.getString("UserID");
	                bean = new fangchan(RoomType,Address,Year,Area,Sales,Status,AgentID,UserID);
	                bean.setHouseid(HouseID);
	                list.add(bean);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DBUtil.close(rs, state, conn);
	        }
	        
	        return list;
	    }
        public static List<fangchan> searchfangchan3(fangchan bean) {
        	String sql = "select * from fangchan where Status like '%" + "在售" + "%' and ";
            
            if (bean.getAddress() != "") {
                sql += "Address like '%" + bean.getAddress() + "%'";
            }
            else if (bean.getArea() != "") {
                sql += "Area like '%" + bean.getArea() + "%'";
            }
            else if (bean.getRoomtype() != "") {
                sql += "RoomType like '%" + bean.getRoomtype() + "%'";
            }
            else if (bean.getSales() != "") {
                sql += "Sales like '%" + bean.getSales() + "%'";
            }
            else if (bean.getYear() != "") {
                sql += "Year like '%" + bean.getYear() + "%'";
            }
            else 
            {
            }
	        List<fangchan> list = new ArrayList<>();
	        Connection conn = DBUtil.getConn();
	        Statement state = null;
	        ResultSet rs = null;
	        try {
	            state = conn.createStatement();
	            rs = state.executeQuery(sql);
	            fangchan bean1 = null;
	            while (rs.next()) {
	            	String HouseID = rs.getString("HouseID");
	            	String RoomType = rs.getString("RoomType");
	                String Address = rs.getString("Address");
	                String Year = rs.getString("Year");
	                String Area = rs.getString("Area");
	                String Sales = rs.getString("Sales");
	                String Status = rs.getString("Status");
	                String AgentID = rs.getString("AgentID");
	                bean1 = new fangchan(RoomType,Address,Year,Area,Sales,Status,AgentID,null);
	                bean1.setHouseid(HouseID);
	                list.add(bean1);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DBUtil.close(rs, state, conn);
	        }
	        
	        return list;
	    }
}