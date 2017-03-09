import javax.swing.JOptionPane;

public class LandTractLauncher {

	public static void main(String[] args) {
		double length; //Hold user input for length
		double width;  //Hold user input for width
		
		do{
			length = Double.parseDouble(JOptionPane.showInputDialog("Enter a number for length")); //User input for length
			if(length <= 0){ //Input validation
				JOptionPane.showMessageDialog(null, "Please enter a number greater than 0");
			}
		}while(length <= 0);
		do{
			width = Double.parseDouble(JOptionPane.showInputDialog("Enter a number for width")); //User input for width
			if(width <= 0){ //Input validation
				JOptionPane.showMessageDialog(null, "Please enter a number greater than 0");
			}
		}while(width <= 0);
		
		LandTract tract1 = new LandTract(length, width); //instance of first landTract
		
		do{
			length = Double.parseDouble(JOptionPane.showInputDialog("Enter a number for length")); //User input for length
			if(length <= 0){ //Input validation
				JOptionPane.showMessageDialog(null, "Please enter a number greater than 0");
			}
		}while(length <= 0);
		do{
			width = Double.parseDouble(JOptionPane.showInputDialog("Enter a number for width")); //User input for width
			if(width <= 0){ //Input validation
				JOptionPane.showMessageDialog(null, "Please enter a number greater than 0");
			}
		}while(width <= 0);
		
		LandTract tract2 = new LandTract(length, width); //instance of second landTract
		
		if(tract1.equals(tract2)){ //Determine if areas of two tracts are equal
			JOptionPane.showMessageDialog(null, "The two tracts of land have the same area.");
		} else {
			JOptionPane.showMessageDialog(null, "The two tracts of land do not have the same area.");
		}
		
		System.exit(0);

	}

}
