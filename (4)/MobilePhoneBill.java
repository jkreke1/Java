import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class MobilePhoneBill {

	private char servicePackage;
	private double numMinutesUsed;
	public MobilePhoneBill() {
		
	}
	
	public char getServicePackage(){
		return servicePackage;
	}
	public void setServicePackage(char ServicePackage){
		this.servicePackage = ServicePackage;
	}
	
	public double getNumMinutesUsed(){
		return numMinutesUsed;
	}
	public void setNumMinutesUsed(double NumMinutesUsed){
		this.numMinutesUsed = NumMinutesUsed;
	}
	
	public void determineTotalCharges(){
		double totalCharges = 0;
		double compareTotalCharges = 0;
		double savings = 0;
		char userInput = this.getServicePackage();
		
		DecimalFormat formatter = new DecimalFormat("$###,##0.00");
		
		switch (userInput){
			case 'A':
			case 'a':
				totalCharges += 39.99;
				if(numMinutesUsed >  450){
					totalCharges += (numMinutesUsed - 450) * .45;
				}
				break;
			case 'B':
			case 'b':
				totalCharges += 59.99;
				if(numMinutesUsed >  900){
					totalCharges += (numMinutesUsed - 900) * .40;
				}
				break;
			case 'C':
			case 'c':
				totalCharges += 69.99;
				break;
		}
		JOptionPane.showMessageDialog(null, "The total charge for your plan is " + formatter.format(totalCharges));
		switch (userInput){
		case 'A':
		case 'a':
			compareTotalCharges += 59.99;
			if(numMinutesUsed > 900){
				compareTotalCharges += (numMinutesUsed - 900) * .40;
			}
			if(totalCharges > compareTotalCharges){
				savings = totalCharges - compareTotalCharges;
				JOptionPane.showMessageDialog(null, "You could save " + formatter.format(savings) + " if you switched to plan B.");
			}
			break;
		case 'B':
		case 'b':
			compareTotalCharges += 69.99;
			if(totalCharges > compareTotalCharges){
				savings = totalCharges - compareTotalCharges;
				JOptionPane.showMessageDialog(null, "You could save " + formatter.format(savings) + " if you switched to plan C.");
			}
			break;
		
		}
	}

}
