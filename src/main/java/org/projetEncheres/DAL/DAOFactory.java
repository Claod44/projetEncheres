package org.projetEncheres.DAL;

import java.lang.reflect.InvocationTargetException;

public class DAOFactory {
	
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
}
