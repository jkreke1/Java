import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class AverageRainfallLauncher {

	public static void main(String[] args) {
		double numYears;
		double numMonths;
		double inchesRain = 0;
		double avgRain;
		String outMessage = "";
		
		DecimalFormat formatter = new DecimalFormat("0");
		DecimalFormat formatter2 = new DecimalFormat("0.##");
		
		do{
			numYears = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of years."));
			if(numYears < 1){
				JOptionPane.showMessageDialog(null, "Please input a number 1 or higher.");
			}
		}while(numYears < 1);
		
		numMonths = numYears * 12;
		
		for(int i = 1; i < numYears + 1; i++){
			for(int n = 1; n <= numMonths; n++){
				do{
					inchesRain += Double.parseDouble(JOptionPane.showInputDialog("Please enter the inches of rain for month " + n + " of " + formatter.format(numMonths)));
					if(inchesRain < 0){
						JOptionPane.showMessageDialog(null, "Please enter a positive number for inches of rain.");
					}
				}while(inchesRain < 0);
				if(n % 12 == 0){
					i++;
				}
			}
		}
		
		avgRain = inchesRain / numMonths;
		
		outMessage += "*******Average Rainfall*******\n" +
					  "Number of Months: " + formatter.format(numMonths) + "\n" +
					  "Inches of Rain: " + formatter.format(inchesRain) + "\n" +
					  "Average Monthly Rainfall: " + formatter2.format(avgRain) + " inches";
		JOptionPane.showMessageDialog(null, outMessage);
		
	}

}
