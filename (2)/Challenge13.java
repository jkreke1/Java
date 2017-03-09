import java.util.Scanner;

public class Challenge13 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//assigning and calculating totals
		System.out.print("Enter the cost of the meal >> ");
		
		double mealCharge = keyboard.nextDouble();
		double tax = mealCharge * .075;
		double total = mealCharge + tax;
		double tip = total * .18;
		double fullTotal = total + tip;
		
		//printing results
		System.out.printf("Meal Charge: %9.2f \n", mealCharge);
		System.out.printf("Tax Amount: %10.2f \n", tax);
		System.out.printf("Tip Amount: %10.2f \n", tip);
		System.out.printf("Meal Total: %10.2f \n", fullTotal);
		
		keyboard.close();

	}

}
