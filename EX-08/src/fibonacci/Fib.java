//Sigrist Cedric 22-120-844
//Moritz Scholz 22-122-071
package fibonacci;

public class Fib {
	
	/** recursively calculates the n'th fibonacci number starting at fib(0) = 0, fib(1) = 1*/
	public static long fib(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		return fib(n-1) + fib(n-2);
	}
	
	/*
	 * This function gets increasingly slower with bigger inputs
	 * this is because every call to fib calls fib TWICE.
	 * Therefore fib is called a number of times that grows exponential
	 * (probably, it might also not be exponential but something similar)
	 *  with the size of the input number.
	 *  
	 */
	
	
	/** prints the fibonacci numbers starting from zero up to the bound (exclusive the bound)*/
	public static void printFibNumbers(int bound) {
		for(int i = 0; i<bound; i++) {
			System.out.println(String.format("%3d :%d",i,fib(i)));
		}
	}
	
	public static void main(String[] args) {
		printFibNumbers(50);
	}
	
}
