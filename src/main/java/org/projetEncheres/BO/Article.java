package org.projetEncheres.BO;

import java.util.Date;

public class Article {
	private Double miseAParix;

	public Double getMiseAPrix() {
		return this.miseAParix;
	}

	public void setMiseAPrix(Double prix) {
		this.miseAParix = prix;
	}
	
	private String nomArticle;

	public String getNomArticle() {
		return this.nomArticle;
	}

	public void setNomArticle(String nom) {
		this.nomArticle = nom;
	}
	
	private Integer noArticle;

	public Integer getNoArticle() {
		return this.noArticle;
	}

	public void setNoArticle(Integer id) {
		this.noArticle = id;
	}
	
	private String description;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	private Date dateDebutEncheres;

	public Date getDateDebutEncheres() {
		return this.dateDebutEncheres;
	}

	public void setDateDebutEncheres(Date dateDebutEncheres) {
		this.dateDebutEncheres = dateDebutEncheres;
	}
	
	private Date dateFinEncheres;

	public Date getDateFinEncheres() {
		return this.dateFinEncheres;
	}

	public void setDateFinEncheres(Date dateFinEncheres) {
		this.dateFinEncheres = dateFinEncheres;
	}
	
	private Boolean etatVente;

	public Boolean getEtatVente() {
		return this.etatVente;
	}

	public void setEtatVente(Boolean etatVente) {
		this.etatVente = etatVente;
	}
	
	private Categorie categorieArticle;

	public Categorie getCategorieDeLarticle() {
		return this.categorieArticle;
	}

	public void setCategorieDeLarticle(Categorie categorieDeLarticle) {
		this.categorieArticle = categorieDeLarticle;
	}
}
