package com.login.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.login.service.LoginService;

@WebFilter("/AuthenticateFilter")
public class AuthenticateFilter implements Filter {
    
    private LoginService ls = new LoginService();
    
    public AuthenticateFilter() { }
    
    public void init(FilterConfig fConfig) throws ServletException {
    }
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	    
	    String name = request.getParameter("name");
	    String pass = request.getParameter("pass");
	    
	    if(ls.read(name).equals(pass)) {
	        chain.doFilter(request, response);
	    } else {
	        request.getRequestDispatcher("error.html").include(request, response);
	    }
	}
	
	public void destroy() { }
}
