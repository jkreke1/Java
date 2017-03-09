/**
 * 
 */

/**
 * @author Joe Kreke
 *
 */
public class InvalidPayRateException extends Exception {

	/**
	 * 
	 */
	public InvalidPayRateException() {
		super("Pay rate cannot be negative or greater than 25");
	}

}
