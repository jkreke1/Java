import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

/**
 * @author Joe Kreke
 *
 */
public class TravelExpensesGUI extends JFrame {
	
	private TravelPanel travelPanel;
	private DaysOnTrip dayPanel;
	private AirfarePanel airFarePanel;
	private CarRentalPanel carPanel;
	private MilesDrivenPanel milesPanel;
	private ParkingPanel parkingPanel;
	private TaxiPanel taxiPanel;
	private RegistrationPanel registrationPanel;
	private LodgingPanel lodgingPanel;
	private JPanel buttonPanel;
	
	private JButton calcButton;
	private JButton exitButton;

	/**
	 * 
	 */
	public TravelExpensesGUI() {
		super("Travel Expenses Calculator");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(4, 3));
		
		travelPanel = new TravelPanel();
		dayPanel = new DaysOnTrip();
		airFarePanel = new AirfarePanel();
		carPanel = new CarRentalPanel();
		milesPanel = new MilesDrivenPanel();
		parkingPanel = new ParkingPanel();
		taxiPanel = new TaxiPanel();
		registrationPanel = new RegistrationPanel();
		lodgingPanel = new LodgingPanel();
		buildPanel();
		
		add(travelPanel);
		add(dayPanel);
		add(airFarePanel);
		add(carPanel);
		add(milesPanel);
		add(parkingPanel);
		add(taxiPanel);
		add(registrationPanel);
		add(lodgingPanel);
		add(buttonPanel);
		
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
		new TravelExpensesGUI();

	}

}
