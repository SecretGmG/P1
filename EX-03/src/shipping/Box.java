//Sigrist Cedric 22-120-844
//Moritz Scholz 22-122-071

package shipping;

public class Box {
	
	private double width;
	private double length;
	private double height;
	private boolean full;
	private Cargo cargo;

	/** Constructs an empty box with the given dimensions */
	public Box(double width, double length, double height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	/** Constructs an empty box with dimensions (1/1/1) */
	public Box(){
		this(1,1,1);
	}
	
	/** Calculates the Volume of a Box */
	public double getCapacity() {
		return width*length*height;
	}
	
	/** Checks if a given cargo would fit in the Box */
	public boolean fits(Cargo cargo) {
		return 
				cargo.getWidth()  < width  && 
				cargo.getHeight() < height && 
				cargo.getLength() < length;
	}
	
	/** tries to add a given cargo
	 *  returns false if the box is already full or the cargo does not fit
	 *  in these cases the box remains unchanged
	 */
	public boolean addCargo(Cargo cargo){
		if(full) return false;
		if(fits(cargo)) return false;
		
		this.cargo = cargo;
		full = true;
		
		return true;
	}
	
	/** overrides toString() */
	public String toString() {
		return "Box [width=" + width + ", length=" + length + ", height=" + height + ", full=" + full + ", cargo="
				+ cargo + "]";
	}
}
