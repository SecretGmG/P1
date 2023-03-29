//Sigrist Cedric 22-120-844
//Moritz Scholz 22-122-071
package mathExercise;
import java.util.Random;
import myIO.Prompt;

public class AdditionExercise {	
	
	String question;
	int answer;
	
	public AdditionExercise(int bound) {
		Random rand = new Random();
		answer =  rand.nextInt(bound);
		//By generating the answer first and then determine a,b depending on the answer
		//we ensure that:
		//1) the answers are uniformly distributed
		//2) the answer is within the given bounds
		
		int a = rand.nextInt(answer+1); //inclusive
		int b = answer-a;
		
		question = String.format("Please calculate %d + %d",a, b);	
	}
	
	public static void main(String[] args) {
		
		AdditionExercise additionProblem = new AdditionExercise(21); //the bound is exclusive
		
		if(additionProblem.Prompt()) {
			System.out.println("Good Job!");
		}
		else {
			System.out.println(
					String.format("Wrong! The correct answer would have been %d", additionProblem.answer)
					);
		}
	}
		
	//Asks the user the question and compares it to the result of the user
	public boolean Prompt() {
		return answer == Prompt.PromptInt(question);
	}
}
