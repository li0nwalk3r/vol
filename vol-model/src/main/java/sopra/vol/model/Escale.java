package sopra.vol.model;

import java.util.Date;

public class Escale {
	private Long id;
	private Vol vol;
	private Aeroport aeroport;
	private Date dateArrivee;
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
