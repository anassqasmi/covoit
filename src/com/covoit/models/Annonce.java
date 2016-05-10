package com.covoit.models;

public class Annonce {
	private int id;
	private Conducteur covoitureur;
	private String depart;
	private String arrivee;
	private String chemin;
	private int places;
	private String date;
	private int prix;
	private boolean bagage;
	private Bagage typeBagage;
	
	public Annonce(int id, Conducteur covoitureur, String depart,
			String arrivee, String chemin, int places, String date, int prix,
			boolean bagage, Bagage typeBagage) {
		super();
		this.id = id;
		this.covoitureur = covoitureur;
		this.depart = depart;
		this.arrivee = arrivee;
		this.chemin = chemin;
		this.places = places;
		this.date = date;
		this.prix = prix;
		this.bagage = bagage;
		this.typeBagage = typeBagage;
	}

	public Annonce() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Conducteur getCovoitureur() {
		return covoitureur;
	}

	public void setCovoitureur(Conducteur covoitureur) {
		this.covoitureur = covoitureur;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getArrivee() {
		return arrivee;
	}

	public void setArrivee(String arrivee) {
		this.arrivee = arrivee;
	}

	public String getChemin() {
		return chemin;
	}

	public void setChemin(String chemin) {
		this.chemin = chemin;
	}

	public int getPlaces() {
		return places;
	}

	public void setPlaces(int places) {
		this.places = places;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public boolean isBagage() {
		return bagage;
	}

	public void setBagage(boolean bagage) {
		this.bagage = bagage;
	}

	public Bagage getTypeBagage() {
		return typeBagage;
	}

	public void setTypeBagage(Bagage typeBagage) {
		this.typeBagage = typeBagage;
	}

	@Override
	public String toString() {
		return "Annonce [id=" + id + ", covoitureur=" + covoitureur
				+ ", depart=" + depart + ", arrivee=" + arrivee + ", chemin="
				+ chemin + ", places=" + places + ", date=" + date + ", prix="
				+ prix + ", bagage=" + bagage + ", typeBagage=" + typeBagage
				+ "]";
	}
	
	
}
