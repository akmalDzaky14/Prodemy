package com.telusko_14;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class MyServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		PrintWriter out = res.getWriter();
		out.print("Hi ");
		
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("Name");
		out.print(str);
	}
	
}
