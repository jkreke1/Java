import javax.swing.*;
import java.awt.*;

/**
 * @author Joe Kreke
 *
 */
public class RoutinePanel extends JPanel {

	/**
	 * Set constant price rates for each of the 
	 * available services
	 */
	private final double OIL_CHANGE = 26.0;
	private final double LUBE_JOB = 18.0;
	private final double RADIATOR_FLUSH = 30.0;
	private final double TRANSMISSION_FLUSH = 80.0;
	private final double INSPECTION = 15.0;
	private final double MUFFLER_REPLACEMENT = 100.0;
	private final double TIRE_ROTATION = 20.0;
	
	/**
	 * Make checkboxes for each service
	 */
	private JCheckBox oilChange;
	private JCheckBox lubeJob;
	private JCheckBox radiatorFlush;
	private JCheckBox transmissionFlush;
	private JCheckBox inspection;
	private JCheckBox mufflerReplacement;
	private JCheckBox tireRotation;
	
	
	/**
	 * Constructor for creating the panel
	 */
	public RoutinePanel() {
		//Gridlayout to organize checkboxes in a single column
		setLayout(new GridLayout(7, 1));
		
		//Instantiating each checkbox and setting it's text description
		oilChange = new JCheckBox("Oil Change ($26.00)");
		lubeJob = new JCheckBox("Lube Job ($18.00)");
		radiatorFlush = new JCheckBox("Radiator Flush ($30.00)");
		transmissionFlush = new JCheckBox("Transmission Flush ($80.00)");
		inspection = new JCheckBox("Inspection ($15.00)");
		mufflerReplacement = new JCheckBox("Muffler Replacement ($100.00)");
		tireRotation = new JCheckBox("Tire Rotation ($20.00)");
		
		//Make a border around the checkboxes
		setBorder(BorderFactory.createTitledBorder("Routine Services"));
		
		//Add each checkbox to the panel
		add(oilChange);
		add(lubeJob);
		add(radiatorFlush);
		add(transmissionFlush);
		add(inspection);
		add(mufflerReplacement);
		add(tireRotation);
	}
	
	/**
	 * return a total value depending on
	 * which checkboxes are marked
	 * @return
	 */
	public double getServiceFees(){
		double total = 0.0;
		
		if(oilChange.isSelected())
			total += OIL_CHANGE;
		if(lubeJob.isSelected())
			total += LUBE_JOB;
		if(radiatorFlush.isSelected())
			total += RADIATOR_FLUSH;
		if(transmissionFlush.isSelected())
			total+= TRANSMISSION_FLUSH;
		if(inspection.isSelected())
			total += INSPECTION;
		if(mufflerReplacement.isSelected())
			total += MUFFLER_REPLACEMENT;
		if(tireRotation.isSelected())
			total += TIRE_ROTATION;
		
		return total;
	}

}
