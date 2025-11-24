package com.servelet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.dao.Datadao;

/**
 * Servlet implementation class logindata
 */
@WebServlet("/logindata")
public class logindata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Datadao dao = new Datadao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public logindata() {
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
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String s = dao.login(username, password);
		if(s.equals("success")) {
		RequestDispatcher rd = request.getRequestDispatcher("user_homepage.jsp");
		rd.forward(request, response);
		}
		
		
		doGet(request, response);
	}

}
