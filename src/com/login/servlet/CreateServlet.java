package com.login.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.model.Login;
import com.login.service.LoginService;

/**
 * Servlet implementation class CreateServlet
 */
@WebServlet("/CreateServlet")
public class CreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public CreateServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String firstName = request.getParameter("fn");
        String lastName = request.getParameter("ln");
        String email = request.getParameter("email");
        String phoneNumber = request.getParameter("pno");
        String userName = request.getParameter("username");
        String password = request.getParameter("pass");
        int age = Integer.parseInt(request.getParameter("age"));
        Date dob = null;
        try {
            dob = new SimpleDateFormat("YYYY-MM-DD").parse(request.getParameter("dob"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String addr1 = request.getParameter("a1");
        String addr2 = request.getParameter("a2");
        String addr3 = request.getParameter("a3");
        
        Login l = new Login(firstName, lastName, email, phoneNumber, userName, password, dob, age, addr1, addr2, addr3);
        LoginService ls = new LoginService();
        
        long loginId = ls.create(l);
        request.setAttribute("logId", loginId);
        request.getRequestDispatcher("create.jsp").forward(request, response);
	}
}
