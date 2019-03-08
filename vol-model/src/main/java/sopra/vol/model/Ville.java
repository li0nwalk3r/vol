package sopra.vol.model;

import java.util.ArrayList;
import java.util.List;

public class Ville {
	private Long id;
	private String nom;
	private List<Aeroport> aeroports = new ArrayList<>();

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

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Aeroport> getAeroports() {
		return aeroports;
	}

	public void setAeroports(List<Aeroport> aeroports) {
		this.aeroports = aeroports;
	}

}
