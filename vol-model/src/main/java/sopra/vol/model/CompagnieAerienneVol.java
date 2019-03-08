package sopra.vol.model;

public class CompagnieAerienneVol {
	private Long id;
	private CompagnieAerienne compagnieAerienne;
	private Vol vol;
	private String numero;

	public CompagnieAerienneVol() {
		super();
	}

	public CompagnieAerienneVol(CompagnieAerienne compagnieAerienne, Vol vol) {
		super();
		this.compagnieAerienne = compagnieAerienne;
		this.vol = vol;
	}

	public CompagnieAerienneVol(CompagnieAerienne compagnieAerienne, Vol vol, String numero) {
		super();
		this.compagnieAerienne = compagnieAerienne;
		this.vol = vol;
		this.numero = numero;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CompagnieAerienne getCompagnieAerienne() {
		return compagnieAerienne;
	}

	public void setCompagnieAerienne(CompagnieAerienne compagnieAerienne) {
		this.compagnieAerienne = compagnieAerienne;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
