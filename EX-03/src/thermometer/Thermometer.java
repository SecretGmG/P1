//Sigrist Cedric 22-120-844
//Moritz Scholz 22-122-071
package thermometer;

public class Thermometer {
	public static double DEFAULT_TEMPERATURE = 37.0;
	public static double INCREASE_AMOUNT = 0.1;
	
	private double temperature;
	
	/** Constructs a Thermometer initialized to the DEFAULT_TEMPERATURE */
	public Thermometer() {
		temperature = DEFAULT_TEMPERATURE;
	}

	//--- Get-/Set-methods ---
	public double getTemperature() {
		return temperature;
	}
	
	/** increases the temperature by INCREASE_AMOUNT */
	public void increase() {
		temperature += INCREASE_AMOUNT;
	}
	/** resets the temperature to DEFAULT_TEMPERATURE */
	public void reset() {
		temperature = DEFAULT_TEMPERATURE;
	}
	
	/** overrides toString() */
	public String toString() {
		return String.format("Thermometer [temperature=%.1f]", temperature);
	}
	
}
