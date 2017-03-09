import javax.swing.JOptionPane;

public class DistanceTraveledLauncher {

	public static void main(String[] args) {
		//Local variable for speed of train
		int userInputSpeed;
		//Local variable for time spent traveling
		int userInputTime;
		
		//Run program until user selects No or Cancel
		do{
			//Accept user input for speed and time
			do{
				userInputSpeed = Integer.parseInt(JOptionPane.showInputDialog("How fast is the train moving?"));
				//Validate user input
				if(userInputSpeed <= 0){
					JOptionPane.showMessageDialog(null, "Please enter a number over 0.");
				}
			} while(userInputSpeed <= 0);
			
			do{
				userInputTime = Integer.parseInt(JOptionPane.showInputDialog("How long is the train moving?"));
				//Validate user input
				if(userInputTime <= 0){
					JOptionPane.showMessageDialog(null, "Please enter a number over 0.");
				}
			} while(userInputTime < 1);
			
			//Create new object
			DistanceTraveled distance1 = new DistanceTraveled(userInputSpeed, userInputTime);
			
			//Run method to determine distance traveled and print the output
			distance1.getDistance();
		}while(JOptionPane.showConfirmDialog(null, "Would you like to go again?") == 0);

		System.exit(0);
	}

}
