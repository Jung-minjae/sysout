package com.form.web.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Formview")
public class FormViewController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("test");
		FormTestService fts = new FormTestService();
		FormService fs = fts.getUser(id);
		req.setAttribute("form", fs);
		
		req.getRequestDispatcher("WEB-INF/test/FormView.jsp").forward(req, resp);
	}

}
