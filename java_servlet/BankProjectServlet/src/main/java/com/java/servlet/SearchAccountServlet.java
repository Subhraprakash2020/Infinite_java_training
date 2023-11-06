package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchAccountServlet
 */
public class SearchAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchAccountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		int account_no = Integer.parseInt(request.getParameter("account_no"));
		BankDAOImpl dao = new BankDAOImpl();
		PrintWriter out = response.getWriter();
		
		try {
			Bank bank = dao.searchAccountDao(account_no);
			if(bank != null) {
				out.println("Account No "+bank.getAccountNo()+ "<br>");
				out.println("First Name "+bank.getFirstName()+ "<br>");
				out.println("Second Name "+bank.getLastName()+ "<br>");
				out.println("City "+bank.getCity()+ "<br>");
				out.println("State"+bank.getState()+"<br>");
				out.println("Amount"+bank.getAmount()+"<br>");
				out.println("Check Facility"+bank.getCheqFacil()+"<br>");
				out.println("Check status"+bank.getStatus()+"<br>");
				out.println("Date of open "+bank.getDateOfOpen()+"<br>");
				out.println("----------------------------------------------");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
