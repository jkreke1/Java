import java.util.Scanner;

public class Challenge14 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double numShares;
		double ppShare;
		double commission;
		double stockValue;
		double totalPaid;
		
		//accept user input
		System.out.println("Enter the number of stocks bought\n(Ex. 1000)");
		numShares = keyboard.nextDouble();
		
		System.out.println("Enter the price per share\n(Ex. 25.50)");
		ppShare = keyboard.nextDouble();
		
		//calculate values
		stockValue = numShares * ppShare;
		commission = stockValue * .02;
		totalPaid = stockValue + commission;
		
		//display results
		System.out.printf("Stock value: $%7.2f\n", stockValue);
		System.out.printf("Commission : $%8.2f\n", commission);
		System.out.printf("Total Paid : $%7.2f\n", totalPaid);
		
		keyboard.close();

	}

}
