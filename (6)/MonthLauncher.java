import javax.swing.JOptionPane;

public class MonthLauncher {

	public static void main(String[] args) {
		String userInput;
		
		userInput = JOptionPane.showInputDialog("Enter the number or name of a month.");
		
		Month month1 = new Month(userInput);
		
		userInput = JOptionPane.showInputDialog("Enter the number or name of a month.");
		
		Month month2 = new Month(userInput);
		
		JOptionPane.showMessageDialog(null, "Months are equal: " + month1.equals(month2) + "\n" + 
											"Month 1 is greater: " + month1.greaterThan(month2) + "\n" + 
											"Month 1 is less: " + month1.lessThan(month2));
		System.exit(0);

	}

}
