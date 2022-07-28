package org.projetEncheres.BO;

import java.io.Serializable;
import java.util.List;


/**
*
*@author Claod
*{@summary Classe pour modéliser un Utilisateur }
*
*
**/
public class Acquiereur extends Utilisateur implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2610647762171159722L;
	
	/**
	 *
	 **@author Claod
	 *{@summary Propriété matérialisant la liste des Articles de l'utilisateur }
	 *
	 */
	private List<Article> acquisitions;

	/**
	 *
	 **@author Claod
	 *{@summary Getter des Echères remportées }
	 *
	 */
	public List<Article> getEncheresRemportees() {
		return this.acquisitions;
	}

	/**
	 *
	 **@author Claod
	 *{@summary Setter des Enchères remportées }
	 *
	 */
	public void setEncheresRemportees(List<Article> acquisitions) {
		this.acquisitions = acquisitions;
	}

	/**
	 *
	 **@author Claod
	 *{@summary Methode pour encherir }
	 *
	 */
	public void Encherir(Vente enchere, Double prix) {
		if(this.getCredit()>=prix&&prix>enchere.getPrix()) {
			enchere.setPrix(prix);
		}
	}

	/**
	 *
	 **@author Claod
	 *{@summary Constructeur vide }
	 *
	 */
	public Acquiereur() {
		super();
	}
}
