//import packages
import javax.swing.JOptionPane;

public class FatGramLauncher {

	public static void main(String[] args) {
		
		FatGram fatgram1 = new FatGram();
		//prompt user for data
		JOptionPane.showMessageDialog(null, "Please enter the number of calories and grams of fat in a food item.");
		//set values from user input
		fatgram1.setNumCalories (Double.parseDouble(JOptionPane.showInputDialog("Number of calories: ")));
		fatgram1.setNumFatGrams (Double.parseDouble(JOptionPane.showInputDialog("Number of grams of fat: ")));
		//run methods to calculate and display results
		JOptionPane.showMessageDialog(null, "The number of calories from fat is " + fatgram1.getCaloriesFromFat());
		
		JOptionPane.showMessageDialog(null, fatgram1.getPercentCaloriesFromFat());

	}

}
