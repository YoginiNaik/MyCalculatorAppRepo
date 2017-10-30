package com.cg.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorController
 */
@WebServlet("/CalculatorController")
public class CalculatorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			int num1= Integer.parseInt(request.getParameter("firstNum"));
			int num2= Integer.parseInt(request.getParameter("secNum"));
							
			String action= request.getParameter("action");
			switch(action){
			
			case 	"Add":
				
					int res= num1+ num2;
						request.setAttribute("result", res);
				
			break;
			case "Subtract":
				res= num1- num2;
			request.setAttribute("result", res);
			
			break;
			
			}
			
			RequestDispatcher rd= request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);
	
	}

}
