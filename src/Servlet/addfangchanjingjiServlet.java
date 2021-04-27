package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Dao;
import pojo.fangchan;
import pojo.fangchanjingjiren;

/**
 * Servlet implementation class addfangchanjingjiServlet
 */
@WebServlet("/addfangchanjingjiServlet")
public class addfangchanjingjiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addfangchanjingjiServlet() {
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
        String AgentID = req.getParameter("AgentID");
        String AgentName = req.getParameter("AgentName");
        String AgentAddress = req.getParameter("AgentAddress");
        String Phone = req.getParameter("Phone");
        
        fangchanjingjiren fangchanjingjiren = new fangchanjingjiren(AgentID,AgentName,AgentAddress,Phone);
        
        //添加后消息显示
        if(Dao.addfangchanjingji(fangchanjingjiren)) {
            req.setAttribute("message", "添加成功");
            req.getRequestDispatcher("addfangchanjingji.jsp").forward(req,resp);
        } else {
            req.setAttribute("message", "添加失败，请重新录入");
            req.getRequestDispatcher("addfangchanjingji.jsp").forward(req,resp);
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
