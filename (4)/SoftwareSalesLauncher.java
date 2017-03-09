import java.util.Scanner;
import java.text.DecimalFormat;

public class SoftwareSalesLauncher {

	public static void main(String[] args) {
		int numUnits;
		
		DecimalFormat formatter = new DecimalFormat("$###,##0.00");
		
		System.out.println("Enter the number of units purchased: ");
		Scanner keyboard = new Scanner(System.in);
		numUnits = keyboard.nextInt();
		keyboard.close();
		
		SoftwareSales sales1 = new SoftwareSales();
		sales1.setNumUnitsSold(numUnits);
		System.out.println("The total cost of the purchase is " + formatter.format(sales1.getTotalPrice()));

	}

}
