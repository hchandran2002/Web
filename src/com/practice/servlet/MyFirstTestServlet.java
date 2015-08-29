package com.practice.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyFirstTestServlet
 */
public class MyFirstTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyFirstTestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 	response.setContentType("text/html");
		 	String firstName = request.getParameter("first_name");
		 	String lastName = request.getParameter("last_name");
	        PrintWriter writer = response.getWriter();
	        writer.println("<html>");
	        writer.println("<head>");
	        writer.println("<title>Sample Application Servlet Page</title>");
	        writer.println("</head>");
	        writer.println("<body bgcolor=white>");
	        writer.println("<table border=\"0\">");
	        writer.println("<tr>");
	        writer.println("<td>");
	        writer.println("<img src=\"images/tomcat.gif\">");
	        writer.println("</td>");
	        writer.println("<td>");
	        writer.println("<h1>Sample Application Servlet</h1>");
	        writer.println("This is the output of a servlet that is part of");
	        writer.println("the Hello, World application.");
	        writer.println("</td>");
	        writer.println("</tr>");
	        writer.println("</table>");
	        writer.println("</body>");
	        writer.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName = request.getParameter("first_name");
	 	String lastName = request.getParameter("last_name");
	 	response.getWriter().append(lastName).append(",").append(firstName);
	 	System.out.println("Test Post");
	}

}
