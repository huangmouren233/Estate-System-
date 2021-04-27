package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Dao;
import pojo.fangchan;
/**
 * Servlet implementation class addfangchanServlet
 */
@WebServlet("/addfangchanServlet")
public class addfangchanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addfangchanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
        //获取数据
        String RoomType = req.getParameter("RoomType");
        String Address = req.getParameter("Address");
        String Year = req.getParameter("Year");
        String Sales = req.getParameter("Sales");
        String Area = req.getParameter("Area");
        String Status = req.getParameter("Status");
        String AgentID = req.getParameter("AgentID");
        String UserID = req.getParameter("UserID");
        
        fangchan fangchan = new fangchan(RoomType,Address,Year,Area,Sales,Status,AgentID,UserID);
        
        //添加后消息显示
        if(Dao.addfangchan(fangchan)) {
            req.setAttribute("message", "添加成功");
            req.getRequestDispatcher("addfangchan.jsp").forward(req,resp);
        } else {
            req.setAttribute("message", "添加失败，请重新录入");
            req.getRequestDispatcher("addfangchan.jsp").forward(req,resp);
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
