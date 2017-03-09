import javax.swing.*;
import java.awt.*;

/**
 * @author Joe Kreke
 *
 */
public class BagelPanel extends JPanel {

	public final double WHITE_BAGEL = 2.25;
	public final double WHEAT_BAGEL = 2.5;
	
	private JRadioButton whiteBagel;
	private JRadioButton wheatBagel;
	// radio buttons must be added to a group
	private ButtonGroup bg;
	
	/**
	 * 
	 */
	public BagelPanel() {
		setLayout(new GridLayout(2, 1));
		
		whiteBagel = new JRadioButton("White", true);
		wheatBagel = new JRadioButton("Wheat");
		
		bg = new ButtonGroup();
		
		// adding buttons to group created earlier
		bg.add(whiteBagel);
		bg.add(wheatBagel);
		
		setBorder(BorderFactory.createTitledBorder("Bagel"));
		
		// even though they were added to a group,
		// each button must be added individually
		add(whiteBagel);
		add(wheatBagel);
	}
	
	/**
	 * 
	 * @return
	 */
	public double getBagelCost(){
		double cost = 0.0;
		if(whiteBagel.isSelected())
			cost = WHITE_BAGEL;
		if(wheatBagel.isSelected())
			cost = WHEAT_BAGEL;
		return cost;
	}

}
