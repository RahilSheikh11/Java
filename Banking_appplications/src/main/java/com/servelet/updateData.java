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

import com.dao.Datadao;
import com.model.User;


@MultipartConfig(maxFileSize = 16177215) // around 16MB

/**
 * Servlet implementation class updateData
 */
@WebServlet("/updateData")
public class updateData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateData() {
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
		Datadao da = new Datadao();
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		String id=request.getParameter("id");
		Part image = request.getPart("image");
		
		//converting image into byte array
		InputStream file = image.getInputStream();
		byte b[] = file.readAllBytes();
		User user = new User();
		
		user.setUsername(username);
		user.setPhone(phone);
		user.setEmail(email);
		user.setPassword(password);
		user.setId(Integer.parseInt(id));
		user.setImage(b);
		String s=da.update(user);
		if(s.equals("Success")) {
			
		
		RequestDispatcher rd= request.getRequestDispatcher("Showdata");
		rd.forward(request, response);
		}
		
		doGet(request, response);
	}

}
