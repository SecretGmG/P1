package furniture;

public class Furniture {

	Material material;
	double pricePerHour;
	double workedHours;
	
	public Furniture(Material material, double pricePerHour, double workedHours) {
		this.material = material;
		this.pricePerHour = pricePerHour;
		this.workedHours = workedHours;
	}
	
	
	
	double calculateEffort() {
		return pricePerHour*workedHours;
	}
}
