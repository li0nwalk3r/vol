package sopra.vol.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name="particulier")
public class ClientParticulier extends Client {
	@Column(length=100)
	private String prenom;
	@Enumerated(EnumType.STRING)
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
