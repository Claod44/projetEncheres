/*package org.projetEncheres.DAL.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.projetEncheres.BO.Enchere;
import org.projetEncheres.DAL.EnchereDAO;
import org.projetEncheres.DAL.GestionnaireDesConnections;


	public class EnchereDAOJdbcImpl implements EnchereDAO {
		public List<Enchere> selectAll1() throws Exception {
			Connection cnx = null;
			Statement rqt = null;
			ResultSet rs = null;
			Enchere u = null;
			try {
				cnx = GestionnaireDesConnections.getConnexion();
				rqt = cnx.createStatement();   
				rs = rqt.executeQuery("SELECT * FROM Enchere");
				
				while (rs.next()){
				//	u = new Enchere(
						//	rs.getInt("no_utilisateur"),
						//	rs.getDate("date_enchere"),
						//	rs.getInt("montant_enchere"),
						//	rs.getString("no_article")
				//	);
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
		public Enchere selectById(Enchere obj) throws Exception {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Enchere> selectAll() throws Exception {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void update(Enchere data) throws Exception {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insert(Enchere data) throws Exception {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void delete(Enchere obj) throws Exception {
			// TODO Auto-generated method stub
			
		}
	}*/