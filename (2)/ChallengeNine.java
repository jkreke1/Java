import java.util.Scanner;

public class ChallengeNine {

	public static void main(String[] args) {
		double milesDriven;
		double gallonsUsed;
		double mpg;
		
		Scanner keyboard = new Scanner(System.in);
		
		//accept user input
		System.out.println("How many miles did you drive?");
		milesDriven = Double.parseDouble(keyboard.nextLine());
		
		System.out.println("How many gallons did you use?");
		gallonsUsed = Double.parseDouble(keyboard.nextLine());
		
		//calculation
		mpg = milesDriven / gallonsUsed;
		
		//display information
		System.out.printf("Your car gets %.2f mpg.", mpg);
		
		keyboard.close();

	}

}
