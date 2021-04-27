package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Dao;
import pojo.fangchan;
import pojo.fangchanjingjiren;

/**
 * Servlet implementation class searchServlet
 */
@WebServlet("/searchServlet")
public class searchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
        String AgentID = request.getParameter("AgentID");
        List<fangchanjingjiren> fangchanjingjirens = Dao.searchagent(AgentID);
        if((fangchanjingjirens)!=null&&(!(fangchanjingjirens.isEmpty())))
        {
        	request.setAttribute("message", "查询成功");
        	request.setAttribute("fangchanjingjirens", fangchanjingjirens);
        	request.getRequestDispatcher("fangchanjingjirenlist.jsp").forward(request,response);
        }
        else
        {
        	request.setAttribute("message", "此房产经纪人不存在！");
        	request.getRequestDispatcher("updateadminpassword.jsp").forward(request,response);
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
