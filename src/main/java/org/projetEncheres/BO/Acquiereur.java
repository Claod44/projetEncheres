package org.projetEncheres.BO;

import java.util.List;

public class Acquiereur extends Utilisateur {
	private List<Article> acquisitions;

	public List<Article> getEncheresRemportees() {
		return this.acquisitions;
	}

	public void setEncheresRemportees(List<Article> acquisitions) {
		this.acquisitions = acquisitions;
	}

	public void Encherir(Vente enchere, Double prix) {
		if(this.getCredit()>=prix&&prix>enchere.getPrix()) {
			enchere.setPrix(prix);
		}
	}

	public Acquiereur() {
		super();
	}
}
