import javax.swing.*;
import java.awt.*;

/**
 * @author Joe Kreke
 *
 */
public class InputPanel extends JPanel {

	private JTextField gallonsHeld;
	private JTextField milesDriven;
	private JLabel gallonsLabel;
	private JLabel milesLabel;
	
	/**
	 * 
	 */
	public InputPanel() {
		setLayout(new GridLayout(2, 2));
		
		gallonsHeld = new JTextField(10);
		milesDriven = new JTextField(10);
		gallonsLabel = new JLabel("Tank Size in Gallons: ");
		milesLabel = new JLabel("Miles Driven on Full Tank: ");
		
		setBorder(BorderFactory.createTitledBorder("Input Car Info"));
		
		add(gallonsLabel);
		add(gallonsHeld);
		add(milesLabel);
		add(milesDriven);
	}
	
	public double getMPG() {
		double mpg = 0.0;
		
		mpg = Double.parseDouble(milesDriven.getText()) / Double.parseDouble(gallonsHeld.getText());
		
		return mpg;
	}

}
