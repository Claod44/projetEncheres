package org.projetEncheres.DAL;

import java.lang.reflect.InvocationTargetException;

/**
 * 
 * @author Claod
 * {@summary Classe permettant d'obtenir les DAO pour obtenir les connexions }
 *
 */
public class DAOFactory {
	
	/**
	 * @author Claod
	 * {@summary Permet d'obtenir l'instance de la DAO utilisateur (instance permettant d'obtenir la connexion) }
	 * @return utilisateurDAO
	 */
	public static UtilisateurDAO getUtilisateurDAO()  {
		UtilisateurDAO utilisateurDAO=null;
		try {
			utilisateurDAO=(UtilisateurDAO ) Class.forName("org.projetEncheres.DAL.jdbc.UtilisateurDAOJdbcImpl").getDeclaredConstructor().newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return utilisateurDAO; 
	}
	
	public static EnchereDAO getEnchereDAO()  {
		EnchereDAO enchereDAO=null;
		try {
			enchereDAO=(EnchereDAO ) Class.forName("org.projetEncheres.DAL.jdbc.EnchereDAOJdbcImpl").getDeclaredConstructor().newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return enchereDAO; 
	}

}
