package com;
import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Score/detail")
public class DetailController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String location = req.getParameter("id");
		Service sv = new Service();
		User us = sv.getlocationlist(location);

		System.out.println(us.getMaker());
		req.setAttribute("li", us);
		req.getRequestDispatcher("/WEB-INF/Score/detail.jsp").forward(req, resp);
	}
}
