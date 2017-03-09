import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * @author Joe Kreke
 *
 */
public class Sales {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		double userInputDouble;
		double totalSales = 0.0;
		
		PrintWriter output = new PrintWriter("WeeklySales.txt");
		DecimalFormat formatter = new DecimalFormat("$###,##0.00");
		
		for(int i = 0; i < 5; i++){
			do{
				userInputDouble = Double.parseDouble(JOptionPane.showInputDialog("Input the daily sales value: "));
				if(userInputDouble < 0){
					JOptionPane.showMessageDialog(null, "Please input a positive value.");
				}
			}while(userInputDouble < 0);
			output.println("Sales Day " + (i + 1) + ": " + formatter.format(userInputDouble));
			totalSales += userInputDouble;
		}
		output.println("Total Sales: " + formatter.format(totalSales));
		
		output.close();

	}

}
