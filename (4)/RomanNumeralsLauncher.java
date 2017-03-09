import java.util.Scanner;

public class RomanNumeralsLauncher {

	public static void main(String[] args) {
		int userNumInput;
		
		Scanner keyboard = new Scanner(System.in);
		RomanNumerals num1 = new RomanNumerals();
		
		System.out.println("Input a number 1-10 to find the Roman numeral equivalent");
		userNumInput = keyboard.nextInt();
		num1.setUserInput(userNumInput);
		num1.setRomanNumeral(userNumInput);
		num1.getRomanNumeralStatement();
		
		
		
		keyboard.close();

	}

}
