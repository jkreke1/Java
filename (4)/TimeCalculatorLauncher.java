import java.util.Scanner;

public class TimeCalculatorLauncher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double userInput;
		TimeCalculator time1 = new TimeCalculator();
		
		System.out.println("Enter a number of seconds:");
		userInput = keyboard.nextDouble();
		
		time1.setUserInputSeconds(userInput);
		time1.printMinutes();
		
		keyboard.close();

	}

}
