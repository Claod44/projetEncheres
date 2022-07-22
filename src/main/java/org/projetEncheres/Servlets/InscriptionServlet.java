package org.projetEncheres.Servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.projetEncheres.BO.Utilisateur;
import org.projetEncheres.DAL.DAOFactory;
import org.projetEncheres.EXCEPTIONS.DALException;

/**
 * Servlet implementation class InscriptionServlet
 */
public class InscriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscriptionServlet() {
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
		//TODO Vue doit vérifier email, numero de tel, code postal, Servlet doit recevoir :
		// String nom, String prenom, String pseudo, String email, String motDePasse, String telephone, String rue, String codePostal, String ville
		try {
			DAOFactory.getUtilisateurDAO().insert(new Utilisateur(request.getParameter("nom").toString(), request.getParameter("prenom").toString(),
					request.getParameter("pseudo").toString(), request.getParameter("email").toString(), request.getParameter("mot_de_passe").toString(),
					request.getParameter("telephone").toString(), request.getParameter("rue").toString(), request.getParameter("code_postal").toString(), request.getParameter("ville").toString()));
		} catch (Exception e) {
			// TODO Pseudo deja prit ? Erreur connexion bdd ? email deja prit ? Puis renvoyer vers inscription avec formulaire encore rempli
			e.printStackTrace();
		}
		RequestDispatcher dispatcher;
		dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/inscription.jsp"); 
		dispatcher.forward(request, response);
	}

}
