package com.Temp.web.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Home_work.app.entity.Temp_N;
import com.Temp.web.service.Temp_service;

@WebServlet("/tempdetail")
public class TempListDetailController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String date = req.getParameter("date");
		Temp_service ts = new Temp_service();
		Temp_N tn = ts.gettempDetail(date);
		
		req.setAttribute("tn", tn);
		req.getRequestDispatcher("WEB-INF/temp/tempdetail.jsp").forward(req, resp);

	}
}
