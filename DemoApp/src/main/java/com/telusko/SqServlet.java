package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		int data1 = 0;
		// Call method library cookie and create array to save multiple data
		Cookie cookies[] = req.getCookies();

		// looping for each data present in cookies array
		for (Cookie c : cookies) {
			// if data name match, it will execute the code
			if (c.getName().equals("data1")) {
				// convert String to Int
				data1 = Integer.parseInt(c.getValue());

			}
		}

		data1 = data1 * data1;

		PrintWriter out = res.getWriter();
		out.print("squared result is: " + data1);
	}
}
