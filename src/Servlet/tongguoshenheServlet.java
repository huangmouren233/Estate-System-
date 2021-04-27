package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Dao;
/**
 * Servlet implementation class tongguoshenheServlet
 */
@WebServlet("/tongguoshenheServlet")
public class tongguoshenheServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public tongguoshenheServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
        String UserID = req.getParameter("id");
        if(Dao.tongguoshenhe(UserID))
        {
        	req.setAttribute("message", "审核成功！");
        	req.getRequestDispatcher("menu1.jsp").forward(req,resp);
        }
        else
        {
        	req.setAttribute("message", "审核失败！");
        	req.getRequestDispatcher("menu1.jsp").forward(req,resp);
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
