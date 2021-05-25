package com.login.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.service.LoginService;

@WebServlet("/Display")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DisplayServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    LoginService ls = new LoginService();
	    try {
            request.setAttribute("data", ls.readData());
            request.getRequestDispatcher("display.jsp").forward(request, response);;
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

}
