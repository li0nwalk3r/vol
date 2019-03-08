package sopra.vol.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Passager {
	private Long id;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String numeroPasseport;
	private Adresse adresse;
	private List<Reservation> reservations = new ArrayList<>();

	public Passager() {
		super();
	}

	public Passager(String nom, String prenom, Date dateNaissance, String numeroPasseport) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.numeroPasseport = numeroPasseport;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getNumeroPasseport() {
		return numeroPasseport;
	}

	public void setNumeroPasseport(String numeroPasseport) {
		this.numeroPasseport = numeroPasseport;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

}
