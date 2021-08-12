package com.ltts.productionsproject.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.productionsproject.dao.ProductionsDao;
import com.ltts.productionsproject.model.Productions;

/**
 * Servlet implementation class ViewProductionsController
 */
@WebServlet("/ViewProductionsController")
public class ViewProductionsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ViewProductionsController() {
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
		// TODO Auto-generated method stub
		ProductionsDao pd=new ProductionsDao();

		boolean b=false;

		try {

		List<Productions> li=pd.getAllProductions();
		for(Productions p:li) {
			System.out.println(p+"\n");
		}

		}

		catch(Exception e) {

			b=true;

			System.out.println(e);

		}

		finally {
			RequestDispatcher rd=null;

			if(b==true) {

				rd=request.getRequestDispatcher("error.html");
				rd.forward(request, response);

			}

			else {

				rd=request.getRequestDispatcher("success.html");
				rd.forward(request, response);

			}

		}
	}

}
