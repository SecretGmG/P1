//Sigrist Cedric 22-120-844
//Moritz Scholz 22-122-071

package shipping;

public class BoxTest {
	
	
	
	public static void main(String[] args) {
		
		Box box1 = new Box();
		Box box2 = new Box(3,4,5);
		Box box3 = new Box(6,7,8);
		
		Cargo hammer = new Cargo("Hammer");
		Cargo saw = new Cargo("Saw", 5,1,1);
		Cargo helmet = new Cargo("Helmet", 5,5,5);
		Cargo printer = new Cargo("Printer", 6,7,8);
		
		box1.addCargo(hammer);
		
		tryFillBox("Testing box 1", box1, saw);
		tryFillBox("Testing box 2", box2, printer);
		tryFillBox("Testing box 2 again", box2, helmet);
		tryFillBox("Testing box 3", box3, printer);				
	}
	
	public static void tryFillBox(String text, Box box, Cargo cargo) {
		System.out.println(text);
		System.out.println(box);
		System.out.println(cargo);
		
		if(box.addCargo(cargo)) {
			System.out.println("The cargo was succesfully added");
		}
		else{
			System.out.println("The cargo was not added");
		}
		
		
		System.out.println(box);
		
		
	}
	
}
