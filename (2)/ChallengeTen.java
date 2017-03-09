import java.util.Scanner;

public class ChallengeTen {

	public static void main(String[] args) {
		double[] tests = new double[3];
		
		Scanner keyboard = new Scanner(System.in);
		
		//assign values to test scores
		for(int x = 0; x < 3; x++){
			int y = x + 1;
			System.out.println("Enter score for test " + y);
			tests[x] = keyboard.nextDouble();
		}
		
		//print test scores
		for(int y = 0; y < 3; y++){
			System.out.println("Test " + y + " score is " + tests[y]);
		}
		
		keyboard.close();

	}

}
