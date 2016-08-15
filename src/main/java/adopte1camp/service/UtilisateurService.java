package adopte1camp.service;

import java.util.List;

import adopte1camp.entity.Utilisateur;
import adopte1camp.exception.UtilisateurNotFoundException;

public interface UtilisateurService 
{
	public void creerUtilisateur(Utilisateur utilisateur);
	
	public void supprimerUtilisateur(Utilisateur utilisateur);
	
	public Utilisateur retrouverUtilisateurEnFonctionDeSonLogin(String login) throws UtilisateurNotFoundException;
	
	public List<Utilisateur> listerUtilisateurs();
	
	public boolean verifierCorrespondanceLoginMotDePasse(String login, String motDePasse);

}
