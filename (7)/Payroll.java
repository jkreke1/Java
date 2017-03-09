
/**
 * @author Joe Kreke
 *
 */
public class Payroll {

	private int[] employeeId = {5658845, 4520125, 7895122, 8777541,
										8451277, 1302850, 7580489};
	private int[] hours = new int[7];
	private double[] payRate = new double[7];
	private double[] wages = new double[7];
	
	/**
	 * 
	 */
	public Payroll() {
		
	}
	
	public Payroll(int[] hours, double[] payRate, double[] wages){
		this.hours = hours;
		this.payRate = payRate;
		this.wages = wages;
	}

	/**
	 * @return the employeeId
	 */
	public int[] getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int[] employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the hours
	 */
	public int[] getHours() {
		return hours;
	}

	/**
	 * @param hours the hours to set
	 */
	public void setHours(int[] hours) {
		this.hours = hours;
	}

	/**
	 * @return the payRate
	 */
	public double[] getPayRate() {
		return payRate;
	}

	/**
	 * @param payRate the payRate to set
	 */
	public void setPayRate(double[] payRate) {
		this.payRate = payRate;
	}

	/**
	 * @return the wages
	 */
	public double[] getWages() {
		return wages;
	}

	/**
	 * @param wages the wages to set
	 */
	public void setWages(double[] wages) {
		this.wages = wages;
	}
	
	public void setWages(double wage, int index){
		
	}
	
	/**
	 * Method to return gross pay of passed-in employee id
	 */
	public double getGrossPay(int IdNumber){
		double grossPay = 0.0;
		
		return grossPay;
		
	}

}
