package com.ltts.productionsproject.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.productionsproject.dao.MemberDao;
import com.ltts.productionsproject.model.Member;

/**
 * Servlet implementation class InsertMemberController
 */
@WebServlet("/InsertMemberController")
public class InsertMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertMemberController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("mname");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		Member m=new Member(name,email,mobile);
		MemberDao md=new MemberDao();
		boolean b=false;

		try {

		md.insertMember(m);

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
