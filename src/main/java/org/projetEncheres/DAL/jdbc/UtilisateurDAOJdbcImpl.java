package org.projetEncheres.DAL.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.projetEncheres.BO.Utilisateur;
import org.projetEncheres.DAL.GestionnaireDesConnections;
import org.projetEncheres.DAL.UtilisateurDAO;

public class UtilisateurDAOJdbcImpl implements UtilisateurDAO {
	
	private static final String INSERT_UTILISATEUR_STRING = "insert into utilisateurs(pseudo, nom, prenom, email, mot_de_passe, telephone, rue, code_postal, ville, credit, administrateur) values (?,?,?,?,?,?,?,?,?,?,?)";
	
	private static final String AUTENTIFIER_STRING = "SELECT * FROM utilisateurs WHERE pseudo = ? AND mot_de_passe = ?";
	
	private static final String UPDATE_UTILISATEUR_AVEC_MOT_DE_PASSE_STRING = "UPDATE utilisateurs SET pseudo = ?, email = ?, mot_de_passe = ?, telephone = ?, rue = ?, code_postal = ?, ville = ? WHERE no_utilisateur = ?";
	
	private static final String UPDATE_UTILISATEUR_SANS_MOT_DE_PASSE_STRING = "UPDATE utilisateurs SET pseudo = ?, email = ?, telephone = ?, rue = ?, code_postal = ?, ville = ? WHERE no_utilisateur = ?";
	
	
	private static final String SELECT_UTILISATEUR_BY_ID_STRING = "SELECT * FROM utilisateurs WHERE no_utilisateur = ?";
	
	@Override
	public Utilisateur selectById(Utilisateur utilisateur) throws Exception {
		Connection cnx = null;
		PreparedStatement rqt = null;
		ResultSet rs = null;
		Utilisateur u = null;
		try {
			cnx = GestionnaireDesConnections.getConnexion();
			rqt = cnx.prepareStatement(SELECT_UTILISATEUR_BY_ID_STRING);
			rqt.setInt(1, utilisateur.getNoUtilisateur());
			rs = rqt.executeQuery();
			
			while (rs.next()){
				u = new Utilisateur(
						rs.getInt("no_utilisateur"),
						rs.getString("nom"),
						rs.getString("prenom"),
						rs.getString("pseudo"),
						rs.getString("email"),
						rs.getString("mot_de_passe"),
						rs.getString("telephone"),
						rs.getString("rue"),
						rs.getString("code_postal"),
						rs.getString("ville"),
						rs.getInt("credit"),
						rs.getBoolean("administrateur")
				);
			}

		} finally {
				if (rs != null){
					rs.close();
				}
				if (rqt != null){
					rqt.close();
				}
				if(cnx!=null){
					cnx.close();
				}
		}
		return u;
	}

	@Override
	public List<Utilisateur> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Utilisateur data) throws Exception {
		Connection cnx = null;
		PreparedStatement rqt = null;
		
		//pseudo = ?, nom = ?, prenom = ?, email = ?, mot_de_passe = ?, telephone = ?, rue = ?, code_postal = ?, ville = ? WHERE no_utilisateur = ?
		try{
			cnx = GestionnaireDesConnections.getConnexion();
			if(null!=data.getMotDePasse()) {
				rqt = cnx.prepareStatement(UPDATE_UTILISATEUR_AVEC_MOT_DE_PASSE_STRING);
			} else {
				rqt = cnx.prepareStatement(UPDATE_UTILISATEUR_SANS_MOT_DE_PASSE_STRING);
			}
			System.out.println("dans la dal pour update utilisateur");
			rqt.setString(1, data.getPseudo());
			rqt.setString(2, data.getEmail());
			if(null!=data.getMotDePasse()) {
				rqt.setString(3, data.getMotDePasse());
				rqt.setString(4, data.getTelephone());
				rqt.setString(5, data.getRue());
				rqt.setString(6, data.getCodePostal());
				rqt.setString(7, data.getVille());
				rqt.setInt(8, data.getNoUtilisateur());
			} else {
				rqt.setString(3, data.getTelephone());
				rqt.setString(4, data.getRue());
				rqt.setString(5, data.getCodePostal());
				rqt.setString(6, data.getVille());
				rqt.setInt(7, data.getNoUtilisateur());
			}

			rqt.executeUpdate();
			cnx.commit();
		} finally {
			if (rqt != null) rqt.close();
			if (cnx != null) cnx.close();
		}
		
	}

	@Override
	public void insert(Utilisateur data) throws Exception {
		Connection cnx = null;
		PreparedStatement rqt = null;
		//pseudo, nom, prenom, email, mot_de_passe, telephone, rue, code_postal, ville, credit, administrateur
		try{
			cnx = GestionnaireDesConnections.getConnexion();
			rqt=cnx.prepareStatement(INSERT_UTILISATEUR_STRING);
			
			rqt.setString(1, data.getPseudo());
			rqt.setString(2, data.getNom());
			rqt.setString(3, data.getPrenom());
			rqt.setString(4, data.getEmail());
			rqt.setString(5, data.getMotDePasse());
			rqt.setString(6, data.getTelephone());
			rqt.setString(7, data.getRue());
			rqt.setString(8, data.getCodePostal());
			rqt.setString(9, data.getVille());
			rqt.setInt(10, data.getCredit());
			rqt.setBoolean(11, data.isAdministrateur());
			
			rqt.executeUpdate();
			cnx.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new Exception("Insert failed - utilisateur = ", e);
		} finally {
			try {
				if (rqt != null){
					rqt.close();
				}
				if(cnx!=null){
					cnx.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}	
		
	}

	@Override
	public void delete(Utilisateur obj) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Utilisateur authentifier(String pseudo, String mot_de_passe) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("dans la dal utilisateur auth");
		Connection cnx = null;
		PreparedStatement rqt = null;
		ResultSet rs = null;
		Utilisateur u = null;
		
		try {
			cnx = GestionnaireDesConnections.getConnexion();
			rqt = cnx.prepareStatement(AUTENTIFIER_STRING);
			rqt.setString(1, pseudo);
			rqt.setString(2, mot_de_passe);
	
			rs = rqt.executeQuery();
			/*(Integer noUtilisateur, String nom, String prenom,
			String pseudo, String email, String motDePasse, String telephone, String rue, String codePostal, String ville,
			Integer credit, Boolean administrateur)*/
			while (rs.next()){
				u = new Utilisateur(
						rs.getInt("no_utilisateur"),
						rs.getString("nom"),
						rs.getString("prenom"),
						rs.getString("pseudo"),
						rs.getString("email"),
						rs.getString("mot_de_passe"),
						rs.getString("telephone"),
						rs.getString("rue"),
						rs.getString("code_postal"),
						rs.getString("ville"),
						rs.getInt("credit"),
						rs.getBoolean("administrateur")
				);
			}
		} finally {
				if (rs != null){
					rs.close();
				}
				if (rqt != null){
					rqt.close();
				}
				if(cnx!=null){
					cnx.close();
				}
		}
		System.out.println(u.getNom());
		return u;
	}
}
