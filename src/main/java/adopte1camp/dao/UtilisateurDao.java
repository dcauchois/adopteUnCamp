package adopte1camp.dao;

import org.springframework.data.repository.CrudRepository;

import adopte1camp.entity.Utilisateur;

public interface UtilisateurDao extends CrudRepository<Utilisateur, Long> {
	
	public Utilisateur findByMail(String mail);

	public Utilisateur findByMailAndPassword(String mail, String password);
	
}
