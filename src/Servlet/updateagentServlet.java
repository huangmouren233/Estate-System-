package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Dao;

/**
 * Servlet implementation class updateagentServlet
 */
@WebServlet("/updateagentServlet")
public class updateagentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateagentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
        String agentid = request.getParameter("agentid");
        String houseid = request.getParameter("houseid");
        if(Dao.searchagentid(agentid))
        {
        	if(Dao.updatefangchanagentid(agentid,houseid))
        	{
        		request.setAttribute("message", "修改成功！");
        		request.getRequestDispatcher("menu1.jsp").forward(request,response);
        	}
        	else
        	{
        		request.setAttribute("message", "修改失败！");
            	request.getRequestDispatcher("menu1.jsp").forward(request,response);
        	}
        }
        else {
        	request.setAttribute("message", "此房产经纪人不存在！");
        	request.getRequestDispatcher("menu1.jsp").forward(request,response);
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
