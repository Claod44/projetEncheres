package org.projetEncheres.BO;

import java.util.Date;

public class Enchere {
	//A revoir avec l'equipe pour résoudre la limite entre une enchere et le contenu de la classe vente
	private Date dateEnchere;

	public Date getName() {
		return this.dateEnchere;
	}

	public void setName(Date dateEnchere) {
		this.dateEnchere = dateEnchere;
	}
	
	private Double montantEnchere;

	public Double getMontantEnchere() {
		return this.montantEnchere;
	}

	public void setMontantEnchere(Double montantEnchere) {
		this.montantEnchere = montantEnchere;
	}

	public Enchere() {
		super();
	}

	public Enchere(Date dateEnchere, Double montantEnchere) {
		super();
		this.dateEnchere = dateEnchere;
		this.montantEnchere = montantEnchere;
	}
	
	
}
