package org.projetEncheres.BO;

import java.io.Serializable;
import java.util.Date;

/**
*
**@author Claod
*{@summary Classe modélisant un article }
*
*/
public class Article implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -50866195841529666L;
	
	/**
	 *
	 **@author Claod
	 *{@summary Propriété symbolisant le prix de départ }
	 *
	 */
	private Double miseAParix;

	
	/**
	 *
	 **@author Claod
	 *{@summary Getter du prix de départ }
	 *
	 */
	public Double getMiseAPrix() {
		return this.miseAParix;
	}

	/**
	 *
	 **@author Claod
	 *{@summary Setter du prix de départ }
	 *
	 */
	public void setMiseAPrix(Double prix) {
		this.miseAParix = prix;
	}
	
	/**
	 *
	 **@author Claod
	 *{@summary Propriété matérialisant le nom de l'article }
	 *
	 */
	private String nomArticle;

	/**
	 *
	 **@author Claod
	 *{@summary Getter du nom de l'article }
	 *
	 */
	public String getNomArticle() {
		return this.nomArticle;
	}

	/**
	 *
	 **@author Claod
	 *{@summary Setter du nom de l'article }
	 *
	 */
	public void setNomArticle(String nom) {
		this.nomArticle = nom;
	}
	
	/**
	 *
	 **@author Claod
	 *{@summary Propriété matérialisant le numéro de l'article }
	 *
	 */
	private Integer noArticle;

	/**
	 *
	 **@author Claod
	 *{@summary Getter du numero de l'article }
	 *
	 */
	public Integer getNoArticle() {
		return this.noArticle;
	}

	/**
	 *
	 **@author Claod
	 *{@summary Setter du numéro de l'article }
	 *
	 */
	public void setNoArticle(Integer id) {
		this.noArticle = id;
	}
	
	/**
	 *
	 **@author Claod
	 *{@summary Propriété matérialisant la description de l'article }
	 *
	 */
	private String description;

	/**
	 *
	 **@author Claod
	 *{@summary Getter de la description }
	 *
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 *
	 **@author Claod
	 *{@summary Setter de la description }
	 *
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 *
	 **@author Claod
	 *{@summary Propriété matérialisant la date de début de l'enchère }
	 *
	 */
	private Date dateDebutEncheres;

	/**
	 *
	 **@author Claod
	 *{@summary Getter de la date du début de l'enchère }
	 *
	 */
	public Date getDateDebutEncheres() {
		return this.dateDebutEncheres;
	}

	/**
	 *
	 **@author Claod
	 *{@summary Setter de la date de début }
	 *
	 */
	public void setDateDebutEncheres(Date dateDebutEncheres) {
		this.dateDebutEncheres = dateDebutEncheres;
	}
	
	/**
	 *
	 **@author Claod
	 *{@summary Propriété matérialisant la date de la fin de l'enchère }
	 *
	 */
	private Date dateFinEncheres;

	/**
	 *
	 **@author Claod
	 *{@summary Getter de la date de fin de l'enchère }
	 *
	 */
	public Date getDateFinEncheres() {
		return this.dateFinEncheres;
	}

	/**
	 *
	 **@author Claod
	 *{@summary Setter de la date de fin de l'enchère }
	 *
	 */
	public void setDateFinEncheres(Date dateFinEncheres) {
		this.dateFinEncheres = dateFinEncheres;
	}
	
	/**
	 *
	 **@author Claod
	 *{@summary Propriété matérialisant l'état de la vente }
	 *
	 */
	private Boolean etatVente;

	/**
	 *
	 **@author Claod
	 *{@summary Getter de l'etat de la vente }
	 *
	 */
	public Boolean getEtatVente() {
		return this.etatVente;
	}

	/**
	 *
	 **@author Claod
	 *{@summary Setter de l'etat de la vente }
	 *
	 */
	public void setEtatVente(Boolean etatVente) {
		this.etatVente = etatVente;
	}
	
	/**
	 *
	 **@author Claod
	 *{@summary Propriété matérialisant la catégorie de l'article }
	 *
	 */
	private Categorie categorieArticle;

	/**
	 *
	 **@author Claod
	 *{@summary Getter de la catégorie d el'article }
	 *
	 */
	public Categorie getCategorieDeLarticle() {
		return this.categorieArticle;
	}

	/**
	 *
	 **@author Claod
	 *{@summary Setter de la catégorie de 'larticle }
	 *
	 */
	public void setCategorieDeLarticle(Categorie categorieDeLarticle) {
		this.categorieArticle = categorieDeLarticle;
	}
	
	/**
	 *
	 **@author Claod
	 *{@summary Propriété matérialisant le prix de vente }
	 *
	 */
	private Double prixVente;

	public Double getPrixVente() {
		return this.prixVente;
	}

	public void setPrixVente(Double prixVente) {
		this.prixVente = prixVente;
	}

	/**
	 *
	 **@author Claod
	 *{@summary Constructeur avec parametres }
	 *@param (Double miseAParix), (String nomArticle), (Integer noArticle), (String description), (Date dateDebutEncheres), (Date dateFinEncheres), (Boolean etatVente), (Categorie categorieArticle), (Double prixVente)
	 *
	 */
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

	/**
	 *
	 **@author Claod
	 *{@summary Constructeur avec parametres }
	 *@param (Double miseAParix), (String nomArticle), (Integer noArticle), (String description), (Date dateDebutEncheres), (Date dateFinEncheres), (Boolean etatVente), (Categorie categorieArticle)
	 *
	 */
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

	/**
	 *
	 **@author Claod
	 *{@summary Constructeur vide }
	 *
	 */
	public Article() {
		super();
	}
	
	
}
