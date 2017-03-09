import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ShippingChargesLauncher {

	public static void main(String[] args) {
		 double packageWeight;
		 
		 DecimalFormat formatter = new DecimalFormat("$0.00");
		 ShippingCharges charge1 = new ShippingCharges();
		 
		 packageWeight = Double.parseDouble(JOptionPane.showInputDialog("Enter the weight of the package."));
		 charge1.setPackageWeight(packageWeight);
		 
		 JOptionPane.showMessageDialog(null, "The shipping charge for a package that is " + charge1.getPackageWeight() + 
				 " kilograms is " + formatter.format(charge1.getShippingCharges()));

	}

}
