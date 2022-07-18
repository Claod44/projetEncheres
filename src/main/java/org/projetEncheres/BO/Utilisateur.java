package org.projetEncheres.BO;

import java.io.Serializable;

public class Utilisateur implements Serializable {
	
	//Servlets : Se connecter : création de session, verifier et modifier profile // voir le profile d'un autre utilisateur, Se déconnecter : session destruct
	//Se souvenir de moi : cookie
	//Setters a verifier : utiliser trim -> verifier null ou empty POUR TOUS donc fonction dans classe statique "utilitaire", codePostal et Telephone a verifier : type numerique seulement (10 pour telephone, 5 pour code postal)
	
	private Integer credit;

	public Integer getCredit() {
		return this.credit;
	}

	public void setCredit(Integer amount) {
		this.credit = amount;
	}

	private String Nom;

	public String getName() {
		return this.Nom;
	}

	public void setName(String Nom) {
		this.Nom = Nom;
	}
	
	private String prenom;

	public String getPrenom() {
		return this.prenom;
	}
	
	private Integer noUtilisateur;

	public Integer getNoUtilisateur() {
		return this.noUtilisateur;
	}

	public void setNoUtilisateur(Integer id) {
		this.noUtilisateur = id;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	private Utilisateur administrateur;

	public Utilisateur getAdministrateur() {
		return this.administrateur;
	}

	public void setAdministrateur(Utilisateur administrateur) {
		this.administrateur = administrateur;
	}
	
	private String pseudo;

	public String getPseudo() {
		return this.pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	
	private String email;

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	private String telephone;

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	private String rue;

	public String getRue() {
		return this.rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}
	
	private String codePostal;

	public String getCodePostal() {
		return this.codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	
	private String motDePasse;

	public String getMotDePasse() {
		return this.motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	
	public Utilisateur() {
		super();
	}

	public Utilisateur(Integer credit) {
		super();
		this.credit = credit;
	}

	public Utilisateur(Integer credit, String nom, String prenom, Integer noUtilisateur, Utilisateur administrateur,
			String pseudo, String email, String telephone, String rue, String codePostal, String motDePasse) {
		super();
		this.credit = credit;
		Nom = nom;
		this.prenom = prenom;
		this.noUtilisateur = noUtilisateur;
		this.administrateur = administrateur;
		this.pseudo = pseudo;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.motDePasse = motDePasse;
	}
	
	
	
}
