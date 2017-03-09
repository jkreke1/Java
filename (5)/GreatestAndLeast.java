import javax.swing.JOptionPane;

public class GreatestAndLeast {

	public static void main(String[] args) {
		int greatestNumber = 0;
		int lowestNumber = 0;
		int userInput;
		int QUIT = -99;
		String outMessage = "";
		
		JOptionPane.showMessageDialog(null, "Enter a series of positive integers.\n Enter \"-99\" to quit.");
		
		do{
			userInput = Integer.parseInt(JOptionPane.showInputDialog("Please enter a positive integer."));
			if(userInput < 1 && userInput != QUIT){
				JOptionPane.showMessageDialog(null, "Please enter a number greater than 0.");
				continue;
			}
			if(userInput > greatestNumber){
				greatestNumber = userInput;
			}
			if(userInput < lowestNumber && userInput != QUIT){
				lowestNumber = userInput;
			}
		}while(userInput != QUIT);
		
		outMessage += "The greatest number entered is: " + greatestNumber + "\n" +
					  "The lowest number entered is: " + lowestNumber;
		
		JOptionPane.showMessageDialog(null, outMessage);

	}

}
