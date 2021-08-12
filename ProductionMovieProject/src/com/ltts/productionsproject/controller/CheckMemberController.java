package com.ltts.productionsproject.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ltts.productionsproject.dao.MemberDao;

/**
 * Servlet implementation class CheckMemberController
 */
@WebServlet("/CheckMemberController")
public class CheckMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckMemberController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user=request.getParameter("email");
		String pass=request.getParameter("pass");
		MemberDao md=new MemberDao();
		HttpSession sess=request.getSession();
		
		boolean b=false;
		try {
			b=md.checkMemberByEmail(user,pass);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			RequestDispatcher rd=null;

			if(b==true) {

				rd=request.getRequestDispatcher("welcome.jsp");
				sess.setAttribute("email", user);
				rd.forward(request, response);

			}

			else {

				rd=request.getRequestDispatcher("error.html");
				rd.forward(request, response);

			}

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
