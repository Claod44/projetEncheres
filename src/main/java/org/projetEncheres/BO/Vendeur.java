package org.projetEncheres.BO;

import java.io.Serializable;
import java.util.List;


/**
*
**@author Claod
*{@summary Classe modélisant un vendeur }
*/
public class Vendeur extends Utilisateur implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7953342886396714454L;
	/**
	 * @author Claod
	 * {@summary Propriété représentant la liste des articles vendus par l'utilisateur }
	 */
	private List<Article> articles;

	/**
	 * @author Claod
	 * {@summary Getter de la liste des Articles vendus }
	 * @return articles
	 */
	public List<Article> getArticles() {
		return this.articles;
	}

	/**
	 * @author Claod
	 * {@summary Setter de la liste des articles vendus}
	 * @param articles
	 */
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	/**
	 * @author Claod
	 * {@summary Permet d'ajouter un article vendu par l'utilisateur}
	 * @param articleVendu
	 */
	public void addArticleVendu(Article articleVendu) {
		this.articles.add(articleVendu);
	}
	
	/**
	 * @author Claod
	 * {@summary Constructeur vide}
	 */
	public Vendeur() {
		super();
	}

	/**
	 * @author Claod
	 * {@summary Constructeur avec paramètre}
	 * @param articles
	 */
	public Vendeur(List<Article> articles) {
		super();
		this.articles = articles;
	}
	
	
	
}
