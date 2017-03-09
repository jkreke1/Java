import javax.swing.*;
import java.awt.*;

/**
 * @author Joe Kreke
 *
 */
public class ToppingPanel extends JPanel {

	public final double CREAM_CHEESE = 1.25;
	public final double BUTTER = 1.25;
	public final double PEACH_JELLY = 1.25;
	public final double BLUEBERRY_JAM = 1.25;
	
	private JCheckBox creamCheese;
	private JCheckBox butter;
	private JCheckBox peachJelly;
	private JCheckBox blueberryJam;
	
	/**
	 * 
	 */
	public ToppingPanel() {
		setLayout(new GridLayout(2, 1));
		
		creamCheese = new JCheckBox("Cream Cheese");
		butter = new JCheckBox("Butter");
		peachJelly = new JCheckBox("Peach Jelly");
		blueberryJam = new JCheckBox("Blueberry Jam");
		
		setBorder(BorderFactory.createTitledBorder("Toppings"));
		
		add(creamCheese);
		add(butter);
		add(peachJelly);
		add(blueberryJam);
	}
	
	public double getToppingCost(){
		double cost = 0.0;
		
		if(creamCheese.isSelected())
			cost += CREAM_CHEESE;
		if(butter.isSelected())
			cost += BUTTER;
		if(peachJelly.isSelected())
			cost += PEACH_JELLY;
		if(blueberryJam.isSelected())
			cost += BLUEBERRY_JAM;
		
		return cost;
	}

}
