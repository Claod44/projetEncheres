package org.projetEncheres.DAL;

import java.util.List;
import org.projetEncheres.EXCEPTIONS.DALException;

public interface DAO<T> {

	/**
	 * @author Eni Ecole
	 *
	 */
		
		//Sélectionner un business object par son id
		public T selectById(T obj) throws Exception;
		
		//Sélectionner tous les business objects 
		public List<T> selectAll() throws Exception;
		
		//Modifier les attributs d'un business object
		public void update(T data) throws Exception;
		
		//Insérer un nouveau business object
		public void insert(T data) throws Exception;
		
		//Supprimer un business object
		public void delete(T obj) throws Exception;
		
	
}
