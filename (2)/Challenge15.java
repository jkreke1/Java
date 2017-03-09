import java.util.Scanner;

public class Challenge15 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		final double COOKIES_PER_BATCH = 48;
		double sugar = 1.5;
		double butter = 1;
		double flour = 2.75;
		
		double amountRequested;
		double batchesRequired;
		
		//find requested number of cookies and required batches
		System.out.print("How many cookies do you want? >> ");
		amountRequested = keyboard.nextDouble();
		
		batchesRequired = Math.ceil(amountRequested / COOKIES_PER_BATCH);
		
		//calculate totals
		sugar *= batchesRequired;
		butter *= batchesRequired;
		flour *= batchesRequired;
		
		//display results
		System.out.printf("To bake the requested %.0f cookies, you need \n%.1f cup(s) of sugar, %.0f cup(s) of butter, and %.2f cup(s) of flour.", amountRequested, sugar, butter, flour);
		
		keyboard.close();

	}

}
