package sopra.vol.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vol {
	private Long id;
	private boolean ouvert;
	private Date dateDepart;
	private Date dateArrivee;
	private Float tarif;
	private List<Reservation> reservations = new ArrayList<>();
	private Aeroport depart;
	private Aeroport arrivee;
	private List<Escale> escales = new ArrayList<>();
	private List<CompagnieAerienneVol> compagnieAeriennes = new ArrayList<>();

	public Vol() {
		super();
	}

	public Vol(boolean ouvert, Date dateDepart, Date dateArrivee, Float tarif) {
		super();
		this.ouvert = ouvert;
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
		this.tarif = tarif;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isOuvert() {
		return ouvert;
	}

	public void setOuvert(boolean ouvert) {
		this.ouvert = ouvert;
	}

	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public Date getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public Float getTarif() {
		return tarif;
	}

	public void setTarif(Float tarif) {
		this.tarif = tarif;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public Aeroport getDepart() {
		return depart;
	}

	public void setDepart(Aeroport depart) {
		this.depart = depart;
	}

	public Aeroport getArrivee() {
		return arrivee;
	}

	public void setArrivee(Aeroport arrivee) {
		this.arrivee = arrivee;
	}

	public List<Escale> getEscales() {
		return escales;
	}

	public void setEscales(List<Escale> escales) {
		this.escales = escales;
	}

	public List<CompagnieAerienneVol> getCompagnieAeriennes() {
		return compagnieAeriennes;
	}

	public void setCompagnieAeriennes(List<CompagnieAerienneVol> compagnieAeriennes) {
		this.compagnieAeriennes = compagnieAeriennes;
	}

}
