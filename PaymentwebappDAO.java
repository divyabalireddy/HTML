package com.sat.tmf.servlet;
import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PaymentwebappDAO {
	public void insert(user u)
	{
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
				 
				 Connection  con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/softbound","root","root");
				 Statement stmt = con.createStatement();
				String query = "insert into user_info(phone_number,email,first_name,last_name,Date_of_birth,user_password)values('"+u.PhoneNumber+"','"+u.Email+"','"+u.FirstName+"','"+u.LastName+"','"+u.getDateofBirth()+"','"+u.Password+"')";
				System.out.println(query);
				stmt.executeUpdate(query);
				con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	public boolean validlogin(String phonenumber,String password)
	{
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
				 
				 Connection  con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/softbound","root","root");
				 Statement stmt = con.createStatement();
				String query = "select phone_number,user_password from user_info";
				ResultSet rs=stmt.executeQuery(query);
				while(rs.next())
				{
					if(rs.getString("phone_number").equals(phonenumber)&& rs.getString("password").equals(password))
					{
						return true;
					}
				}
				System.out.println(query);
				
				con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		    return false;
	}
	public List<Bankaccount>getBADetailsByuserID(int userId){
		List<Bankaccount> Ba= new ArrayList<Bankaccount>();
		
		return Ba;
		
		
		
	}

}
