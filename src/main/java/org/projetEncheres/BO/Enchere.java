package org.projetEncheres.BO;

import java.io.Serializable;
import java.util.Date;

/**
*
**@author Claod
*{@summary Classe modélisant une enchère }
*/
public class Enchere implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1289750107040088010L;
	//A revoir avec l'equipe pour résoudre la limite entre une enchere et le contenu de la classe vente
	
	/**
	 * @author Claod
	 * {@summary Propriété dateEnchere}
	 */
	private Date dateEnchere;

	/**
	 * @author Claod
	 * {@summary Getter dateEnchere}
	 * @return dateEnchere
	 */
	public Date getDateEnchere() {
		return this.dateEnchere;
	}

	/**
	 * @author Claod
	 * {@summary Setter dateEnchere}
	 * @param dateEnchere
	 */
	public void setDateEnchere(Date dateEnchere) {
		this.dateEnchere = dateEnchere;
	}
	
	/**
	 * @author Claod
	 * {@summary Propriété montantEnchere}
	 */
	private Double montantEnchere;

	/**
	 * @author Claod
	 * {@summary Getter du montant de l'enchère (prix le plus haut)}
	 * @return montantEnchere
	 */
	public Double getMontantEnchere() {
		return this.montantEnchere;
	}

	/**
	 * @author Claod
	 * {@summary setter montant de l'enchere (prix le plus haut)}
	 * @param montantEnchere
	 */
	public void setMontantEnchere(Double montantEnchere) {
		this.montantEnchere = montantEnchere;
	}

	/**
	 * @author Claod
	 * {@summary Constructeur sans paramètres}
	 */
	public Enchere() {
		super();
	}

	/**
	 * @author Claod
	 * {@summary Constructeur avec parametres}
	 * @param dateENchere montantEnchere
	 */
	public Enchere(Date dateEnchere, Double montantEnchere) {
		super();
		this.dateEnchere = dateEnchere;
		this.montantEnchere = montantEnchere;
	}
	
	
}
