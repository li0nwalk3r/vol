package sopra.vol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Ville {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	@Column(name = "nom", length = 100)
	private String nom;
	@OneToMany(mappedBy = "ville")
	private List<AeroportVille> aeroportsVilles = new ArrayList<AeroportVille>();

	public Ville() {
		super();
	}

	public Ville(String nom) {
		super();
		this.nom = nom;
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

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<AeroportVille> getAeroportsVilles() {
		return aeroportsVilles;
	}

	public void setAeroportsVilles(List<AeroportVille> aeroportsVilles) {
		this.aeroportsVilles = aeroportsVilles;
	}

}
