package com.dcs.adopte1camp.dao;

import org.springframework.data.repository.CrudRepository;

import com.dcs.adopte1camp.entity.Utilisateur;

public interface UtilisateurDao extends CrudRepository<Utilisateur, Long> {
	
	Utilisateur findByMail(String mail);

}
