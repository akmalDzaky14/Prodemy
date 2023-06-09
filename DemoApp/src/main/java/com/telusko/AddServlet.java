package com.telusko;
/* 
 * History: 
 * 8. RequestDispatcher and Calling Servlet on Servlet
 * 9. sendRedirect and URL Rewriting
 * 10. Session and Cookie	
 * */

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.*;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		// Receive variable value from Client request ('submit' from index.html)
		int dataNum1 = Integer.parseInt(req.getParameter("num1"));
		int dataNum2 = Integer.parseInt(req.getParameter("num2"));

		int addData = dataNum1 + dataNum2;

		PrintWriter out = res.getWriter();
		out.print("Output: " + addData);

//		// Call method library cookie and assign add data to data1 object
//		Cookie cookie = new Cookie("data1", addData + "");
//		// Assign cookie object to res object
//		res.addCookie(cookie);
//
//		// send data to /sq url-pattern
//		res.sendRedirect("sq");
	}
}
