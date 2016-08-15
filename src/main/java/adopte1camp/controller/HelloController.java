package adopte1camp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import adopte1camp.dao.UtilisateurDao;
import adopte1camp.entity.Utilisateur;

@RestController
public class HelloController 
{

	@Autowired
	private UtilisateurDao utilisateurDao;

	@RequestMapping(value="/hello/{name}")
	String hello(@PathVariable String name) {

		utilisateurDao.save(new Utilisateur(name, "test"));
		Utilisateur utilisateur = utilisateurDao.findByMail(name);
		return "Hello, " +utilisateur.getMail() + "!";
	}



}
