package org.projetEncheres.DAL;

import org.projetEncheres.BO.Utilisateur;
import org.projetEncheres.EXCEPTIONS.DALException;

public interface UtilisateurDAO  extends DAO<Utilisateur> {

	
	public Utilisateur authentifier(String pseudo, String pwd) throws DALException;
}
