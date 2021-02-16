package com.score.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.score.entity.score;
import com.score.service.scoreService;
@WebServlet("/ScoreList")
public class scoreController extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	scoreService ss = new scoreService();
	
	String s= "location";
	String q= ""; 
	
	if(req.getParameter("s") !=null && !(req.getParameter("s").equals(""))){
		s=req.getParameter("s");
	}
	if(req.getParameter("q") !=null && !(req.getParameter("q").equals(""))){
		q=req.getParameter("q");
	}


	try {
		List<score> sclist = ss.getList(s,q);
		req.setAttribute("slist", sclist);
		req.getRequestDispatcher("/WEB-INF/view/ScoreList.jsp").forward(req, resp);
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}

}
