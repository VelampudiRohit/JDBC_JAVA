package com.ltts.productionsproject.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class CheckMemberFilter
 */
@WebFilter("/CheckMemberController")
public class CheckMemberFilter implements Filter {

    /**
     * Default constructor. 
     */
    public CheckMemberFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		response.setContentType("text/html");
		String user=request.getParameter("email");
		String pass=request.getParameter("pass");
		PrintWriter out=response.getWriter();
		if(user.equals("")) {
			out.println("Username cant be empty");
			
		}
		else if(pass.equals("")) {
			out.println("Password cant be empty");
		}
		// pass the request along the filter chain
		else {
			chain.doFilter(request, response);
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
