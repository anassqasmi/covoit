package com.covoit.models;

public class Utilisateur {
	
	private String cin;
	private String nom;
	private String prenom;
	private String email;
	private String facebook;
	private String numero;
	private Sexe genre;

	public Utilisateur(String cin, String nom, String prenom, String email,
			String facebook, String numero, Sexe genre) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.facebook = facebook;
		this.numero = numero;
		this.genre = genre;
	}

	public Utilisateur() {
		super();
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Sexe getGenre() {
		return genre;
	}

	public void setGenre(Sexe genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Utilisateur [cin=" + cin + ", nom=" + nom + ", prenom="
				+ prenom + ", email=" + email + ", facebook=" + facebook
				+ ", numero=" + numero + ", genre=" + genre + "]";
	}

}
