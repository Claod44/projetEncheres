package org.projetEncheres.BO;

import java.io.Serializable;
import java.util.Date;

public class ArticleVendu extends Article implements Serializable {

	
	private Double prixVente;

	public Double getPrixVente() {
		return this.prixVente;
	}

	public void setPrixVente(Double prixVente) {
		this.prixVente = prixVente;
	}

	public ArticleVendu(Double miseAParix, String nomArticle, Integer noArticle, String description,
			Date dateDebutEncheres, Date dateFinEncheres, Boolean etatVente, Categorie categorieArticle) {
		super(miseAParix, nomArticle, noArticle, description, dateDebutEncheres, dateFinEncheres, etatVente,
				categorieArticle);
	}

	public ArticleVendu(Double miseAParix, String nomArticle, Integer noArticle, String description,
			Date dateDebutEncheres, Date dateFinEncheres, Boolean etatVente, Categorie categorieArticle,
			Double prixVente) {
		super(miseAParix, nomArticle, noArticle, description, dateDebutEncheres, dateFinEncheres, etatVente,
				categorieArticle);
		this.prixVente = prixVente;
	}
	
	
}
