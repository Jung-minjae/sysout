package com.mvc.web.controller.admin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.jdbc.app.entity.Notice;
import com.mvc.web.service.NoticeService;
@MultipartConfig(
//		location ="/tmp",    //어디에 저장을 할건지 파일 저장 (경로, 파일은 Part의 write 메서드가 호출될 때 저장)
		fileSizeThreshold = 1024*1024, // 임시파일의 크기
		maxFileSize =1024*1024*50, //최대 업로드 파일 용량
		maxRequestSize = 1024*1024*5*5  //전체요청에 대한 파일 용량
		)

@WebServlet("/admin/board/notice/reg")
public class regController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		req.getRequestDispatcher("/WEB-INF/view/admin/board/notice/reg.jsp").forward(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		String title = req.getParameter("title");
		String content =req.getParameter("content");
		String open = req.getParameter("open");
		boolean pub = Boolean.parseBoolean(open);
		
		Collection<Part> parts =req.getParts();


		
		StringBuilder builder = new StringBuilder();
		for(Part p : parts) {
			if(!p.getName().equals("file")) continue;
			if(p.getSize()==0) continue;
		
			
			Part filePart = p;
			String fileName = p.getSubmittedFileName();
		
			builder.append(fileName);
			builder.append(",");
			
			InputStream fis =filePart.getInputStream();
			String realPath =req.getServletContext().getRealPath("/upload");
			System.out.println("realpath : "+realPath);
			
			String filePath = realPath +File.separator+fileName;
			System.out.println(filePath);
			
			File fl = new File(realPath);
			if(!fl.exists())
				fl.mkdirs();

			FileOutputStream fos = new FileOutputStream(filePath);
		
		byte[] buf = new byte[1024];		// 파일 옮기는구문			
		int size =0;						// 파일 옮기는구문 갯수

		while((size =fis.read(buf))!=-1) 	// 파일 옮기는구문 
			fos.write(buf,0,size);          // 파일 옮기는구문
		
		fos.close();
		fis.close();
		}
		
		builder.delete(builder.length()-1,builder.length());
		System.out.println("bulider :" + builder.toString());
		
		int result =0;
		
		Notice nt = new Notice();
		
		nt.setTitle(title);
		nt.setContent(content);
		nt.setWriter_id("정민재");
		nt.setFiles(builder.toString());
		nt.setPub(pub);
		
		NoticeService ns = new NoticeService();
		result = ns.insertNotice(nt);
		
		resp.sendRedirect("list");
//		

//		
//		PrintWriter out =resp.getWriter();
//		out.print("title :"+title);
//		out.print("content :"+content);
//		out.print("open :"+open);
	}
}
