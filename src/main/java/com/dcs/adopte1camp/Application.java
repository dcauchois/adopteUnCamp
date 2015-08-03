package com.dcs.adopte1camp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dcs.adopte1camp.dao.UtilisateurDao;
import com.dcs.adopte1camp.entity.Utilisateur;

@SpringBootApplication
public class Application{

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
    
    
    @Autowired
    private UtilisateurDao utilisateurDao;
    
    public void run()
    {
    	utilisateurDao.save(new Utilisateur("toto", "test"));
    }

}