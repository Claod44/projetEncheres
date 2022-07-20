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
		doRequest(request, response);
	}
	
	protected void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if((request.getParameter("pseudo")!=null)&&(request.getParameter("pwd")!=null)) {
			//regexp de validation email ?
			Utilisateur utilisateur = null;
			try {
				utilisateur = DAOFactory.getUtilisateurDAO().authentifier(request.getParameter("pseudo").toString(), request.getParameter("pwd").toString());
				if (utilisateur!=null)
				{
					HttpSession session = request.getSession(false);
					if(session!=null) {
						//verifier
						session.setAttribute("utilisateur", utilisateur);
						response.sendRedirect(request.getContextPath() + "/accueil");
					}
				}
				else {
					//todo
				String lemessage = "Identifiants incorrects.";
				request.setAttribute("message", lemessage);
				this.getServletContext().getRequestDispatcher("/").forward(request, response);
				}
			}
			catch (Exception ex) {
				String lemessage = "Ton server xml bordel !!!";
				HttpSession session = request.getSession(false);
				session.setAttribute("message", lemessage);
				response.sendRedirect(request.getContextPath());
			}
		}
		else {
		String lemessage = "Un de vos champs est incorrect.";
		request.setAttribute("message", lemessage);
		this.getServletContext().getRequestDispatcher("/").forward(request, response);
		}
	}

}
