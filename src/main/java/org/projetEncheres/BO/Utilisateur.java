package org.projetEncheres.BO;

import java.io.Serializable;

/**
*
*@author Claod
*{@summary Classe modélisant un utilisateur }
*/
public class Utilisateur implements Serializable {
	
	//Servlets : Se connecter : création de session, verifier et modifier profile // voir le profile d'un autre utilisateur, Se déconnecter : session destruct
	//Se souvenir de moi : cookie
	//Setters a verifier : utiliser trim -> verifier null ou empty POUR TOUS donc fonction dans classe statique "utilitaire", codePostal et Telephone a verifier : type numerique seulement (10 pour telephone, 5 pour code postal)
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8472308215182534529L;
	
	/**
	*
	*@author Claod
	*{@summary Propriété de la montant du crédit }
	*/
	private Integer credit;

	/**
	 * @author Claod
	 * {@summary get The credit}
	 * @return The Credit as Integer
	 */
	public Integer getCredit() {
		return this.credit;
	}
	
	/**
	 * @author Claod
	 * {@summary set The credit}
	 * @param Integer amount
	 */
	public void setCredit(Integer amount) {
		this.credit = amount;
	}

	/**
	*
	*@author Claod
	*{@summary Propriété du nom }
	*/
	private String nom;

	/**
	 * @author Claod
	 * 
	 * @return
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * @author Claod
	 * 
	 * @param Nom
	 */
	public void setNom(String Nom) {
		this.nom = Nom;
	}
	
	/**
	*
	*@author Claod
	*{@summary Propriété du prenom }
	*/
	private String prenom;

	public String getPrenom() {
		return this.prenom;
	}
	
	/**
	*
	*@author Claod
	*{@summary Propriété du uméro de l'utilisateur }
	*/
	private Integer noUtilisateur;

	public Integer getNoUtilisateur() {
		return this.noUtilisateur;
	}

	/**
	 * @author Claod
	 * 
	 * @param id
	 */
	public void setNoUtilisateur(Integer id) {
		this.noUtilisateur = id;
	}

	/**
	 * @author Claod
	 * 
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	/**
	*
	*@author Claod
	*{@summary Propriété représentant le role (administrateur ou non) de l'utilisateur }
	*/
	private Boolean administrateur;

	/**
	 * @author Claod
	 * 
	 * @return
	 */
	public Boolean isAdministrateur() {
		return this.administrateur;
	}

	/**
	 * @author Claod
	 * 
	 * @param administrateur
	 */
	public void setIsAdministrateur(Boolean administrateur) {
		this.administrateur = administrateur;
	}
	
	/**
	*
	*@author Claod
	*{@summary Propriété du Pseudo }
	*/
	private String pseudo;

	/**
	 * @author Claod
	 * 
	 * @return
	 */
	public String getPseudo() {
		return this.pseudo;
	}

	/**
	 * @author Claod
	 * 
	 * @param pseudo
	 */
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	
	/**
	*
	*@author Claod
	*{@summary Propriété de l'email }
	*/
	private String email;

	/**
	 * @author Claod
	 * 
	 * @return
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * @author Claod
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	*
	*@author Claod
	*{@summary Propriété du téléphone }
	*/
	private String telephone;

	/**
	 * @author Claod
	 * 
	 * @return
	 */
	public String getTelephone() {
		return this.telephone;
	}

	/**
	 * @author Claod
	 * 
	 * @param telephone
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	/**
	*
	*@author Claod
	*{@summary Propriété de la rue }
	*/
	private String rue;

	/**
	 * @author Claod
	 * 
	 * @return
	 */
	public String getRue() {
		return this.rue;
	}

	/**
	 * @author Claod
	 * 
	 * @param rue
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}
	
	/**
	*
	*@author Claod
	*{@summary Propriété du code postal }
	*/
	private String codePostal;

	/**
	 * @author Claod
	 * 
	 * @return
	 */
	public String getCodePostal() {
		return this.codePostal;
	}

	/**
	 * @author Claod
	 * 
	 * @param codePostal
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	
	/**
	*
	*@author Claod
	*{@summary Propriété de la ville }
	*/
	private String ville;

	/**
	 * @author Claod
	 * 
	 * @return
	 */
	public String getVille() {
		return this.ville;
	}

	/**
	 * @author Claod
	 * 
	 * @param ville
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	/**
	*
	*@author Claod
	*{@summary Propriété du mot de passe }
	*/
	private String motDePasse;

	/**
	 * @author Claod
	 * 
	 * @return
	 */
	public String getMotDePasse() {
		return this.motDePasse;
	}

	/**
	 * @author Claod
	 * 
	 * @param motDePasse
	 */
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	
	/**
	*
	*@author Claod
	*{@summary Constructeur vide }
	*/
	public Utilisateur() {
		super();
	}
	
	public Utilisateur(String nom, String prenom,
			String pseudo, String email, String motDePasse,
			String telephone, String rue, String codePostal, String ville) {
		this();
		this.credit = 1000;
		this.nom = nom;
		this.prenom = prenom;
		this.administrateur = false;
		this.pseudo = pseudo;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
	}

	public Utilisateur(String nom, String prenom,
			String pseudo, String email, String motDePasse,
			String telephone, String rue, String codePostal, String ville, Boolean administrateur) {
		this(nom, prenom, pseudo, email, motDePasse, telephone, rue, codePostal, ville);
		this.credit = 1000;
		this.nom = nom;
		this.prenom = prenom;
		this.administrateur = administrateur;
		this.pseudo = pseudo;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
	}
	
	public Utilisateur(Integer noUtilisateur,
			String nom, String prenom,
			String pseudo, String email, String motDePasse,
			String telephone, String rue, String codePostal, String ville) {
		this();
		this.credit = 1000;
		this.nom = nom;
		this.prenom = prenom;
		this.noUtilisateur = noUtilisateur;
		this.administrateur = false;
		this.pseudo = pseudo;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
	}

	public Utilisateur(Integer noUtilisateur,
			String nom, String prenom,
			String pseudo, String email, String motDePasse,
			String telephone, String rue, String codePostal, String ville,
			Integer credit, Boolean administrateur) {
		this();
		this.credit = credit;
		this.nom = nom;
		this.prenom = prenom;
		this.noUtilisateur = noUtilisateur;
		this.administrateur = administrateur;
		this.pseudo = pseudo;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
	}
	
	

	
	
	
	
}
