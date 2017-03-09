
/**
 * @author Joe Kreke
 *
 */
public class Employee {

	private String employeeName;
	private String employeeNumber;
	private String hireDate;
	
	/**
	 * 
	 */
	public Employee() {
		System.out.println("Employee has been created");
	}
	
	public Employee(String EmployeeName, String EmployeeNumber, String HireDate){
		this.employeeName = EmployeeName;
		this.employeeNumber = EmployeeNumber;
		this.hireDate = HireDate;
	}

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/**
	 * @return the employeeNumber
	 */
	public String getEmployeeNumber() {
		return employeeNumber;
	}

	/**
	 * @param employeeNumber the employeeNumber to set
	 */
	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	/**
	 * @return the hireDate
	 */
	public String getHireDate() {
		return hireDate;
	}

	/**
	 * @param hireDate the hireDate to set
	 */
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

}
