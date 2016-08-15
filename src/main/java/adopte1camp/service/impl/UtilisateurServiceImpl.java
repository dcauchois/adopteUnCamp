package adopte1camp.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import adopte1camp.dao.UtilisateurDao;
import adopte1camp.entity.Utilisateur;
import adopte1camp.exception.UtilisateurNotFoundException;
import adopte1camp.service.UtilisateurService;


public class UtilisateurServiceImpl implements UtilisateurService {

	static final Logger LOG = LoggerFactory.getLogger(UtilisateurService.class);

	@Autowired 
	private UtilisateurDao utilisateurDao;

	@Override
	public void creerUtilisateur(Utilisateur utilisateur) 
	{
		LOG.info("Création de l'utilisateur : " + utilisateur.getMail());
		if(verifierSiLoginEstDisponible(utilisateur.getMail()))
		{
			utilisateurDao.save(utilisateur);
		}
		else
		{
			
		}
	}

	@Override
	public void supprimerUtilisateur(Utilisateur utilisateur) 
	{
		LOG.info("Suppression de l'utilisateur : " + utilisateur.getMail());
		utilisateurDao.delete(utilisateur);
	}

	@Override
	public Utilisateur retrouverUtilisateurEnFonctionDeSonLogin(String login) throws UtilisateurNotFoundException 
	{
		LOG.info("Recherche de l'utilisateur : " + login);
		Utilisateur utilisateur = utilisateurDao.findByMail(login);
		if(utilisateur!= null)
		{
			return utilisateur;
		}

		throw new UtilisateurNotFoundException(login);
	}

	@Override
	public List<Utilisateur> listerUtilisateurs() 
	{
		LOG.info("Récupération des utilisateurs");
		List<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
		for(Utilisateur utilisateur : utilisateurDao.findAll())
		{
			utilisateurs.add(utilisateur);
		}
		return utilisateurs;
	}

	@Override
	public boolean verifierCorrespondanceLoginMotDePasse(String login, String motDePasse) 
	{
		LOG.info("Vérification du mot de passe pour : " + login);
		utilisateurDao.findByMailAndPassword(login, motDePasse);
		return false;
	}

	private boolean verifierSiLoginEstDisponible(String login)
	{
		Utilisateur utilisateur = utilisateurDao.findByMail(login);
		return utilisateur==null;
	}

}
