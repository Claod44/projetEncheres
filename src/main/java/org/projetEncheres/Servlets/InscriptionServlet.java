package org.projetEncheres.Servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.net.http.HttpRequest;

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
		HttpSession session = request.getSession(true);
		String uri = "/WEB-INF/inscription.jsp"; //TODO replace by error jsp
		try {
			if(null!=request.getParameter("pseudo")&&null!=request.getParameter("nom")&&null!=request.getParameter("prenom")&&null!=request.getParameter("email")&&null!=request.getParameter("telephone")&&null!=request.getParameter("rue")&&null!=request.getParameter("code_postal")&&null!=request.getParameter("ville")&&null!=request.getParameter("mot_de_passe")) {
				DAOFactory.getUtilisateurDAO().insert(new Utilisateur(request.getParameter("nom").toString(), request.getParameter("prenom").toString(),
						request.getParameter("pseudo").toString(), request.getParameter("email").toString(), request.getParameter("mot_de_passe").toString(),
						request.getParameter("telephone").toString(), request.getParameter("rue").toString(), request.getParameter("code_postal").toString(), request.getParameter("ville").toString()));
				session.setAttribute("utilisateur", DAOFactory.getUtilisateurDAO().authentifier(request.getParameter("pseudo").toString(), request.getParameter("mot_de_passe").toString()));
				uri = "/Accueil";
			} else {
				uri = "/WEB-INF/inscription.jsp";
			}
		} catch (Exception e) {
			// TODO Pseudo deja prit ? Erreur connexion bdd ? email deja prit ? Puis renvoyer vers inscription avec formulaire encore rempli
			//Select by pseudo retourne un résultat : message pseudo déjà pris
			//Select by email retourne résultat ; message email deja pris
			//...
			request.setAttribute("pseudo_deja_utilise", "Le pseudo ou l'email est déjà utilisé..."); //TODO faire les tests pour déterminer l'information dupliquée en base, et centraliser le message dans un fichier, incorporer le message dans la jsp
			e.printStackTrace();
		}
		if(uri.equals("/WEB-INF/inscription.jsp")) {
			this.getServletContext().getRequestDispatcher(uri).forward(request, response);
		}
		else {
			// Je sais qu'un sendRedirect est en cas de "déménagement" et est associé à un code 301, mais un forward ne change pas l'url et implique qu'on reste sur inscription et c'est deg.
			response.sendRedirect(uri);
		}
	}

}
