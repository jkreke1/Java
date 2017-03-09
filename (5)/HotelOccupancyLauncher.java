import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class HotelOccupancyLauncher {

	public static void main(String[] args) {
		int numFloors;
		double userInput;
		double totalRooms = 0;
		double totalOccupied = 0;
		double occupancyRate;
		String outString = "";

		//Accept and verify user Input for number of floors
		do{
			numFloors = Integer.parseInt(JOptionPane.showInputDialog("How many floors does the hotel have?"));
			if(numFloors < 1){
				JOptionPane.showMessageDialog(null, "Please input a number greater than 0.");
			}
		} while (numFloors < 1);
			
			//Create array of floor objects depending on user Input
			HotelOccupancy[] floors = new HotelOccupancy[numFloors];
			
			//Instantiate array of objects
			for(int i = 0; i <= numFloors - 1; i++){
				floors[i] = new HotelOccupancy();
			}
		
		//Accept user input for number of rooms on each floor
		for(int i = 0; i <= floors.length - 1; i++){
			do{
				userInput = Double.parseDouble(JOptionPane.showInputDialog("How many rooms are in floor " + (i + 1) + "?"));
				//Verify user input
				if(userInput < 10){
					JOptionPane.showMessageDialog(null, "Please input a number 10 or higher.");
				}else {
					floors[i].setNumRooms(userInput);
					totalRooms += userInput;
				}
			}while (userInput < 10);
		}
		
		//Reset userInput
		userInput = 0;
		
		//Accept user input for number of rooms occupied on each floor
		for(int i = 0; i <= floors.length - 1; i++){
			do{
				userInput = Double.parseDouble(JOptionPane.showInputDialog("How many rooms are occupied on floor " + (i + 1) + "?"));
				//verify that number of occupied rooms is positive 
				if(userInput < 0){
					JOptionPane.showMessageDialog(null, "Please input a positive number.");
				//verify that number of occupied rooms is not greater than the number of rooms
				} else if(userInput > floors[i].getNumRooms()){
					JOptionPane.showMessageDialog(null, "Occupied rooms cannot be greater than number of rooms on a floor.");
					--i; //decrement i to set loop back one time to re-accept user input
				} else {
					floors[i].setNumOccupied(userInput);
					totalOccupied += userInput;
				}
			}while(userInput < 0);
		}
		//determine occupancy rate
		occupancyRate = totalOccupied / totalRooms;
		//Set formats
		DecimalFormat formatter1 = new DecimalFormat("%#.##");
		DecimalFormat formatter2 = new DecimalFormat("##0");
		
		//Set and display output information
		outString += "*******Hotel Information*******\n" + 
			     "Number of Rooms: " + formatter2.format(totalRooms) + "\n" + 
			     "Number of Rooms Occupied: " + formatter2.format(totalOccupied) + "\n" + 
			     "Number of Rooms Vacant: " + formatter2.format((totalRooms - totalOccupied)) + "\n" + 
			     "Occupancy Rate: " + formatter1.format(occupancyRate);
		JOptionPane.showMessageDialog(null, outString);

	}

}
