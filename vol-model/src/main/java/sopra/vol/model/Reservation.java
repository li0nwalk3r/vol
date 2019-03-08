package sopra.vol.model;

import java.util.Date;

public class Reservation {
	private Long id;
	private String numeroReservation;
	private boolean annulation;
	private boolean paiement;
	private Date dateReservation;
	private Client client;
	private Passager passager;
	private Facturation facturation;
	private Vol vol;

	public Reservation() {
		super();
	}

	public Reservation(String numeroReservation, boolean annulation, boolean paiement, Date dateReservation) {
		super();
		this.numeroReservation = numeroReservation;
		this.annulation = annulation;
		this.paiement = paiement;
		this.dateReservation = dateReservation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroReservation() {
		return numeroReservation;
	}

	public void setNumeroReservation(String numeroReservation) {
		this.numeroReservation = numeroReservation;
	}

	public boolean isAnnulation() {
		return annulation;
	}

	public void setAnnulation(boolean annulation) {
		this.annulation = annulation;
	}

	public boolean isPaiement() {
		return paiement;
	}

	public void setPaiement(boolean paiement) {
		this.paiement = paiement;
	}

	public Date getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Passager getPassager() {
		return passager;
	}

	public void setPassager(Passager passager) {
		this.passager = passager;
	}

	public Facturation getFacturation() {
		return facturation;
	}

	public void setFacturation(Facturation facturation) {
		this.facturation = facturation;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

}
