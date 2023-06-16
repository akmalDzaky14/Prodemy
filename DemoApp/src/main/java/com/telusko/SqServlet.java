package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		// Receive data from URL
		int data1 = Integer.parseInt(req.getParameter("k"));

		data1 = data1 * data1;

		PrintWriter out = res.getWriter();
		out.print("squared result is: " + data1);
	}
}
