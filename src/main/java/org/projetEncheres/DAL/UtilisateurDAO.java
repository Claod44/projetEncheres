package org.projetEncheres.DAL;

import org.projetEncheres.BO.Utilisateur;

public interface UtilisateurDAO  extends DAO<Utilisateur> {

	/**
	 * @author Claod
	 * {@summary Ajoute une methode à la DAO générique (uniquement valable pour les instances UtilisateurDAO permet de vérifier en base si un utilisateur existe avec le couple "pseudo/mot_de_passe" donnés en paramètres}
	 * @param pseudo
	 * @param pwd
	 * @return
	 * @throws Exception
	 */
	public Utilisateur authentifier(String pseudo, String pwd) throws Exception;
}
