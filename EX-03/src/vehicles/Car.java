//Sigrist Cedric 22-120-844
//Moritz Scholz 22-122-071
package vehicles;
//Sigrist Cedric 22-120-844
//Moritz Scholz 22-122-071

import java.time.Year;

public class Car {
	private static long YEARS_TO_BE_ANTIQUE = 45;
	
	private String brand;
	private String model;
	private Year vintage;
	
	/** Constructs a Car with a brand, model and vintage */
	public Car(String brand, String model, Year vintage) {
		this.brand = brand;
		this.model = model;
		this.vintage = vintage;
	}

	//--- Get-/Set-methods ---
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Year getVintage() {
		return vintage;
	}
	public void setVintage(Year vintage) {
		this.vintage = vintage;
	}
	
	/** Calculates if the car is antique by checking if it is older than YEARS_TO_BE_ANTIQUE */
	public boolean isAntique() {
		return vintage.isBefore(Year.now().minusYears(YEARS_TO_BE_ANTIQUE));
	}
	
	/** overrides toString() */
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", vintage=" + vintage + "]";
	}
	
	
}
