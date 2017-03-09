import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Joe Kreke
 *
 */
public class GradeBook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		char[] letterGrades = new char[5];
		ArrayList<double[]> grades = new ArrayList<double[]>();
		String userInput;
		//char userInputChar;
		
		for(int i = 0; i < 1; i++){
			userInput = JOptionPane.showInputDialog("Input the name of a student: ");
			nameList.add(userInput);
		}
		
		/*
		for(int i = 0; i < nameList.size(); i++){
			userInputChar = JOptionPane.showInputDialog("Input the letter grade for " + nameList.get(i)  + ": ").charAt(0);
			letterGrades[i] = userInputChar;
		}
		*/
		
		for(int i = 0; i < 5; i++){
			double[] grade = new double[5];
			for(int n = 0; n < nameList.size(); n++){
				grade[n] = Double.parseDouble(JOptionPane.showInputDialog("Input grade " + (n + 1) + " for " + nameList.get(i)));
			}
			grades.add(grade);
		}
		
		for(int i = 0; i < nameList.size(); i++){
			System.out.println(nameList.get(i) + "'s Grades: \n" +
							   "-----------------------------\n");
			for(int n = 0; n < grades.size(); n++){
				System.out.println(grades.get(n)[n]);
			}
			System.out.println(Grades.getAverage(grades.get(i)));
		}
		
		System.exit(0);

	}

}
