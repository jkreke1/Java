import javax.swing.JOptionPane;

/**
 * @author Joe Kreke
 *
 */
public class CoinFlipGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numPlayers; 		//Stores number of players
		int userChoice; 		//Stores user choice of heads or tails in 1 or 0
		String playerName; 		//Stores player input name
		String playerGuess;		//Stores user choice of heads or tails in String
		String outString = ""; 	//Will store ending scores
		boolean winner = false;
		String[] options = {"Heads", "Tails"};
		
		do{
			numPlayers = Integer.parseInt(JOptionPane.showInputDialog("How many players?"));
			if(numPlayers < 2){
				JOptionPane.showMessageDialog(null, "Game is intended for 2 or more players.");
			}
		}while(numPlayers < 2);
		
		Player[] players = new Player[numPlayers];
		
		for(int i = 0; i < numPlayers; i++){
			players[i] = new Player();
			playerName = JOptionPane.showInputDialog("Player " + (i + 1) + " Name: ");
			players[i].setName(playerName);
		}
		
		do{
			for(int i = 0; i < numPlayers; i++){
				userChoice = JOptionPane.showOptionDialog(null, players[i].getName() + ", choose Heads or Tails",
															"Coin Flip",
															JOptionPane.DEFAULT_OPTION,
															JOptionPane.INFORMATION_MESSAGE,
															null, options, options[0]);
				if(userChoice == 0){
					playerGuess = "Heads";
				} else {
					playerGuess = "Tails";
				}
				
				players[i].setGuess(playerGuess);
			}
			
			Coin coinFlip = new Coin();
			for(int i = 0; i < numPlayers; i++){
				if(players[i].getGuess() == coinFlip.getSideUp()){
					players[i].addPoint();
					JOptionPane.showMessageDialog(null, players[i].getName() + " earned a point!");
				}
			}
			
			for(int i = 0; i < numPlayers; i++){
				if(players[i].getPoints() == 5){
					winner = true;
				}
			}
		} while(winner == false);
		
		JOptionPane.showMessageDialog(null, "*************\n" +
											"Game Over\n" + 
											"*************\n" +
											"Displaying Scores...");
		
		for(int i = 0; i < numPlayers; i++){
			outString += players[i].getName() + "'s Score: " + players[i].getPoints();
			if(players[i].getPoints() == 5){
				outString += "  ** Winner! **\n";
			} else {
				outString += "\n";
			}
		}
		
		JOptionPane.showMessageDialog(null, outString);

	}

}
