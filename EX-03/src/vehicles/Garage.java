//Sigrist Cedric 22-120-844
//Moritz Scholz 22-122-071

package vehicles;
import myIO.Print;
import java.time.Year;

public class Garage {
	
	private static String TEST_BRAND = "UniBe";
	private static String TEST_MODEL = "42";
	
	public static void main(String[] args) {
		Car car1 = new Car("Ford","Mustang" ,Year.of(1975));
		Car car2 = new Car("Tesla", "S", Year.of(2018));
		Car car3 = new Car("Ferrari", "911", Year.of(1970));
		
		testAllFunctions(car1);
		testAllFunctions(car2);
		testAllFunctions(car3);
		
	}
	
	/** Tests all functions of a given car */
	public static void testAllFunctions(Car car) {
		System.out.println("Testing new car:");
		System.out.println(car);
		
		if(car.isAntique()) System.out.println("This car is antique");
		else System.out.println("The car is not antique");
		
		car.setVintage(Year.now().minusYears(44));
		Print.printTestResult("Test1: ", car.isAntique(), false);
		car.setVintage(Year.now().minusYears(45));
		Print.printTestResult("Test2: ", car.isAntique(), false);
		car.setVintage(Year.now().minusYears(46));
		Print.printTestResult("Test3: ", car.isAntique(), true);
		
		car.setBrand(TEST_BRAND);
		Print.printTestResult("Test4: ", car.getBrand(), TEST_BRAND);
		
		car.setModel(TEST_MODEL);
		Print.printTestResult("Test5: ", car.getModel(), TEST_MODEL);
	}
	
	
}
