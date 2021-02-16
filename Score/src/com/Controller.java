package com;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Score/list")
public class Controller extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		String[] openids = req.getParameterValues("open");
		String[] delids = req.getParameterValues("del");
		String cmd = req.getParameter("cmd");

		System.out.println("cmd : " + cmd);

		switch (cmd) {
		case "ÀÏ°ý°ø°³":
			break;
		case "ÀÏ°ý»èÁ¦":
			int[] ids = new int[delids.length];
			for (int i = 0; i < ids.length; i++) {
				ids[i] = Integer.parseInt(delids[i]);
			}
			Service s = new Service();
			int result = s.deleteNoticeAll(ids);
			break;
		}

		resp.sendRedirect("list");
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");

		Service sc = new Service();
		int page = 1;
		String query = "";
		String query_ = req.getParameter("q");
		String page_ = req.getParameter("p");

		if (query_ != null && !query_.equals("")) {
			query = " = " + query_;
		}

		if (page_ != null && !page_.equals("")) {
			page = Integer.parseInt(page_);
		}

		int count = 0;
		count = sc.getCount(query);

		List<User> list = sc.getUserList(page, query);
		req.setAttribute("n", list);
		req.setAttribute("count", count);
		req.getRequestDispatcher("/WEB-INF/Score/list.jsp").forward(req, resp);
	}
}