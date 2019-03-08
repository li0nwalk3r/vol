package sopra.vol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

@Entity
@Table(name="aeroport")

public class Aeroport {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	@Column(name="code", length=100)
	private String code;
	@Column(name="nom", length=100)
	private String nom;
	@Transient
	private List<Ville> villes = new ArrayList<>();

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

	public List<Ville> getVilles() {
		return villes;
	}

	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}

}
