//Sigrist Cedric 22-120-844
//Moritz Scholz 22-122-071
import java.util.Scanner;

public class TemperatureJudge {

	private static int COLD_THRESHOLD = 14;
	private static int WARM_THRESHOLD = 25;

	public static void main(String[] args) {
		double temperature = PromptDouble("Enter a temperature:");
		Judge(temperature);
	}
	
	private static double PromptDouble(String text) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(text);
		return scanner.nextDouble();
	}
	
	public static void Judge(double temperature) {
		if (temperature < COLD_THRESHOLD) {
			System.out.println("Kalt");
		}
		else if (temperature < WARM_THRESHOLD) {
			System.out.println("Angenehm");
		}
		else {
			System.out.println("Warm");
		}
	}
}
