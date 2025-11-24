package com.servelet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

import com.dao.Datadao;

/**
 * Servlet implementation class showimage
 */
@WebServlet("/showimage")
public class showimage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showimage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String imageid=request.getParameter("id");
		if(imageid !=null && !imageid.isEmpty()) {
			Datadao dao = new Datadao();
			int id = Integer.parseInt(imageid);
			byte[] image = dao.getimagebyid(id);
			if(image != null) {
				response.setContentType("image/jpeg");
				OutputStream os = response.getOutputStream();
				os.write(image);
				os.flush();
				os.close();
				
				RequestDispatcher rd = request.getRequestDispatcher("Showdata");
				rd.forward(request, response);
				return;
			} else {
				response.sendError(HttpServletResponse.SC_NOT_FOUND,"Image not found");	
			}
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
