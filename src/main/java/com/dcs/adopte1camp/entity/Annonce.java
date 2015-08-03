package com.dcs.adopte1camp.entity;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.dcs.adopte1camp.enumeration.StatutAnnonce;
import com.dcs.adopte1camp.enumeration.TrancheAge;


@Entity
@Table(name = "annonces")
public class Annonce {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@NotNull
	@Column(length=50)
	private String titre;
	
	@NotNull
	@Column(length=500)
	private String description;
	
	private Date dateExpiration;
	
	@ManyToOne
	private Utilisateur createur;
	
	@Enumerated(EnumType.STRING)
	private StatutAnnonce statut;
	
	@Enumerated(EnumType.STRING)
	private TrancheAge trancheAge;
	
	@OneToMany(mappedBy="annonce")
	private Collection<CritereLieu> criteresLieu;
	
	@OneToMany(mappedBy="annonce")
	private Collection<CritereDisponibilite> criteresDisponibilite;	
}
