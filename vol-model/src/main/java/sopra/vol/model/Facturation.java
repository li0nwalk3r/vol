package sopra.vol.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

@Entity
public class Facturation {
	@Id
	private Long id;
	@Version
	private int version;
	@Column(length = 100)
	private String numeroFacturation;
	private ModeDePaiement modeDePaiement;
	@Temporal(TemporalType.DATE)
	private Date dateFacture;
	@OneToMany(mappedBy = "facturation")
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

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
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
