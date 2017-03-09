import javax.swing.JOptionPane;

public class MobilePhoneBillLauncher {

	public static void main(String[] args) {
		double userInputMinutes;
		char userInputServicePlan;
		
		MobilePhoneBill mobile1 = new MobilePhoneBill();
		
		userInputServicePlan = JOptionPane.showInputDialog(null, "Please enter your service plan(A, B, or C):").charAt(0);
		userInputMinutes = Double.parseDouble(JOptionPane.showInputDialog("Please enter the number of minutes used: "));
		
		mobile1.setServicePackage(userInputServicePlan);
		mobile1.setNumMinutesUsed(userInputMinutes);
		mobile1.determineTotalCharges();

	}

}
