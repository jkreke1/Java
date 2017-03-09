import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

/**
 * @author Joe Kreke
 *
 */
public class LongDistanceGUI extends JFrame {

	private RatePanel rate;
	private TimePanel time;
	private JPanel buttonPanel;
	private JButton calcButton;
	private JButton exitButton;
	
	/**
	 * 
	 */
	public LongDistanceGUI() {
		super("Long Distance Calls");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		rate = new RatePanel();
		time = new TimePanel();
		buildPanel();
		
		add(rate, BorderLayout.NORTH);
		add(time, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	}
	
	public void buildPanel(){
		buttonPanel = new JPanel();
		calcButton = new JButton("Calculate");
		exitButton = new JButton("Exit");
		
		calcButton.addActionListener(new calcButtonListener());
		exitButton.addActionListener(new exitButtonListener());
		buttonPanel.add(calcButton);
		buttonPanel.add(exitButton);
	}
	
	private class calcButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			double charge = 0.0;
			double callRate = rate.getRate();
			double callLength = time.getLength();
			
			charge = callRate * callLength;
			
			DecimalFormat formatter = new DecimalFormat("$###,##0.00");
			
			JOptionPane.showMessageDialog(null, "Charge for call is: " + formatter.format(charge));
		}
		
	}
	
	private class exitButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new LongDistanceGUI();

	}

}
