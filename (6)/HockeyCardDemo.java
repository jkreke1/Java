import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class HockeyCardDemo {

	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "C:\\users\\shadowrun300\\desktop\\hockey_card_collection.txt";
		String userInputString;
		double userInputDouble = -1;
		
		PrintWriter output = new PrintWriter(fileName);
		
		for(int i = 0; i < 3; i++){
			//ask for hockey card info
			HockeyCard card = new HockeyCard();
			userInputString = JOptionPane.showInputDialog("Enter a player name.");
			card.setName(userInputString);
			userInputString = JOptionPane.showInputDialog("Enter a team name.");
			card.setTeam(userInputString);
			while(userInputDouble < 0){
				userInputDouble = Double.parseDouble(JOptionPane.showInputDialog("Enter the card value."));
				if(userInputDouble < 0){
					JOptionPane.showConfirmDialog(null, "Please enter a value greater than 0");
				}
				card.setValue(userInputDouble);
			}
			HockeyCardCollection collection = new HockeyCardCollection(card);
			JOptionPane.showMessageDialog(null, collection);
			output.println(collection);
		}
		
		output.close();

	}

}
