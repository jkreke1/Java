
/**
 * @author Joe Kreke
 *
 */
public class ProductionWorker extends Employee {

	private int shift;
	private double payRate;
	
	/**
	 * 
	 */
	public ProductionWorker() {
		
	}
	
	public ProductionWorker(int Shift, double PayRate, String EmployeeName, String EmployeeNumber, String HireDate){
		super(EmployeeName, EmployeeNumber, HireDate);
		this.shift = Shift;
		this.payRate = PayRate;
		
		System.out.println("Production Worker has been created.");
	}

	/**
	 * @return the shift
	 */
	public int getShift() {
		return shift;
	}

	/**
	 * @param shift the shift to set
	 */
	public void setShift(int shift) {
		this.shift = shift;
	}

	/**
	 * @return the payRate
	 */
	public double getPayRate() {
		return payRate;
	}

	/**
	 * @param payRate the payRate to set
	 */
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	
	public String toString(){
		return "Production Worker: \n" + 
			   "Name: " + this.getEmployeeName() + "\n" + 
			   "Number: " + this.getEmployeeNumber() + "\n" + 
			   "Hire Date: " + this.getHireDate() + "\n" + 
			   "Shift: " + this.getShift() + "\n" + 
			   "Pay Rate: " + this.getPayRate() + "\n" ;
	}

}
