
/**
 * @author Joe Kreke
 *
 */
public class ShiftSupervisor extends Employee {

	private double annualSalary;
	private double productionBonus;
	
	/**
	 * 
	 */
	public ShiftSupervisor() {
		
	}

	/**
	 * @param EmployeeName
	 * @param EmployeeNumber
	 * @param HireDate
	 */
	public ShiftSupervisor(String EmployeeName, String EmployeeNumber, String HireDate, double AnnualSalary, double ProductionBonus) {
		super(EmployeeName, EmployeeNumber, HireDate);
		this.annualSalary = AnnualSalary;
		this.productionBonus = ProductionBonus;
		System.out.println("Shift Supervisor has been created.");
		
	}

	/**
	 * @return the annualSalary
	 */
	public double getAnnualSalary() {
		return annualSalary;
	}

	/**
	 * @param annualSalary the annualSalary to set
	 */
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	/**
	 * @return the productionBonus
	 */
	public double getProductionBonus() {
		return productionBonus;
	}

	/**
	 * @param productionBonus the productionBonus to set
	 */
	public void setProductionBonus(double productionBonus) {
		this.productionBonus = productionBonus;
	}
	
	public String toString(){
		return "Shift Supervisor: \n" + 
			   "Name: " + this.getEmployeeName() + "\n" + 
			   "Number: " + this.getEmployeeNumber() + "\n" + 
			   "Hire Date: " + this.getHireDate() + "\n" + 
			   "Annual Salary: " + this.getAnnualSalary() + "\n" + 
			   "Production Bonus: " + this.getProductionBonus() + "\n" ;
	}
}
