package com.sat.tmf.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Loginservlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String phonenumber=request.getParameter("phno");
		String password=request.getParameter("password");
		PaymentwebappDAO pd=new PaymentwebappDAO();
		if(pd.validlogin(phonenumber, password))
		{
			RequestDispatcher rd=request.getRequestDispatcher("/Dashboard.html");
			rd.forward(request, response);
		}
		else
		{
			response.getWriter().write("invalid");
			RequestDispatcher rd=request.getRequestDispatcher("/Dashboard.html");
			rd.include(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
