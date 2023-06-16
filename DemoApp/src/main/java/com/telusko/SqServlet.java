package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		// Receive session data from req object
		HttpSession session = req.getSession();
		
		// Assign data1 data to new variable
		int data1 = (int) session.getAttribute("data1");
		

		data1 = data1 * data1;

		PrintWriter out = res.getWriter();
		out.print("squared result is: " + data1);
		
		// remove data1 value from session
		// session.removeAttribute("data1");
	}
}
