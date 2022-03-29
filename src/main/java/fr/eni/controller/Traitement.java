package fr.eni.controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Traitement
 */
@WebServlet("/Traitement")
public class Traitement extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int nombreMystere;
	private int nombreTest;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Traitement() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		nombreTest = Integer.parseInt(request.getParameter("nombre"));
		if(nombreTest != nombreMystere) {
			response.sendRedirect("./echec.html");
		}else {
		response.sendRedirect("./victoire.html");
		}
	}

	@Override
	public void init() throws ServletException {
		System.out.println("****** INIT *****");
		Random rd = new Random();
		nombreMystere = rd.nextInt(11);
		System.out.println(nombreMystere);
//		nombreMystere = 8;
	}

}
