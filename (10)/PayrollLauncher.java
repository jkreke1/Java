/**
 * 
 */

/**
 * @author Joe Kreke
 *
 */
public class PayrollLauncher {

	/**
	 * @param args
	 * @throws InvalidPayRateException 
	 * @throws InvalidHoursException 
	 * @throws InvalidIdNumberException 
	 * @throws EmptyNameException 
	 */
	public static void main(String[] args) throws EmptyNameException, 
												  InvalidIdNumberException, 
												  InvalidHoursException, 
												  InvalidPayRateException {
		Payroll payroll1 = new Payroll("Joe", -12345, 10.25, 35);

	}

}
