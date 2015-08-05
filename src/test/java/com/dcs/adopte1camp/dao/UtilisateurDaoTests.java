package com.dcs.adopte1camp.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import com.dcs.adopte1camp.Application;
import com.dcs.adopte1camp.entity.Utilisateur;
import com.dcs.adopte1camp.exception.UtilisateurNotFoundException;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class UtilisateurDaoTests {
	
	@Autowired
	private UtilisateurDao utilisateurDao;
	
	private Iterable<Utilisateur> sauvegardeDesDonnees;
	
	private final String LOGIN_UTILISATEUR_OK="utilisateur";
	private final String LOGIN_UTILISATEUR_KO="utilisateurInvalide";
	private final String PASSWORD_UTILISATEUR_OK="motDePasse";
	
	private Utilisateur utilisateur;
	
	@Before
	public void setUp()
	{
		sauvegardeDesDonnees = utilisateurDao.findAll();
		
		utilisateur = new Utilisateur(LOGIN_UTILISATEUR_OK,PASSWORD_UTILISATEUR_OK);
		
		utilisateurDao.deleteAll();
		utilisateurDao.save(utilisateur);
	}
	
	@After
	public void tearDown()
	{
		utilisateurDao.deleteAll();
		utilisateurDao.save(sauvegardeDesDonnees);
	}
	
	
	@Test
	public void testRecuperationUtilisateurEnFonctionDeSonLogin()
	{		
		assertThat(utilisateurDao.findByMail(LOGIN_UTILISATEUR_OK).getId(),is(utilisateur.getId()));
	}
	
	@Test
	public void testRecuperationUtilisateurEnFonctionDeSonLoginAvecLoginIncorrect()
	{
		
		try
		{
			Utilisateur resultat = utilisateurDao.findByMail(LOGIN_UTILISATEUR_KO);
		}
		catch(Exception e)
		{
			assertThat(e,instanceOf(UtilisateurNotFoundException.class));
		}
	}

}
