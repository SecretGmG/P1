//Sigrist Cedric 22-120-844
//Moritz Scholz 22-122-071
package myIO;

import java.util.Scanner;

public class Prompt {
	
	//Scanners of System.in do/should not need to be closed
	public static int PromptInt(String text) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(text);
		return scanner.nextInt();
	}
	public static double PromptDouble(String text) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(text);
		return scanner.nextDouble();
	}
	public static String PromptString(String text) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(text);
		return scanner.next();
	}	
}
