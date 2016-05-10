package com.covoit.models;

public class Voiture {

	private int id;
	private String marque;
	private String modele;
	private String matricule;
	private String couleur;
	private String description;

	public Voiture(int id, String marque, String modele, String matricule,
			String couleur, String description) {
		super();
		this.id = id;
		this.marque = marque;
		this.modele = modele;
		this.matricule = matricule;
		this.couleur = couleur;
		this.description = description;
	}

	public Voiture() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Voiture [id=" + id + ", marque=" + marque + ", modele="
				+ modele + ", matricule=" + matricule + ", couleur=" + couleur
				+ ", description=" + description + "]";
	}

}
