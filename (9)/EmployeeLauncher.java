
/**
 * @author Joe Kreke
 *
 */
public class EmployeeLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Instantiate three types of employees
		Employee emp1 = new ProductionWorker(1, 15.50, "John Smith", "197-B", "10/22/14");
		Employee emp2 = new ShiftSupervisor("Smith Johnson", "017-A", "4/19/12", 42320.0, 1345.50);
		Employee emp3 = new TeamLeader(1, 19.75, "Jiff Smonthson", "213-L", "8/29/14",155.25, 30, 21);
		
		//Display employee information with toString
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);

	}

}

