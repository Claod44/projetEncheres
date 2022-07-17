package org.projetEncheres.BO;

public class Categorie {
	private Integer noCotegorie;

	public Integer getNoCategorie() {
		return this.noCotegorie;
	}

	public void setNoCategorie(Integer noCotegorie) {
		this.noCotegorie = noCotegorie;
	}
	
	private String libelle;

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Categorie() {
		super();
	}

	public Categorie(Integer noCotegorie, String libelle) {
		super();
		this.noCotegorie = noCotegorie;
		this.libelle = libelle;
	}
	
	
}
