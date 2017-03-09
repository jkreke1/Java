import java.util.Scanner;
import javax.swing.JOptionPane;

public class classExample {
	public static void main(String[] args){
		String name;
		String name1 = "Joseph";
		Scanner keyboard = new Scanner(System.in);
		
		/*System.out.println("What is your name?");
		name = keyboard.nextLine();
		
		if(name.equals(name1)){
			System.out.println("Welcome, " + name + ", you are authorized.");
		} else {
			System.out.println("You are not authorized, please leave immediately.");
		}
		
		keyboard.close();*/
		
		keyboard.close();
		
		name = JOptionPane.showInputDialog("What is your name?");
		if(name.equals(name1)){
			JOptionPane.showMessageDialog(null, "Welcome, " + name + ", you are authorized.");
		} else {
			JOptionPane.showMessageDialog(null, "You are not authorized, please leave immediately.");
		}
		
		
	}

}
