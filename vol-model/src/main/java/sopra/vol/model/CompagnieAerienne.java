package sopra.vol.model;

import java.util.ArrayList;
import java.util.List;

public class CompagnieAerienne {
	private Long id;
	private String nom;
	private List<CompagnieAerienneVol> vols = new ArrayList<>();

	public CompagnieAerienne() {
		super();
	}

	public CompagnieAerienne(String nom) {
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

	public List<CompagnieAerienneVol> getVols() {
		return vols;
	}

	public void setVols(List<CompagnieAerienneVol> vols) {
		this.vols = vols;
	}

}
