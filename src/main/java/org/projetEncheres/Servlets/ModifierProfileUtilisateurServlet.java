package org.projetEncheres.Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ModifierProfileUtilisateurServlet
 */
public class ModifierProfileUtilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifierProfileUtilisateurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doRequest(request, response);
	}

	/**
	 * @see HttpServlet#doRequest(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Si utilisateur connecté
			//si oui, continuer, sinon renvoyer à la page précédante avec un message
		//Verifier que l'utilisateur connecté a l'id de l'utilisateur qu'on veut vérifier dans le paramètre pour éviter les accès frauduleux au profile d'un tiers
			//si oui, rappatrier les infos de l'utilisateur sur le profile, sinon rappatrier sur la page précédante avec un message
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
}
