import java.util.Scanner;

public class ChallengeEight {

	public static void main(String[] args) {
		double amountOfPurchase;
		double stateTax;
		double countyTax;
		double totalTax;
		double total;
		
		Scanner keyboard = new Scanner(System.in);
		
		//accept user input
		System.out.println("What is the amount of your purchase?");
		amountOfPurchase = Double.parseDouble(keyboard.nextLine());
		
		//calculate taxes
		stateTax = amountOfPurchase * .055;
		countyTax = amountOfPurchase * .02;
		
		totalTax = stateTax + countyTax;
		
		total = totalTax + amountOfPurchase;
		
		//print values
		System.out.printf("Purchase: $%.2f\n", amountOfPurchase);
		System.out.printf("State Tax: $%.2f\n", stateTax);
		System.out.printf("County Tax: $%.2f\n", countyTax);
		System.out.printf("Total Tax: $%.2f\n", totalTax);
		System.out.printf("Total: $%.2f\n", total);
		
		keyboard.close();
	}

}
