package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Dao;

/**
 * Servlet implementation class updatepassword2Servlet
 */
@WebServlet("/updatepassword2Servlet")
public class updatepassword2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updatepassword2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String AgentID = req.getParameter("AgentID");
        String newpassword = req.getParameter("newpassword");
        String password = req.getParameter("password");
        if(Dao.findpassword(AgentID,password))
        {
        	Dao.updatepassword2(AgentID,newpassword);
        	req.setAttribute("message", "修改成功！");
            req.getRequestDispatcher("updatepassword2.jsp").forward(req,resp);
        }
        else
        {
        	req.setAttribute("message", "密码错误！");
            req.getRequestDispatcher("updatepassword2.jsp").forward(req,resp);
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
