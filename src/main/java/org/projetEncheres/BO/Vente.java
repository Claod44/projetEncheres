package org.projetEncheres.BO;

import java.io.Serializable;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


/**
*
**@author Claod
*{@summary Classe modélisant une vente }
*/
public class Vente implements Serializable {
	
	//TODO BETA : gere le temps d'une vente, intégre une liste d'acquiereur
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3071114700981685602L;

	/**
	 * @author Claod
	 * {@summary Propriété des articles}
	 */
	private Article article;

	/**
	 * @author Claod
	 * {@summary Getter pour obtenir l'article concerné par la vente }
	 * @return article
	 */
	public Article getArticle() {
		return this.article;
	}

	/**
	 * @author Claod
	 * {@summary Setter pour définir l'article concerné par la vente }
	 * @param article
	 */
	public void setArticle(Article article) {
		this.article = article;
	}
	
	/**
	 * @author Claod
	 * {@summary Propriété du prix}
	 */
	private Double prix;

	/**
	 * @author Claod
	 * {@summary Getter pour obtenir le prix actuel de la vente }
	 * @return prix
	 */
	public Double getPrix() {
		return this.prix;
	}

	/**
	 * @author Claod
	 * {@summary Setter pour définir le prix de la vente }
	 * @param prix
	 */
	public void setPrix(Double prix) {
		if(prix > this.prix) {
			this.prix = prix;
		}
	}
	
	/**
	 * @author Claod
	 * {@summary Propriété de l'acquierreur}
	 */
	private Acquiereur acquiereur;

	/**
	 * @author Claod
	 * {@summary Getter pour obtenir l'utilisateur ayant remporté la vente }
	 * @return acquiereur
	 */
	public Acquiereur getAcquiereur() {
		return this.acquiereur;
	}

	/**
	 * @author Claod
	 * {@summary Setter pour définir l'utilisateur ayant remporté la vente }
	 * @param acquiereur
	 */
	public void setAcquiereur(Acquiereur acquiereur) {
		this.acquiereur = acquiereur;
	}
	
	/**
	 * @author Claod
	 * {@summary Propriété représentant la liste des acquiereurs ayant encheris sur cette vente }
	 */
	private List<Acquiereur> acquiereursPotentiels;

	/**
	 * @author Claod
	 * {@summary Getter pour obtenir la liste des personnes ayant encherris sur cette vente }
	 * @return acquiereursPotentiels
	 */
	public List<Acquiereur> getAcquiereursPotentiels() {
		return this.acquiereursPotentiels;
	}

	/**
	 * @author Claod
	 * {@summary Setter pour définir la liste des utilisateurs ayant encheris sur cette vente }
	 * @param acquiereursPotentiels
	 */
	public void setAcquiereursPotentiels(List<Acquiereur> acquiereursPotentiels) {
		this.acquiereursPotentiels = acquiereursPotentiels;
	}
	
	/**
	 * @author Claod
	 * {@summary Propriété représentant l'état de la vente}
	 */
	private Boolean etat;

	/**
	 * @author Claod
	 * {@summary Getter pour savoir si la vente est toujours en cours }
	 * @return etat
	 */
	public Boolean isOuverte() {
		return this.etat;
	}

	/**
	 * @author Claod
	 * {@summary Permet de mettre l'état de cette vente comme étant "fini" } //TODO à revoir
	 */
	public void Fermer() {
		this.etat = false;
	}
	
	/**
	 * @author Claod
	 * {@summary Propriété représentant la durée de la vente }
	 */
	private int duree;
	
	/**
	 * @author Claod
	 * {@summary Propriété (potentiellement non privée) concernant le timer en cours de la vente }
	 */
	final Timer timer;

	/**
	 * @author Claod
	 * {@summary Getter pour obtenir le temps restant à la vente }
	 * @return timer
	 */
	public Integer getDuree() {
		return this.duree;
	}

	/**
	 * @author Claod
	 * {@summary Setter pour définir la durée de la vente }
	 * @param duree
	 */
	public void setDuree(Integer duree) {
		this.duree = duree;
	}

	/**
	 * @author Claod
	 * {@summary Contructeur avec paramètres }
	 * @param article
	 * @param duree
	 * @param acquiereursPotentiels
	 */
	public Vente(Article article, int duree, List<Acquiereur> acquiereursPotentiels) {
		super();
		this.prix = article.getMiseAPrix();
		this.article = article;
		this.duree = duree;
		
		this.timer = new Timer();
		 
		this.acquiereursPotentiels = acquiereursPotentiels;
	}
	
	/**
	 * @author Claod
	 * {@summary Methode permettant d'ajouter une acheteur à la liste des personnes souhaitant encherir sur la vente }
	 * @param retardataire
	 */
	public void addAcquiereurSupplementaire(Acquiereur retardataire) {
		this.acquiereursPotentiels.add(retardataire);
	}
	
	/**
	 * @author Claod
	 * {@summary Permet de démarrer le timer de la vente }
	 */
	public void Commence() {
		//TODO Timer en jours : https://www.codegrepper.com/code-examples/java/java+timer+schedule+every+day
	     this.timer.scheduleAtFixedRate(
	    		 new TimerTask() {
	    			 
	    			 public void run() {
	    				 duree--;
	    				 //message il rest XX minutes
	    				 if (duree < 0) {
	    					 timer.cancel();
	    					 //message temps fini
	    					 Fermer();
	    				 }
	    			 }
	    		 }, 0, 1000);
	}
	
	/**
	 * @author Claod
	 * {@summary Permet d'annuler la vente }
	 */
	public void Annuler() {
		//TODO Voir remboursements points, voir suppression en bdd (table des ventes)
		this.Fermer();
	}

	/**
	 * @author Claod
	 * {@summary Constructeur vide}
	 */
	public Vente() {
		super();
		this.timer = new Timer();
	}

	/**
	 * @author Claod
	 * {@summary Constructeur avec paramètres }
	 * @param article
	 * @param prix
	 * @param acquiereur
	 * @param acquiereursPotentiels
	 * @param etat
	 * @param duree
	 */
	public Vente(Article article, Double prix, Acquiereur acquiereur, List<Acquiereur> acquiereursPotentiels,
			Boolean etat, int duree) {
		super();
		this.article = article;
		this.prix = prix;
		this.acquiereur = acquiereur;
		this.acquiereursPotentiels = acquiereursPotentiels;
		this.etat = etat;
		this.duree = duree;
		this.timer = new Timer();
	}
	
	
	

}
