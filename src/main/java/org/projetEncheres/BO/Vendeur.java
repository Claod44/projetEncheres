package org.projetEncheres.BO;

import java.io.Serializable;
import java.util.List;

public class Vendeur extends Utilisateur implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7953342886396714454L;
	private List<Article> articles;

	public List<Article> getArticles() {
		return this.articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public Vendeur() {
		super();
	}

	public Vendeur(List<Article> articles) {
		super();
		this.articles = articles;
	}
	
	
	
}
