import javax.swing.*;
import java.awt.*;

/**
 * @author Joe Kreke
 *
 */
public class CoffeePanel extends JPanel {

	public final double NONE = 0.0;
	public final double REGULAR_COFFEE = 1.25;
	public final double DECAF_COFFEE = 1.5;
	public final double CAPPUCCINO = 4.75;
	
	private JRadioButton none;
	private JRadioButton regularCoffee;
	private JRadioButton decafCoffee;
	private JRadioButton cappuccino;
	
	private ButtonGroup bg;
	
	/**
	 * 
	 */
	public CoffeePanel() {
		setLayout(new GridLayout(4,1));
		
		none = new JRadioButton("None");
		regularCoffee = new JRadioButton("Regular Coffee", true);
		decafCoffee = new JRadioButton("Decaf Coffee");
		cappuccino = new JRadioButton("Cappuccino");
		
		bg = new ButtonGroup();
		
		bg.add(none);
		bg.add(regularCoffee);
		bg.add(decafCoffee);
		bg.add(cappuccino);
		
		setBorder(BorderFactory.createTitledBorder("Coffee"));
		
		add(none);
		add(regularCoffee);
		add(decafCoffee);
		add(cappuccino);
	}
	
	public double getCoffeeCost(){
		double cost = 0.0;
		
		if(none.isSelected())
			cost = NONE;
		else if(regularCoffee.isSelected())
			cost = REGULAR_COFFEE;
		else if(decafCoffee.isSelected())
			cost = DECAF_COFFEE;
		else if(cappuccino.isSelected())
			cost = CAPPUCCINO;
		
		return cost;
	}

}
