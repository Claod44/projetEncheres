package org.projetEncheres.Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import org.projetEncheres.BO.Utilisateur;
import org.projetEncheres.DAL.DAOFactory;

/**
 * Servlet implementation class ConnectionServlet
 */
public class ConnectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConnectionServlet() {
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
		System.out.println("dans post");
		doRequest(request, response);
	}
	
	protected void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("dans doRequest");
		System.out.println(request.getParameter("pseudo"));
		System.out.println(request.getParameter("mot_de_passe"));
		if((request.getParameter("pseudo")!=null)&&(request.getParameter("mot_de_passe")!=null)) {
			//regexp de validation email ?
			System.out.println("condition ok : pseudo et mot de passe not null");
			Utilisateur utilisateur = null;
			try {
				utilisateur = DAOFactory.getUtilisateurDAO().authentifier(request.getParameter("pseudo").toString(), request.getParameter("mot_de_passe").toString());
				System.out.println(utilisateur.getNom());
				if (utilisateur!=null)
				{
					HttpSession session = request.getSession(false);
					if(session!=null) {
						//verifier
						session.setAttribute("utilisateur", utilisateur);
						if(session.getAttribute("message_connection_pseudo_ou_mot_de_passe_invalide")!=null) {
							session.removeAttribute("message_connection_pseudo_ou_mot_de_passe_invalide");
						}
						System.out.println("Connexion OK");
						response.sendRedirect(request.getContextPath() + "/Accueil");
						//TODO verifier dans la jsp si l'utilisateur existe dans la session, retirer la partie connexion
					}
				}
			}
			catch (Exception ex) {
				System.out.println("exception !!!");
				String message_connection_pseudo_ou_mot_de_passe_invalide = "Pseudo ou mot de passe incorrect";
				HttpSession session = request.getSession(false);
				session.setAttribute("message_connection_pseudo_ou_mot_de_passe_invalide", message_connection_pseudo_ou_mot_de_passe_invalide);
				response.sendRedirect(request.getContextPath() + "/Accueil"); //TODO demander au formateur ce qui est correct entre SendRedirect et forward
			}
		}
		else {
		String lemessage = "Un de vos champs est incorrect.";
		request.setAttribute("message", lemessage);
		this.getServletContext().getRequestDispatcher("/").forward(request, response);
		}
	}

}
