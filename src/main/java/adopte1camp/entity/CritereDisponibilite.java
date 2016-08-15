package adopte1camp.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="criteres_disponibilite")
public class CritereDisponibilite {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@ManyToOne
	private Annonce annonce;
	
	private Date debutDisponibilite;
	private Date finDisponibilite;
	
	private int dureeMinimale;
	private int dureeMaximale;
	
	private Boolean directeurDisponible;
	private Integer nombreAnimateursQualifiesDisponibleMax;
	private Integer nombreAnimateursQualifiesDisponibleMin;

	private Integer nombreAnimateursStagiaireDisponibleMax;
	private Integer nombreAnimateursStagiaireDisponibleMin;
	
	private Integer nombreAnimateursNonQualifiesDisponibleMax;
	private Integer nombreAnimateursNonQualifiesDisponibleMin;
	
	private Integer nombreFillesDisponibleMax;
	private Integer nombreFillesDisponibleMin;
	
	private Integer nombreGarçonsDisponibleMax;
	private Integer nombreGarçonsDisponibleMin;
	
	private Integer nombreAnimateursQualifiesEnPlusNecessaire;
	private Integer nombreAnimateursStagiaireEnPlusNecessaire;
	private Integer nombreAnimateursNonQualifiesEnPlusNecessaire;
	
	private Integer nombreFillesSouhaiteEnPlusMax;
	private Integer nombreFillesSouhaiteEnPlusMin;
	
	private Integer nombreGarçonsSouhaiteEnPlusMax;
	private Integer nombreGarçonsSouhaitEnPlusMin;
	
	private Integer nombreJeunesSouhaiteEnPlusMax;
	private Integer nombreJeunesSouhaiteEnPlusMin;

	
}
