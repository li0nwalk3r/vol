package sopra.vol.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "entreprise")
public class ClientEntreprise extends Client {
	@Column(length=50)
	private String siret;
	@Enumerated(EnumType.STRING)
	private StatutJuridique statutJuridique;
	@Column(length=50)
	private String numeroTva;

	public ClientEntreprise() {
		super();
	}

	public ClientEntreprise(String nom, String siret, StatutJuridique statutJuridique, String numeroTva) {
		super(nom);
		this.siret = siret;
		this.statutJuridique = statutJuridique;
		this.numeroTva = numeroTva;
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public StatutJuridique getStatutJuridique() {
		return statutJuridique;
	}

	public void setStatutJuridique(StatutJuridique statutJuridique) {
		this.statutJuridique = statutJuridique;
	}

	public String getNumeroTva() {
		return numeroTva;
	}

	public void setNumeroTva(String numeroTva) {
		this.numeroTva = numeroTva;
	}

}
