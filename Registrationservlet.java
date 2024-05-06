package com.sat.tmf.servlet;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registrationservlet")
public class Registrationservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Registrationservlet() {
        super();
    }
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String phno=request.getParameter("phno");
		String email=request.getParameter("email");
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String dateofbirth=request.getParameter("dob");
		String password=request.getParameter("password"); 
		System.out.println("done");
		user u=new user();
		u.setPhoneNumber(phno);
		u.setFirstName(firstname);
		u.setLastName(lastname);
		u.setEmail(email);
		u.setDateofBirth(dateofbirth);
		u.setPassword(password);
		PaymentwebappDAO pd=new PaymentwebappDAO();
		pd.insert(u);

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
