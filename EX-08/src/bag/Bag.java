//Sigrist Cedric 22-120-844
//Moritz Scholz 22-122-071package bag;

package bag;

public class Bag {
	
	public static final String EMPTY_DISPLAY_TEXT = "EMPTY";
	
	
	boolean isEmpty = true;
	Bag next = null;
	int value = 0;	
		
	/** constructs an empty Bag */
	public Bag() {
		
	}
	/** contstructs a Bag with a value */
	public Bag(int value) {
		this.isEmpty = false;
		this.value = value;
		this.next = new Bag();
	}
	/** if 'this' is empty adds the value, else adds the value recursively to the inner bag */
	public void addValue(int value) {
		if(this.isEmpty) {
			isEmpty = false;
			this.value = value;
			this.next = new Bag();
		}
		else {
			this.next.addValue(value);
		}
	}
	/** overrides toString() */
	public String toString() {
		if(this.isEmpty) {
			return EMPTY_DISPLAY_TEXT;
		}
		else {
			return String.format("(%d,%s)", this.value, this.next);
		}
	}
	

	/** the test function given in the exercise */
	public static void main(String[] args) {
		Bag b1 = new Bag();
		System.out.println(b1);
		Bag b2 = new Bag(1);
		System.out.println(b2);
		Bag b3 = new Bag(1);
		b3.addValue(2);
		b3.addValue(3);
		System.out.println(b3);
	}
	
}
