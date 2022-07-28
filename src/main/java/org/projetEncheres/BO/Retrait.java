package org.projetEncheres.BO;

import java.io.Serializable;

/**
*
**@author Claod
*{@summary Classe modélisant un retrait }
*/
public class Retrait implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3874204200274078198L;
	
	/**
	 * @author Claod
	 * {@summary Propriété de la rue}
	 */
	private String rue;

	/**
	 * @author Claod
	 * {@summary Getter de la rue}
	 * @return rue
	 */
	public String getRue() {
		return this.rue;
	}

	/**
	 * @author Claod
	 * {@summary Setter de la rue}
	 * @param rue
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}
	
	/**
	 * @author Claod
	 * {@summary Propriété du code postal}
	 */
	private String code_postal;

	/**
	 * @author Claod
	 * {@summary Getter du code postal}
	 * @return code_postal
	 */
	public String getCodePostal() {
		return this.code_postal;
	}

	/**
	 * @author Claod
	 * {@summary Setter du code postal}
	 * @param code_postal
	 */
	public void setCodePostal(String code_postal) {
		this.code_postal = code_postal;
	}
	
	/**
	 * @author Claod
	 * {@summary Propriété de la ville}
	 */
	private String ville;

	/**
	 * @author Claod
	 * {@summary Getter de la ville}
	 * @return ville
	 */
	public String getVille() {
		return this.ville;
	}

	/**
	 * @author Claod
	 * {@summary Setter de la ville}
	 * @param ville
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/**
	 * @author Claod
	 * {@summary Constructeur sans paramètres}
	 */
	public Retrait() {
		super();
	}

	/**
	 * @author Claod
	 * {@summary Constructeur avec paramètres}
	 */
	public Retrait(String rue, String code_postal, String ville) {
		super();
		this.rue = rue;
		this.code_postal = code_postal;
		this.ville = ville;
	}
	
	
	
}
