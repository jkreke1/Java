
/**
 * @author Joe Kreke
 *
 */
public class Player {

	String guess;
	String name;
	int points;
	
	/**
	 * Default constructor sets values;
	 */
	public Player() {
		guess = "";
		points = 0;
	}

	/**
	 * @return the guess
	 */
	public String getGuess() {
		return guess;
	}

	/**
	 * @param guess the guess to set
	 */
	public void setGuess(String guess) {
		this.guess = guess;
	}

	/**
	 * @return the points
	 */
	public int getPoints() {
		return points;
	}

	/**
	 * Add points to winning player
	 */
	public void addPoint() {
		this.points += 1;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
