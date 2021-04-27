package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Dao;

/**
 * Servlet implementation class jiaoyi1Servlet
 */
@WebServlet("/jiaoyi1Servlet")
public class jiaoyi1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public jiaoyi1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
        String HouseID = req.getParameter("houseid");
        if(Dao.jiaoyifangchan1(HouseID))
        {
        	req.setAttribute("message", "交易成功！");
        	req.getRequestDispatcher("menu2.jsp").forward(req,resp);
        }
        else
        {
        	req.setAttribute("message", "交易失败！");
        	req.getRequestDispatcher("menu2.jsp").forward(req,resp);
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
