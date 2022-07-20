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
	
	private static final String AUTENTIFIER_STRING = "insert into utilisateurs(pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, credit, administrateur) values (?,?,?,?,?,?,?,?,?,?,?)";
	
	
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
		// TODO Auto-generated method stub
		
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
		
		
		return null;
	}
}
