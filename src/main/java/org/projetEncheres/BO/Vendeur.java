package org.projetEncheres.BO;

import java.util.List;

public class Vendeur extends Utilisateur {
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
