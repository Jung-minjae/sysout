package com.Temp.web.Controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Home_work.app.entity.Temp_N;
import com.Temp.web.service.Temp_service;

@WebServlet("/Temp") // 4
public class TempListController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Temp_service ts = new Temp_service();
		int page = 1;

		List<Temp_N> list = ts.getTempList(1); // 1

		System.out.println(list.get(0).getDate());

		req.setAttribute("TempList", list);// 2
		req.getRequestDispatcher("WEB-INF/temp/tempList.jsp").forward(req, resp);// 3
	}
}
