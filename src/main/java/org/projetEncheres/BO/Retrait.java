package org.projetEncheres.BO;

import java.io.Serializable;

public class Retrait implements Serializable {
	private String rue;

	public String getRue() {
		return this.rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}
	
	private String code_postal;

	public String getCodePostal() {
		return this.code_postal;
	}

	public void setCodePostal(String code_postal) {
		this.code_postal = code_postal;
	}
	
	private String ville;

	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Retrait() {
		super();
	}

	public Retrait(String rue, String code_postal, String ville) {
		super();
		this.rue = rue;
		this.code_postal = code_postal;
		this.ville = ville;
	}
	
	
	
}
