package sopra.vol.model;

public class ClientParticulier extends Client {
	private String prenom;
	private Civilite civilite;

	public ClientParticulier() {
		super();
	}

	public ClientParticulier(String nom, String prenom, Civilite civilite) {
		super(nom);
		this.prenom = prenom;
		this.civilite = civilite;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Civilite getCivilite() {
		return civilite;
	}

	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}

}
