package com.servelet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.conn.DbConn;
import com.dao.Datadao;
import com.model.User;

/**
 * Servlet implementation class insertPage
 */
@WebServlet("/insertPage")
@MultipartConfig(maxFileSize = 16177215)
public class insertPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Datadao dao = new Datadao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action=request.getParameter("action");
		String id=request.getParameter("id");
		
		if(action.equals("edit")) {
			User u = dao.getId(Integer.parseInt(id));
			request.setAttribute("edit", u);
			RequestDispatcher rd  = request.getRequestDispatcher("update.jsp");
			rd.forward(request, response);
		} else if(action.equals("Update")) {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String email = request.getParameter("email");
			String phone = request.getParameter("phone");
			String u_id = request.getParameter("id");
			
			
			User u = new User();
			u.setEmail(email);
			u.setId(Integer.parseInt(u_id));
			u.setPassword(password);
			u.setPhone(phone);
			u.setUsername(username);
			
			String s = dao.update(u);
			if(s.equals("Success")) {
				RequestDispatcher rd = request.getRequestDispatcher("Showdata");
				rd.forward(request, response);
			}
			
		}
		else {
			String get_id = request.getParameter("id");
			String s = dao.delete_data(Integer.parseInt(get_id));
			if(s.equals("Success")) {
				RequestDispatcher rd = request.getRequestDispatcher("Showdata");
				rd.forward(request, response);
			}
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		Part image = request.getPart("image");
		//email sent for new user registration
		Mailer.send(email, "Welcome to the family", "May you last long with us");
		//converting image into byte array
		InputStream file = image.getInputStream();
		byte b[] = file.readAllBytes();
		User user = new User();
		
		user.setUsername(username);
		user.setPhone(phone);
		user.setEmail(email);
		user.setPassword(password);
		user.setImage(b);
		
		Datadao da = new Datadao();
		String s = da.Inserrtdata(user);
		if(s.equalsIgnoreCase("success")) {
			request.setAttribute("msg","Data inserted successful");
			RequestDispatcher rd = request.getRequestDispatcher("homepage.jsp");
			rd.forward(request, response);
		}
		
		//Part is data type to upload file
		
		
		doGet(request, response);
	}

}
