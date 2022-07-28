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
import org.projetEncheres.DAL.DAOFactory;

/**
 * Servlet implementation class ModifierProfileUtilisateurServlet
 * @author Claod
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
	 * @author Claod
	 * {@summary Envoie vers la page pour afficher les informations actuelles de l'utilisateur si aucun paramètre n'est dans la request, sinon récupère les paramètres de la request et les enregistres en base de données}
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//(condition A) Si utilisateur dans la session
		HttpSession session = request.getSession(false);
		String uri = "/WEB-INF/ModifierProfileUtilisateur.jsp";
		
		if(null!=session.getAttribute("utilisateur")) {
			Utilisateur u = (Utilisateur)session.getAttribute("utilisateur");
			//(condition B) si aucun parametre pour enregistrer le profile n'existe
			if(null==request.getParameter("pseudo")&&null==request.getParameter("nom")&&null==request.getParameter("prenom")&&null==request.getParameter("email")&&null==request.getParameter("telephone")&&null==request.getParameter("rue")&&null==request.getParameter("code_postal")&&null==request.getParameter("ville")) {
				//on veut afficher la page avec les propriété de l'utilisateur dans la session
				System.out.println("j'affiche seulement un profile.");
				request.setAttribute("pseudo", u.getPseudo());
				request.setAttribute("nom", u.getNom());
				request.setAttribute("prenom", u.getPrenom());
				request.setAttribute("email", u.getEmail());
				request.setAttribute("telephone", u.getTelephone());
				request.setAttribute("rue", u.getRue());
				request.setAttribute("code_postal", u.getCodePostal());
				request.setAttribute("ville", u.getVille());
				request.setAttribute("credit", u.getCredit());
			} else {
				// B: sinon c'est qu'on enregistre le profile avec les nouvelles informations
				 //recuperer les parametres et les enregistrer en base
				System.out.println("je modifie un profile");
					
					Utilisateur updatedUtilisateur = new Utilisateur();
					updatedUtilisateur.setNoUtilisateur(((Utilisateur)session.getAttribute("utilisateur")).getNoUtilisateur());
					updatedUtilisateur.setPseudo(request.getParameter("pseudo")); // TODO Attention le pseudo peut être déjà prit
					updatedUtilisateur.setNom(request.getParameter("nom"));
					updatedUtilisateur.setPrenom(request.getParameter("prenom"));
					updatedUtilisateur.setEmail(request.getParameter("email")); //TODO Verifier email
					updatedUtilisateur.setTelephone(request.getParameter("telephone")); //TODO verifier telephone
					updatedUtilisateur.setRue(request.getParameter("rue"));
					updatedUtilisateur.setCodePostal(request.getParameter("code_postal")); //TODO  verifier code postal
					updatedUtilisateur.setVille(request.getParameter("ville"));
					if(null!=request.getParameter("mot_de_passe")&&null!=request.getParameter("verification")&&(request.getParameter("mot_de_passe")==request.getParameter("verification"))) {//TODO null or trim blank
						updatedUtilisateur.setMotDePasse(request.getParameter("mot_de_passe")); //TODO inscription et connexion avec pseudo securisé  (encrypt)
					} else {
					//renvoyer vers la page de modifications avec les informations de l'utilisateur précédantes et un message pour dire que la confirmation et le mot de passe ne coincident pas
					request.setAttribute("mot_de_passe_et_validation_not_equals", "Le mot de passe et la confirmation ne coincident pas"); //TODO centraliser tout les messages dans un fichier a part pour faciliter les modifications, incorporer dans la jsp
					}
					
					try {
						DAOFactory.getUtilisateurDAO().update(updatedUtilisateur);
						session.setAttribute("utilisateur", DAOFactory.getUtilisateurDAO().selectById(u));
						request.setAttribute("modifications_utilisateur_ok", "Les modifications ont bien été apportées"); //TODO centraliser tout les messages dans un fichier a part pour faciliter les modifications, incorporer dans la jsp
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						System.out.println("exception lors de la modification du profile!!!");
						request.setAttribute("erreur_base_de_donnee", "Les modifications n'ont pas pu être prise en compte à cause d'une problème de base de données, merci de contacter un administrateur."); //TODO centraliser tout les messages dans un fichier a part pour faciliter les modifications, incorporer dans la jsp
					}
			}

			
		} else {
			//A :Pas d'utilisateur, on renvoie vers la page précédante avec un message "merci de vous connecter" TODO Filtre ou recuperer la page précédante, incorporer dans la jsp
			request.setAttribute("message_utilisateur_non_connecte", "Merci de vous connecter pour accéder à cette page.");
			uri = "/WEB-INF/accueil.jsp";
		}
		this.getServletContext().getRequestDispatcher(uri).forward(request, response);
	}
	
}
