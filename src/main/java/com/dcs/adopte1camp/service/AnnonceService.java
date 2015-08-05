package com.dcs.adopte1camp.service;

import java.util.List;

import com.dcs.adopte1camp.entity.Annonce;
import com.dcs.adopte1camp.entity.Utilisateur;
import com.dcs.adopte1camp.enumeration.StatutAnnonce;

public interface AnnonceService{
	
	public void ajouterAnnonce(Annonce annonce);
	
	public void annulerAnnonce(Annonce annonce);
	
	public void fermerAnnonce(Annonce annonce);
	
	public List<Annonce> recupererAnnonces();
	
	public List<Annonce> recupererAnnonces(StatutAnnonce statutAnnonce);
	
	public List<Annonce> recupererAnnoncesPourUtilisateur(Utilisateur utilisateur,StatutAnnonce statutAnnonce);
	
	public List<Annonce> recupererAnnoncesPourUtilisateur(Utilisateur utilisateur);
	
	public List<Annonce> recupererAnnoncesEnCoursPourUtilisateur(Utilisateur utilisateur);
	
	public void majCorrespondanceEntreLesAnnonces();

}
