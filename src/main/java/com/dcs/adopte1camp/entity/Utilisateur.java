package com.dcs.adopte1camp.entity;

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
	
	public Utilisateur(String mail, String password)
	{
		this.mail=mail;
		this.password=password;
	}
}
