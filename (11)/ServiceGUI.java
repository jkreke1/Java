import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

/**
 * @author Joe Kreke
 *
 */
public class ServiceGUI extends JFrame {

	private RoutinePanel routinePanel;
	private NonroutinePanel nonroutinePanel;
	private JPanel buttonPanel;
	private JButton calcButton;
	private JButton exitButton;
	
	/**
	 * 
	 */
	public ServiceGUI() {
		super("Joe's Automotive Services");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		routinePanel = new RoutinePanel();
		nonroutinePanel = new NonroutinePanel();
		buildPanel();
		
		add(routinePanel, BorderLayout.NORTH);
		add(nonroutinePanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);

	}
	
	public void buildPanel(){
		buttonPanel = new JPanel();
		calcButton = new JButton("Calculate Charges");
		exitButton = new JButton("Exit");
		
		calcButton.addActionListener(new calcButtonListener());
		exitButton.addActionListener(new exitButtonListener());
		buttonPanel.add(calcButton);
		buttonPanel.add(exitButton);
	}
	
	private class calcButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			double total;
			
			total = routinePanel.getServiceFees() + 
					nonroutinePanel.getServiceFees();
			
			DecimalFormat formatter = new DecimalFormat("$###,##0.00");
			
			JOptionPane.showMessageDialog(null, "Total Charges: " +
										  formatter.format(total) + "\n");
			
			
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
		new ServiceGUI();

	}

}
