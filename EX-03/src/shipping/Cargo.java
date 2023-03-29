//Sigrist Cedric 22-120-844
//Moritz Scholz 22-122-071

package shipping;

public class Cargo {
	private String name;
	private double width;
	private double length;
	private double height;
	
	public Cargo(String name, double width, double length, double height) {
		this.name = name;
		this.width = width;
		this.length = length;
		this.height = height;
	}
	public Cargo(String name) {
		this(name, 1, 1, 1);
	}

	//--- Get-/Set-methods ---
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	/** overrides toString() */
	public String toString() {
		return "Cargo [name=" + name + ", width=" + width + ", length=" + length + ", height=" + height + "]";
	}	
}
