
/**
 * @author Joe Kreke
 *
 */
public class TeamLeader extends ProductionWorker {

	private double monthlyBonus;
	private int reqNumTrainingHours;
	private int numTrainingHours;
	
	/**
	 * Default constructor
	 */
	public TeamLeader() {
		
	}

	/**
	 * @param Shift
	 * @param PayRate
	 * @param EmployeeName
	 * @param EmployeeNumber
	 * @param HireDate
	 */
	public TeamLeader(int Shift, double PayRate, String EmployeeName, String EmployeeNumber, String HireDate,
					  double MonthlyBonus, int ReqNumTrainingHours, int NumTrainingHours) {
		super(Shift, PayRate, EmployeeName, EmployeeNumber, HireDate);
		this.monthlyBonus = MonthlyBonus;
		this.reqNumTrainingHours = ReqNumTrainingHours;
		this.numTrainingHours = NumTrainingHours;
	}

	/**
	 * @return the monthlyBonus
	 */
	public double getMonthlyBonus() {
		return monthlyBonus;
	}

	/**
	 * @param monthlyBonus the monthlyBonus to set
	 */
	public void setMonthlyBonus(double monthlyBonus) {
		this.monthlyBonus = monthlyBonus;
	}

	/**
	 * @return the reqNumTrainingHours
	 */
	public int getReqNumTrainingHours() {
		return reqNumTrainingHours;
	}

	/**
	 * @param reqNumTrainingHours the reqNumTrainingHours to set
	 */
	public void setReqNumTrainingHours(int reqNumTrainingHours) {
		this.reqNumTrainingHours = reqNumTrainingHours;
	}

	/**
	 * @return the numTrainingHours
	 */
	public int getNumTrainingHours() {
		return numTrainingHours;
	}

	/**
	 * @param numTrainingHours the numTrainingHours to set
	 */
	public void setNumTrainingHours(int numTrainingHours) {
		this.numTrainingHours = numTrainingHours;
	}
	
	/**
	 * toString to display all info from employee
	 */
	public String toString(){
		return "Team Leader: \n" + 
			   "Name: " + this.getEmployeeName() + "\n" + 
			   "Number: " + this.getEmployeeNumber() + "\n" + 
			   "Hire Date: " + this.getHireDate() + "\n" + 
			   "Shift: " + this.getShift() + "\n" + 
			   "Pay Rate: " + this.getPayRate() + "\n" + 
			   "Monthly Bonus: " + this.getMonthlyBonus() + "\n" + 
			   "Required Training Hours: " + this.getReqNumTrainingHours() + "\n" + 
			   "Number of Training Hours: " + this.getNumTrainingHours() + "\n";
	}

}
