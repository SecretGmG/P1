//Sigrist Cedric 22-120-844
//Moritz Scholz 22-122-071
import java.util.Scanner;

public class UselessFormula {

	public static void main(String[] args) {
		int a = PromptInt("Enter an Integer a:");
		int b = PromptInt("Enter an Integer b:");
		
		PrintCalculations(a,b);
	}
	
	public static void PrintCalculations(int a, int b) {
		//Early return if b==0 to avoid a division by zero
		if(b == 0) {
			System.out.println("Calculation was stopped to avoid a division by zero!");
			return;
		}
		
		System.out.println(
				String.format("a^2/b is ~= %.4f", (double)a*a/b)
				);
		System.out.println(
				String.format("now with integers: %d R %d", (a*a)/b, (a*a)%b)
				);
	}
	private static int PromptInt(String text) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(text);
		return scanner.nextInt();
		
	}
}
