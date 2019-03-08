package sopra.vol.model;

public class ClientEntreprise extends Client {
	private String siret;
	private StatutJuridique statutJuridique;
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
