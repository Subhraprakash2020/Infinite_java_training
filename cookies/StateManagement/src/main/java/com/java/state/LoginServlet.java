package com.java.state;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String user = request.getParameter("userName");
		String pwd = request.getParameter("password");
		String firstName = " ", lastName = " ";
		if(user.equals("jitu") && pwd.equals("jitu")) {
			firstName = "jitendra";
			lastName = "sahoo";
		}
		if(user.equals("ganu") && pwd.equals("ganu")) {
			firstName = "Ganesh";
			lastName = "Mirda";
		}
		if(user.equals("sonali") && pwd.equals("sonali")) {
			firstName = "Sonali";
			lastName = "sahoo";
		}
		
		out.println("<a href = 'WelComeServlet?firstName="+firstName+"&lastName="
				+lastName+"'>WelCome</a>");
	}

}
