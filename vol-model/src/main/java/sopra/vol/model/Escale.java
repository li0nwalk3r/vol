package sopra.vol.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

@Entity
public class Escale {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn
	private Vol vol;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "aeroport_id")
	private Aeroport aeroport;
	@Temporal(TemporalType.DATE)
	@Column(name = "arrival_date")
	private Date dateArrivee;
	@Temporal(TemporalType.DATE)
	@Column(name = "start_date")
	private Date dateDepart;

	public Escale() {
		super();
	}

	public Escale(Vol vol, Aeroport aeroport) {
		super();
		this.vol = vol;
		this.aeroport = aeroport;
	}

	public Escale(Vol vol, Aeroport aeroport, Date dateArrivee, Date dateDepart) {
		super();
		this.vol = vol;
		this.aeroport = aeroport;
		this.dateArrivee = dateArrivee;
		this.dateDepart = dateDepart;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	public Aeroport getAeroport() {
		return aeroport;
	}

	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}

	public Date getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

}
