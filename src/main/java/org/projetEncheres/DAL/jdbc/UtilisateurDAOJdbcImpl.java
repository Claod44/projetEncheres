package org.projetEncheres.DAL.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.projetEncheres.BO.Utilisateur;
import org.projetEncheres.DAL.GestionnaireDesConnections;
import org.projetEncheres.DAL.UtilisateurDAO;
import org.projetEncheres.EXCEPTIONS.DALException;

public class UtilisateurDAOJdbcImpl implements UtilisateurDAO {
	
	private static final String INSERT_UTILISATEUR_STRING = "insert into utilisateurs(pseudo, nom, prenom, email, mot_de_passe, telephone, rue, code_postal, ville, credit, administrateur) values (?,?,?,?,?,?,?,?,?,?,?)";
	
	private static final String AUTENTIFIER_STRING = "SELECT * FROM Utilisateurs WHERE pseudo = ?' AND mot_de_passe = ?";
	
	@Override
	public Utilisateur selectById(Utilisateur utilisateur) throws DALException {
		Connection cnx = null;
		PreparedStatement rqt = null;
		ResultSet rs = null;
		Utilisateur u = null;
		/**try {
			cnx = GestionnaireDesConnections.getConnexion();
			rqt = cnx.prepareStatement(sqlSelectById);
			rqt.setInt(1, articleCritere.getIdArticle());

			rs = rqt.executeQuery();
			if (rs.next()){

				if (TYPE_STYLO.equalsIgnoreCase(rs.getString("type").trim())){

					art = new Stylo(rs.getInt("idArticle"),
							rs.getString("marque"),
							rs.getString("reference").trim(),
							rs.getString("designation"),
							rs.getFloat("prixUnitaire"),
							rs.getInt("qteStock"),
							rs.getString("couleur"));
				}
				if (TYPE_RAMETTE.equalsIgnoreCase(rs.getString("type").trim())){
					art = new Ramette(rs.getInt("idArticle"),
							rs.getString("marque"),
							rs.getString("reference").trim(),
							rs.getString("designation"),
							rs.getFloat("prixUnitaire"),
							rs.getInt("qteStock"),
							rs.getInt("grammage"));
				}
			}

		} catch (SQLException e) {
			throw new DALException("selectById failed - article = " + art , e);
		} finally {
			try {
				if (rs != null){
					rs.close();
				}
				if (rqt != null){
					rqt.close();
				}
				if(cnx!=null){
					cnx.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} **/
		return u;
	}

	@Override
	public List<Utilisateur> selectAll() throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Utilisateur data) throws DALException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(Utilisateur data) throws DALException {
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
			rqt.setInt(11, data.getCredit());
			rqt.setBoolean(11, data.isAdministrateur());
			
			rqt.executeUpdate();
			cnx.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DALException("Insert failed - utilisateur = ", e);
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
	public void delete(Utilisateur obj) throws DALException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Utilisateur authentifier(String pseudo, String pwd) throws DALException {
		// TODO Auto-generated method stub
		Connection cnx = null;
		PreparedStatement rqt = null;
		ResultSet rs = null;
		Utilisateur u = null;
		
		try {
			cnx = GestionnaireDesConnections.getConnexion();
			rqt = cnx.prepareStatement(AUTENTIFIER_STRING);
			rqt.setString(1, pseudo);
			rqt.setString(1, pwd);
	
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
		} catch (SQLException e) {
			throw new DALException("authentifier failed - utilisateur = ", e);
		} finally {
			try {
				if (rs != null){
					rs.close();
				}
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
		
		return u;
	}
}
