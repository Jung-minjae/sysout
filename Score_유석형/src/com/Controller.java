package com;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/examlist")
public class Controller extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String c[] = req.getParameterValues("c");
		int ids[] = new int[c.length];
		
		for(int i = 0; i < c.length; i++) {
			ids[i] = Integer.parseInt(c[i]);
		}
		
		Service ns = new Service();
		int result = ns.removeNoticeAll(ids);
		
		res.sendRedirect("examlist");
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Service sc = new Service();
		int page = 1;
		String query = "";
		String query_ = req.getParameter("q");
		String page_ = req.getParameter("p");
		
		if(query_!= null && !query_.equals("")) {
			query = " = "+ query_;
		}
		
		if(page_ != null && !page_.equals("")) {
			page = Integer.parseInt(page_);
		}
		
		int count = 0;
		count = sc.getCount(query);
		
		System.out.println("count : " + count);
		System.out.println("page : " + page);
		System.out.println("query : " + query);
		
		List<User> list = sc.getUserList(page, query);
		req.setAttribute("count", count);
		req.setAttribute("list", list);
		req.getRequestDispatcher("WEB-INF/list.jsp").forward(req, resp);
	}
}
