import java.io.*;
import javax.swing.JOptionPane;

public class DistanceFileLauncher {
	public static void main(String[] args) throws IOException {
		//Local variable for speed of train
		int userInputSpeed;
		//Local variable for time spent traveling
		int userInputTime;
		
		//Run program until user selects No or Cancel
		do{
			//Accept user input for speed and time
			do{
				userInputSpeed = Integer.parseInt(JOptionPane.showInputDialog("How fast is the train moving?"));
				if(userInputSpeed <= 0){
					JOptionPane.showMessageDialog(null, "Please enter a number over 0.");
				}
			} while(userInputSpeed <= 0);
			
			do{
				userInputTime = Integer.parseInt(JOptionPane.showInputDialog("How long is the train moving?"));
				if(userInputTime <= 0){
					JOptionPane.showMessageDialog(null, "Please enter a number over 0.");
				}
			} while(userInputTime < 1);
			
			//Create new object
			DistanceFile distance1 = new DistanceFile(userInputSpeed, userInputTime);
			
			//Run method to determine distance traveled and print the output
			distance1.getDistance();
		}while(JOptionPane.showConfirmDialog(null, "Would you like to go again?") == 0);

		System.exit(0);
	}
}
