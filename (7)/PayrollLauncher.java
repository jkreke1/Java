import javax.swing.JOptionPane;

/**
 * @author Joe Kreke
 *
 */
public class PayrollLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Payroll payroll = new Payroll();
		int hours = 0;
		double payRate = 0.0;
		
		//Ask the user for hours and payrate for each employee
		for(int i = 0; i < payroll.getEmployeeId().length; i++){
			hours = Integer.parseInt(JOptionPane.showInputDialog(
					"Enter the time worked for Employee ID#: " + 
					payroll.getEmployeeId()[i]));
			payRate = Double.parseDouble(JOptionPane.showInputDialog(
					"Enter the pay rate for Employee ID#: " + 
					payroll.getEmployeeId()[i]));
			payroll.setWages(payroll.getGrossPay(payroll.getEmployeeId()[i]), i);
		}
	}

}
