package org.projetEncheres.Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.projetEncheres.BO.Utilisateur;
import org.projetEncheres.DAL.TestDBPool;

/**
 * Servlet implementation class TestDBPool
 * @author Claod
 * {@summary Servlet de test, insère un utilisateur en BDD sur l'url /TestBDOPool}
 */
public class TestDBPoolServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestDBPoolServlet() {
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doRequest(request, response);
	}
	
	/**
	 * @author Claod
	 * {@summary teste la bdd en insérant un utilisateur}
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Utilisateur u = new Utilisateur();
		u.setNom("Harivel");
		u.setPrenom("Maxime");
		u.setPseudo("Claod");
		u.setEmail("maxime.harivel2016@campus-eni.fr");
		u.setTelephone("0600000000");
		u.setRue("Rue Tabaga");
		u.setCodePostal("44100");
		u.setVille("Nantes");
		u.setMotDePasse("essaie");
		u.setCredit(1000);
		u.setIsAdministrateur(true);
		try {
			TestDBPool.insert(u);
		} catch (Exception e) {
			System.out.println(e);
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
