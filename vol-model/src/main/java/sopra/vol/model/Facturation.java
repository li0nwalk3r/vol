package sopra.vol.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Facturation {
	private Long id;
	private String numeroFacturation;
	private ModeDePaiement modeDePaiement;
	private Date dateFacture;
	private List<Reservation> reservations = new ArrayList<>();

	public Facturation() {
		super();
	}

	public Facturation(String numeroFacturation, ModeDePaiement modeDePaiement, Date dateFacture) {
		super();
		this.numeroFacturation = numeroFacturation;
		this.modeDePaiement = modeDePaiement;
		this.dateFacture = dateFacture;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroFacturation() {
		return numeroFacturation;
	}

	public void setNumeroFacturation(String numeroFacturation) {
		this.numeroFacturation = numeroFacturation;
	}

	public ModeDePaiement getModeDePaiement() {
		return modeDePaiement;
	}

	public void setModeDePaiement(ModeDePaiement modeDePaiement) {
		this.modeDePaiement = modeDePaiement;
	}

	public Date getDateFacture() {
		return dateFacture;
	}

	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

}
