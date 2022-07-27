package org.projetEncheres.Servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import org.projetEncheres.BO.Utilisateur;

/**
 * Servlet implementation class AfficherProfileUtilisateurServlet
 */

@WebServlet("/MonProfil")

public class AfficherProfileUtilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AfficherProfileUtilisateurServlet() {
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
	
	protected void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uri = "/WEB-INF/profile.jsp";
		// affichage de la jsp
		//RequestDispatcher rd = null;
        //rd = request.getRequestDispatcher("WEB-INF/profile.jsp");
        //rd.forward(request, response);
		HttpSession session = request.getSession(false);
		if(null!=session.getAttribute("utilisateur")) {
			Utilisateur u = (Utilisateur)session.getAttribute("utilisateur");
			request.setAttribute("pseudo", u.getPseudo());
				request.setAttribute("nom", u.getNom());
				request.setAttribute("prenom", u.getPrenom());
				request.setAttribute("email", u.getEmail());
				request.setAttribute("telephone", u.getTelephone());
				request.setAttribute("rue", u.getRue());
				request.setAttribute("code_postal", u.getCodePostal());
				request.setAttribute("ville", u.getVille());
				request.setAttribute("credit", u.getCredit());
			}
		this.getServletContext().getRequestDispatcher(uri).forward(request, response);
	}

}
