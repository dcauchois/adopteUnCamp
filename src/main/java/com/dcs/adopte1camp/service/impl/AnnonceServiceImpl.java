package com.dcs.adopte1camp.service.impl;

import java.util.List;

import com.dcs.adopte1camp.entity.Annonce;
import com.dcs.adopte1camp.entity.Utilisateur;
import com.dcs.adopte1camp.enumeration.StatutAnnonce;
import com.dcs.adopte1camp.service.AnnonceService;

public class AnnonceServiceImpl implements AnnonceService {

	
	
	@Override
	public void ajouterAnnonce(Annonce annonce) {
		// TODO Auto-generated method stub

	}

	@Override
	public void annulerAnnonce(Annonce annonce) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fermerAnnonce(Annonce annonce) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Annonce> recupererAnnonces() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Annonce> recupererAnnonces(StatutAnnonce statutAnnonce) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Annonce> recupererAnnoncesPourUtilisateur(Utilisateur utilisateur, StatutAnnonce statutAnnonce) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Annonce> recupererAnnoncesPourUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Annonce> recupererAnnoncesEnCoursPourUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void majCorrespondanceEntreLesAnnonces() {
		// TODO Auto-generated method stub

	}

}
