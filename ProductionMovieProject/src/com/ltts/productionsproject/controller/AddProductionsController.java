package com.ltts.productionsproject.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.productionsproject.dao.ProductionsDao;
import com.ltts.productionsproject.model.Productions;

/**
 * Servlet implementation class AddProductionsController
 */
@WebServlet("/AddProductionsController")
public class AddProductionsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductionsController() {
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
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("pid"));

		String name=request.getParameter("pname");
		
		String address=request.getParameter("address");
		
		int year=Integer.parseInt(request.getParameter("year"));

		String owner=request.getParameter("owner");

		

		System.out.println("Player Id: "+id+", Name: "+name+",Address: "+address+", year: "+year+", Ownername: "+owner);

		Productions p=new Productions(id,name,address,year,owner);

		ProductionsDao pd=new ProductionsDao();

		boolean b=false;

		try {

		pd.insertProductions(p);

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
