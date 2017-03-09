import javax.swing.JOptionPane;

/**
 * @author Joe Kreke
 *
 */
public class RainfallLauncher {

	public static void main(String[] args) {
		double userInput = 0.0; //Holds user input to fill array
		double[] Months = new double[24]; //Creates new array for 12 months
		
		for(int i = 0; i < Months.length; i++){ //Loops through Months[]
			do{
				userInput = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount of rainfall for month " + (i + 1) + ": "));
				if(userInput < 0){ //Input validation
					JOptionPane.showMessageDialog(null, "Please enter a positive value.");
				}
				Months[i] = userInput; //Set current index of array equal to userInput
			}while(userInput < 0);
		}
		
		/**
		 * Call methods and print results
		 */
		JOptionPane.showMessageDialog(null, "Total Rainfall: " + Rainfall.getTotalRainFall(Months) + "\n" +
											"Average Monthly Rainfall: " + Rainfall.getAvgMonthlyRain(Months) + "\n" + 
											"Month with Most Rain: " + Rainfall.getMostRain(Months) + "\n" +
											"Month with Least Rain: " + Rainfall.getLeastRain(Months));
		

	}

}
