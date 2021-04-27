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

/**
 * Servlet implementation class searchfangchan3Servlet
 */
@WebServlet("/searchfangchan3Servlet")
public class searchfangchan3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchfangchan3Servlet() {
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
        fangchan fangchan = new fangchan(RoomType,Address,Year,Area,Sales,null,null,null);
        
        //添加后消息显示
        List<fangchan> fangchans =Dao.searchfangchan3(fangchan);
            req.setAttribute("fangchans",fangchans);
            req.getRequestDispatcher("showfangchan3.jsp").forward(req,resp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
