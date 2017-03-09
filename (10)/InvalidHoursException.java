/**
 * 
 */

/**
 * @author Joe Kreke
 *
 */
public class InvalidHoursException extends Exception {

	/**
	 * 
	 */
	public InvalidHoursException() {
		super("Number of hours worked cannot be negative or greater than 84");
	}

}
