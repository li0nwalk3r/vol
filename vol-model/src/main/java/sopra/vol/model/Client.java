package sopra.vol.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Client {
	private Long id;
	private String nom;
	private Adresse adressse;
	private List<Reservation> reservations = new ArrayList<>();

	public Client() {
		super();
	}

	public Client(String nom) {
		super();
		this.nom = nom;
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

	public Adresse getAdressse() {
		return adressse;
	}

	public void setAdressse(Adresse adressse) {
		this.adressse = adressse;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

}
