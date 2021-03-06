package org.projetEncheres.BO;

import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -50866195841529666L;
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
	
	private Double prixVente;

	public Double getPrixVente() {
		return this.prixVente;
	}

	public void setPrixVente(Double prixVente) {
		this.prixVente = prixVente;
	}

	public Article(Double miseAParix, String nomArticle, Integer noArticle, String description, Date dateDebutEncheres,
			Date dateFinEncheres, Boolean etatVente, Categorie categorieArticle, Double prixVente) {
		super();
		this.miseAParix = miseAParix;
		this.nomArticle = nomArticle;
		this.noArticle = noArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.etatVente = etatVente;
		this.categorieArticle = categorieArticle;
		this.prixVente = prixVente;
	}

	public Article(Double miseAParix, String nomArticle, Integer noArticle, String description, Date dateDebutEncheres,
			Date dateFinEncheres, Boolean etatVente, Categorie categorieArticle) {
		super();
		this.miseAParix = miseAParix;
		this.nomArticle = nomArticle;
		this.noArticle = noArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.etatVente = etatVente;
		this.categorieArticle = categorieArticle;
	}

	public Article() {
		super();
	}
	
	
}
