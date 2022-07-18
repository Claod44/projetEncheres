package org.projetEncheres.BO;

import java.io.Serializable;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Vente implements Serializable {
	
	//TODO BETA : gere le temps d'une vente, intégre une liste d'acquiereur
	
	private Article article;

	public Article getArticle() {
		return this.article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
	
	private Double prix;

	public Double getPrix() {
		return this.prix;
	}

	public void setPrix(Double prix) {
		if(prix > this.prix) {
			this.prix = prix;
		}
	}
	
	private Acquiereur acquiereur;

	public Acquiereur getAcquiereur() {
		return this.acquiereur;
	}

	public void setAcquiereur(Acquiereur acquiereur) {
		this.acquiereur = acquiereur;
	}
	
	private List<Acquiereur> acquiereursPotentiels;

	public List<Acquiereur> getAcquiereursPotentiels() {
		return this.acquiereursPotentiels;
	}

	public void setAcquiereursPotentiels(List<Acquiereur> acquiereursPotentiels) {
		this.acquiereursPotentiels = acquiereursPotentiels;
	}
	
	private Boolean etat;

	public Boolean isOuverte() {
		return this.etat;
	}

	public void Fermer() {
		this.etat = false;
	}
	
	private int duree;
	
	final Timer timer;

	public Integer getDuree() {
		return this.duree;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}

	public Vente(Article article, int duree, List<Acquiereur> acquiereursPotentiels) {
		super();
		this.prix = article.getMiseAPrix();
		this.article = article;
		this.duree = duree;
		
		this.timer = new Timer();
		 
		this.acquiereursPotentiels = acquiereursPotentiels;
	}
	
	public void addAcquiereurSupplementaire(Acquiereur retardataire) {
		this.acquiereursPotentiels.add(retardataire);
	}
	
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
	
	public void Annuler() {
		//TODO Voir remboursements points, voir suppression en bdd (table des ventes)
		this.Fermer();
	}

	public Vente() {
		super();
		this.timer = new Timer();
	}

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
