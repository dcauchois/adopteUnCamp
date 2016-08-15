package adopte1camp.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="utilisateurs")
public class Utilisateur {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@Column(unique=true, length=50)
	private String mail;

	@Column(length=100)
	private String password;

	@OneToMany(mappedBy="createur")
	private Collection<Annonce> annoncesCrees;

	public Utilisateur(){}

	public Utilisateur(String mail, String password)
	{
		this.mail=mail;
		this.password=password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Collection<Annonce> getAnnoncesCrees() {
		return annoncesCrees;
	}

	public void setAnnoncesCrees(Collection<Annonce> annoncesCrees) {
		this.annoncesCrees = annoncesCrees;
	}

}
