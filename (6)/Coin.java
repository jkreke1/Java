import java.util.Random;

/**
 * @author ShadowRun300
 *
 */

public class Coin {

	private String sideUp;
	/**
	 * No-arg constructor to call toss()
	 */
	public Coin() {
		this.toss();
	}
	
	/**
	 * Toss method
	 */
	public void toss(){
		Random randomNumbers = new Random();
		int number = randomNumbers.nextInt(2);
		if(number == 0){
			this.sideUp = "Heads";
		} else if(number == 1){
			this.sideUp = "Tails";
		}
	}
	
	/**
	 * Method to return the sideUp value
	 */
	public String getSideUp(){
		return sideUp;
	}

}
