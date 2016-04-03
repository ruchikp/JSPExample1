package com.test.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.database.DatabaseConnection;


@WebServlet("/Insertdata")
public class Insertdata extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String id;

	String salary;
	String firstname,lastname,address;
	String query;
	
	Connection con;
	Statement stm;
	ResultSet res;
	DatabaseConnection dbconn;
	
       
    
    public Insertdata() {
        super();
    
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		try{
			
			dbconn =new DatabaseConnection();
			
			id=request.getParameter("id");
			salary=request.getParameter("salary");
			firstname=request.getParameter("firstname");
			lastname=request.getParameter("lastname");
			address=request.getParameter("address");
			
			dbconn=new DatabaseConnection();
			stm=con.createStatement();
			 query="('"+id+"','"+firstname+"','"+lastname+"','"+salary+"','"+address+"')";
			 
			 int i=stm.executeUpdate(query);
					}
		
		catch(Exception e){
		
		}
		
		finally{
			
			RequestDispatcher rd= request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
			out.close();
		}
    }
    
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
    

