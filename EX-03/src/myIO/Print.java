//Sigrist Cedric 22-120-844
//Moritz Scholz 22-122-071

package myIO;

/** Simple static class to Print stuff to the user */
public class Print {
	private static double DEFAULT_TOLERANCE = 0.000001;
	
	/** Prints a Test result */
	public static void printTestResult(String test,  Object result, Object expected) {
		System.out.println(test + (result==expected ? "Passed" : "Failed"));
	}
	/** Prints a Test result of a double with the default tolerance or no tolerance
	 * @param approximate if this parameter is true The test if the numbers are approximately equal
	 */
	public static void printTestResult(String test, double result, double expected, boolean approximate) {
		printTestResult(test, result, expected, approximate ? DEFAULT_TOLERANCE : 0);
	}
	/** Prints a Test result of a double with a given tolerance */
	public static void printTestResult(String test, double result, double expected, double tolerance) {
		System.out.println(test + (isApproxEqual(result,expected, tolerance) ? "Passed" : "Failed"));
	}
	/** Checks if two doubles are approximately equal */ 
	private static boolean isApproxEqual(double val1, double val2, double tolerance) {
		return Math.abs(val1-val2)<=tolerance;
	}
}
