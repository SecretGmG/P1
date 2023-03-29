package furniture;

public enum Material {
	
	Eiche(150),
	Buche(170),
	Esche(100);
	
	public final double materialCost;
	
	private Material(double materialCost) {
		this.materialCost = materialCost;
	}
}
