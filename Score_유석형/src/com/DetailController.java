package com;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/examdetail")
public class DetailController extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Service sc = new Service();
		
		String name = req.getParameter("name");
	
		System.out.println(name);
		
		User user = sc.getUser(name);

		req.setAttribute("u", user);
		req.getRequestDispatcher("WEB-INF/detail.jsp").forward(req, resp);
	}
}
