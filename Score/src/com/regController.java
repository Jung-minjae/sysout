package com;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Score/reg")
public class regController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/WEB-INF/Score/reg.jsp").forward(req,resp);
	}

	@Override
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		int Locid = Integer.parseInt(req.getParameter("Locid"));
		String Enemy =req.getParameter("Enemy");
		String Hiter = req.getParameter("Hiter");
		String content = req.getParameter("content");
		String memo = req.getParameter("memo");
		int result =0;
		
		User ur = new User();
		
		ur.setLocid(Locid);
		ur.setEnemy(Enemy);
		ur.setId(Hiter);
		ur.setContent(content);
		ur.setMemo(memo);
	
		
		Service sv = new Service();
		result = sv.inserttest(ur);
		
		resp.sendRedirect("list");
	


	}
}
