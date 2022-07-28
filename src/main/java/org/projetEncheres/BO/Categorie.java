package org.projetEncheres.BO;

import java.io.Serializable;

/**
*
**@author Claod
*{@summary Classe modélisant la catégorie }
*/
public class Categorie implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 205247634236763306L;
	
	/**
	 * @author Claod
	 * {@summary propriété noCategorie}
	 */
	private Integer noCotegorie;

	/**
	 * @author Claod
	 * {@summary Getter NoCategorie}
	 * @return NoCategorie
	 */
	public Integer getNoCategorie() {
		return this.noCotegorie;
	}

	/**
	 * @author Claod
	 * {@summary Setter NoCategorie}
	 * @param noCategorie
	 */
	public void setNoCategorie(Integer noCategorie) {
		this.noCotegorie = noCategorie;
	}
	
	/**
	 * @author Claod
	 * {@summary propiété libelle}
	 */
	private String libelle;

	/**
	 * @author Claod
	 * {@summary Getter du libelle}
	 * @return libelle
	 */
	public String getLibelle() {
		return this.libelle;
	}

	/**
	 * @author Claod
	 * {@summary Setter du libelle}
	 * @param libelle
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * @author Claod
	 * {@summary Constructeur sans paramètres}
	 */
	public Categorie() {
		super();
	}

	/**
	 * @author Claod
	 * {@summary Cnstructeur avec paramètres}
	 * @param noCategorie Libelle
	 */
	public Categorie(Integer noCotegorie, String libelle) {
		super();
		this.noCotegorie = noCotegorie;
		this.libelle = libelle;
	}
	
	
}
