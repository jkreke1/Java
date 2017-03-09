import javax.swing.*;
import java.awt.*;

/**
 * @author Joe Kreke
 *
 */
public class NonroutinePanel extends JPanel {

	//Set constant rate for each labor hour
	private final double LABOR = 20.0;
	
	private JLabel partsCharges;	// cost of parts
	private JLabel laborHours;		// number of labor hours
	private JTextField partsText;	// description of partsCharges
	private JTextField laborText;	// description of laborHours
	
	/**
	 * Constructor
	 */
	public NonroutinePanel() {
		setLayout(new GridLayout(2, 1));
		
		partsCharges = new JLabel("Parts Charges: ");
		laborHours = new JLabel("Hours of Labor: ");
		partsText = new JTextField(10);
		laborText = new JTextField(10);
		
		// Create border around user input area
		setBorder(BorderFactory.createTitledBorder("Nonroutine Services"));
		
		// Add text boxes and descriptions to the panel
		add(partsCharges);
		add(partsText);
		add(laborHours);
		add(laborText);
	}
	
	/**
	 * returns a value based on how much the parts cost
	 * and how many hours were worked
	 * @return
	 */
	public double getServiceFees() {
		double total = 0.0;
		
		total += Double.parseDouble(partsText.getText());
		
		total += (LABOR * Double.parseDouble(laborText.getText()));
		
		return total;
	}

}
