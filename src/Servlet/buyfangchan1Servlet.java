package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Dao;

/**
 * Servlet implementation class buyfangchan1Servlet
 */
@WebServlet("/buyfangchan1Servlet")
public class buyfangchan1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public buyfangchan1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
        String HouseID = req.getParameter("id");
        if(Dao.buyfangchan1(HouseID))
        {
        	req.setAttribute("message", "意向表达成功！等待房产经纪人回应！");
        	req.getRequestDispatcher("menu3.jsp").forward(req,resp);
        }
        else
        {
        	req.setAttribute("message", "购买失败！");
        	req.getRequestDispatcher("menu3.jsp").forward(req,resp);
        }	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
