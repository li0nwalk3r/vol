package sopra.vol.model;

public enum Civilite {
	M("Monsieur"), MME("Madame"), MLLE("Mademoiselle");

	private final String label;

	private Civilite(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
