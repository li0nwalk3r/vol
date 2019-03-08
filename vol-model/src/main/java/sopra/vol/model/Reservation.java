package sopra.vol.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;
@Entity
@Table(name="reservation")
public class Reservation {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	@Column(length=50)
	private String numeroReservation;
	private boolean annulation;
	private boolean paiement;
	@Column(name="date_reservation")
	@Temporal(TemporalType.DATE)
	private Date dateReservation;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "client_id")
	private Client client;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "passager_id")
	private Passager passager;
	@Transient
	private Facturation facturation;
	@Transient
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

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}
