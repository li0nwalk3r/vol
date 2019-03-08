package sopra.vol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "aeroport")

public class Aeroport {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	@Column(name = "code", length = 100)
	private String code;
	@Column(name = "nom", length = 100)
	private String nom;
	@OneToMany(mappedBy = "aeroport")
	private List<AeroportVille> aeroportsVilles = new ArrayList<AeroportVille>();

	public Aeroport() {
		super();
	}

	public Aeroport(String code, String nom) {
		super();
		this.code = code;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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
