//Sigrist Cedric 22-120-844
//Moritz Scholz 22-122-071
package passwords;

import java.util.Random;
import myIO.Prompt;

public class PasswordGenerator {

	public static void main(String[] args) {
		String firstName = Prompt.PromptString("Please enter your first name:");
		String lastName = Prompt.PromptString("Please enter your last name:");
		System.out.println(
				"Here is your automatically generated Password:\n" +
				GenerateFromFullName(firstName, lastName)
			);
	}
	
	public static String GenerateFromFullName(String firstName, String lastName) {
		
		//Early return to avoid an out of bounds error
		//To keep it simple I decided to return an empty String
		//Another option would have been to:
		//generate a shorter password (ignoring the missing characters)
		//throw an error,
		//or generate a password with another procedure
		if(firstName.length() < 1 || lastName.length() < 5) {
			System.out.println("First or lastName is not long enough, an empty string was generated!");
			System.out.println("Try entering a last name at least 5 characters long");
			return "";
		}
		
		StringBuilder password = new StringBuilder();
		
		//F L1 L2 L3 L4 L5 ### -- this should be the end result
		
		//F
		password.append(firstName.charAt(0));
		
		//F L1 L2 L3 L4 L5
		password.append(lastName.substring(0,5));
		
		//F L1 L2 L3 L4 L5 ### -- we are done!
		Random rand = new Random();
		password.append(rand.nextInt(1000));
		
		return password.toString();
	}
	

}
