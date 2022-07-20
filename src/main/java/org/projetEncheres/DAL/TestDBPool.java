package org.projetEncheres.DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.projetEncheres.BO.Utilisateur;

public class TestDBPool {

	public static void insert(Utilisateur user) throws Exception {
		Connection cnx = null;
		PreparedStatement rqt = null;

		try{
			cnx = GestionnaireDesConnections.getConnexion();
			rqt=cnx.prepareStatement("insert into utilisateurs(pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, credit, administrateur) values (?,?,?,?,?,?,?,?,?,?,?)");
			rqt.setString(1, user.getPseudo());
			rqt.setString(2, user.getNom());
			rqt.setString(3, user.getPrenom());
			rqt.setString(4, user.getEmail());
			rqt.setString(5, user.getTelephone());
			rqt.setString(6, user.getRue());
			rqt.setString(7, user.getCodePostal());
			rqt.setString(8, user.getVille());
			rqt.setString(9, user.getMotDePasse());
			rqt.setInt(10, user.getCredit());
			rqt.setBoolean(11, user.isAdministrateur());
			
			
			
			rqt.executeUpdate();
			cnx.commit();
		}finally{
			if (rqt != null) rqt.close();
			if (cnx != null) cnx.close();
		}	
	}

}
