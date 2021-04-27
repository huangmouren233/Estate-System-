package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Dao;
import pojo.fangchan;
import pojo.guke;

/**
 * Servlet implementation class addgukeServlet
 */
@WebServlet("/addgukeServlet")
public class addgukeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addgukeServlet() {
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
        String UserID = req.getParameter("UserID");
        String password = req.getParameter("password");
        String UserName = req.getParameter("UserName");
        String sex = req.getParameter("sex");
        String IdNumber = req.getParameter("IdNumber");
        String User = req.getParameter("User");
        String Phone = req.getParameter("Phone");        
        guke guke = new guke(UserID,UserName,sex,IdNumber,Phone,User,password);
        
        //添加后消息显示
        if(Dao.addguke(guke)) {
            req.setAttribute("message", "添加成功");
            req.getRequestDispatcher("addguke.jsp").forward(req,resp);
        } else {
            req.setAttribute("message", "添加失败，请重新录入");
            req.getRequestDispatcher("addguke.jsp").forward(req,resp);
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
