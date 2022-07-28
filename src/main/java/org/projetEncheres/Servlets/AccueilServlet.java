package org.projetEncheres.Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class AccueilServlet
 * 
 * MODIFICATIONS COTé SQL SERVEUR :
 * Il faut aller dans SQL Server Configuration Manager (C:\Windows\System32\SQLServerManager15.msc) dans Configuration du réseau SQL server :
 *  activer Cannaux nommés
 *  Activer TCP/IP et aller dans l'onglet Adresse IP :
 *  descendre tout en bas, supprimer la valeur du port dynamique et enfin ajouter la valeur 1433 au Port TCP juste au dessus.
 *  
 *  TODO SQL modifier la taille du varchar table UTILISATEURS colonne email à 50
 *  TODO Voir pour la rue
 *  
 *  COPIER COLLER DANS context.xml au dessus de </context> et en modifiant le mot de passe dans le xml ci-dessous le cas échéant
 *  
 *  <Resource	name="jdbc/encherePool"
       		driverClassName="com.microsoft.sqlserver.jdbc.SQLServerDriver"
        		type="javax.sql.DataSource"
        		
        		
        		url="jdbc:sqlserver://localhost;integratedSecurity=false;encrypt=true;trustServerCertificate=true;databasename=enchere;"
        		username="sa"
        		password="Pa$$w0rd"
        		
        		maxTotal="100"
        		maxIdle="30"
        		maxWaitMillis="10000" />
 *  
 *  
 *  Dans server.xml : rechercher 8080 remplacer le port par 80
 *  Puis descendre en bas trouver path="/NomduProjet" remplacer par Path="/"
 *  
 */

/**
 * 
 * @author Claod
 * {@summary Servlet de la page d'accueil }
 *
 */
public class AccueilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccueilServlet() {
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
	 * {@summary renvoie vers la jsp de l'accueil }
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/accueil.jsp").forward(request, response);
	}
}
