import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

/**
 * @author Joe Kreke
 *
 */
public class OrderGUI extends JFrame {

	private GreetingPanel greetingPanel;
	private BagelPanel bagelPanel;
	private ToppingPanel toppingPanel;
	private CoffeePanel coffeePanel;
	private JPanel buttonPanel;
	private JButton calcButton;
	private JButton exitButton;
	private final double TAX_RATE = .06;
	
	/**
	 * 
	 */
	public OrderGUI() {
		super("Order Calculator");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		greetingPanel = new GreetingPanel();
		bagelPanel = new BagelPanel();
		toppingPanel = new ToppingPanel();
		coffeePanel = new CoffeePanel();
		buildPanel();
		
		add(greetingPanel, BorderLayout.NORTH);
		add(bagelPanel, BorderLayout.WEST);
		add(toppingPanel, BorderLayout.CENTER);
		add(coffeePanel, BorderLayout.EAST);
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
			double subtotal, tax, total;
			subtotal = bagelPanel.getBagelCost() + 
					   toppingPanel.getToppingCost() + 
					   coffeePanel.getCoffeeCost();
			
			tax = subtotal * TAX_RATE;
			total = subtotal + tax;
			DecimalFormat formatter = new DecimalFormat("$###,##0.00");
			
			JOptionPane.showMessageDialog(null, "Subtotal: " + formatter.format(subtotal) + "\n" + 
												"Tax: " + formatter.format(tax) + "\n" + 
												"Total: " + formatter.format(total) + "\n");
			
			
		}
		
	}
	
	private class exitButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	}
	
	public static void main(String[] args){
		new OrderGUI();
	}

}
