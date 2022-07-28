package org.projetEncheres.DAL;

import java.util.List;

/**
 * @author Claod
 *{@summary Classe générique DAO}
 * @param <T>
 */
public interface DAO<T> {

	/**
	 * @author Eni Ecole
	 *
	 */
		
		/**
		 * @author Claod
		 * {@summary Selectionne une entité par son ID}
		 * @param obj
		 * @return
		 * @throws Exception
		 */
		public T selectById(T obj) throws Exception;
		
		/**
		 * @author Claod
		 * {@summary Selectionne toutes les entités }
		 * @return List<T>
		 * @throws Exception
		 */
		public List<T> selectAll() throws Exception;
		
		/**
		 * @author Claod
		 * {@summary Met à jour une entité dans base de données}
		 * @param data
		 * @throws Exception
		 */
		public void update(T data) throws Exception;
		
		/**
		 * @author Claod
		 * {@summary Permet d'ajouter une entité en base de données}
		 * @param data
		 * @throws Exception
		 */
		public void insert(T data) throws Exception;
		
		/**
		 * @author Claod
		 * {@summary Supprime une entité en base de données}
		 * @param obj
		 * @throws Exception
		 */
		public void delete(T obj) throws Exception;
		
	
}
