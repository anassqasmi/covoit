package com.covoit.metier;

import com.covoit.models.Annonce;
import com.covoit.models.Utilisateur;
import com.covoit.models.Voiture;

public interface ActionInterfaces {

	public void ajouterUtilisateur(Utilisateur utilisateur);
	public void suprimerUtilisateur(int cin);
	public void suprimerUtilisateur(Utilisateur utilisateur);
	public void ajouterVoiture(Voiture voiture);
	public void suprimerVoiture(int id);
	public void suprimerVoiture(Voiture voiture);
	public void nouvelAnnonce(Annonce annonce);
	public void plusDisponible(Annonce annonce);
	public void plusDisponible(int id);
	public Annonce chercherAnnonce(Annonce annonce);
	public Annonce chercherAnnonce(String depart, String arrivee);
	public Annonce chercherAnnonce(String depart, String arrivee, String date);
	
}
