import javax.swing.*;
import java.awt.*;

/**
 * @author Joe Kreke
 *
 */
public class RatePanel extends JPanel {

	public final double DAYTIME = 0.07;
	public final double EVENING = 0.12;
	public final double OFF_PEAK = 0.05;
	
	private JRadioButton daytime;
	private JRadioButton evening;
	private JRadioButton offPeak;
	
	private ButtonGroup bg;
	
	/**
	 * 
	 */
	public RatePanel() {
		daytime = new JRadioButton("Daytime", true);
		evening = new JRadioButton("Evening");
		offPeak = new JRadioButton("Off-Peak");
		
		bg = new ButtonGroup();
		
		bg.add(daytime);
		bg.add(evening);
		bg.add(offPeak);
		
		setBorder(BorderFactory.createTitledBorder("Rate Category"));
		
		add(daytime);
		add(evening);
		add(offPeak);
		
	}
	
	public double getRate() {
		double rate = 0.0;
		
		if(daytime.isSelected())
			rate = DAYTIME;
		if(evening.isSelected())
			rate = EVENING;
		if(offPeak.isSelected())
			rate = OFF_PEAK;
		
		return rate;
	}

}
