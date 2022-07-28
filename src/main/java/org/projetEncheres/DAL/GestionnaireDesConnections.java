package org.projetEncheres.DAL;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 * 
 * @author Claod
 * {@Classe configurant le pool de connexion}
 */
public class GestionnaireDesConnections {
	/**
	 * String de connexion définie dans le context.xml du serveur tomcat (dossier dans le bandeau de gauche d'eclipse, pamris les projets)
	 */
	private static final String NOM_JNDI_POOL = "java:comp/env/jdbc/encherePool";

	/**
	 * @author Claod
	 * {@summary Permet d'obtenir une connexion dans le pool}
	 * @return Connection
	 */
	public static Connection getConnexion()  {
		
		Connection cnx = null;
		
		try {
			// Obtenir l'annuaire JNDI
			InitialContext annuaire = new InitialContext();
			
			// Obtenir le pool de connexions
			DataSource pool = (DataSource)annuaire.lookup(NOM_JNDI_POOL);
			
			// Obtenir une connexion � partir du pool
			cnx = pool.getConnection();
			
		} catch (NamingException ne) {
			System.err.println("Impossible d'obtenir l'annuaire ou une entr�e de l'annuaire");
			ne.printStackTrace();
		} catch (SQLException sqle) {
			System.err.println("Impossible d'obtenir une connexion");
			sqle.printStackTrace();
		}
		
		return cnx;
		
	}
}
