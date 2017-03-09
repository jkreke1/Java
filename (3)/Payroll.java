
public class Payroll {

	//Fields
	private String name;
	private int idNumber;
	private double hourlyPayRate;
	private int numHoursWorked;
	
	//Constructors and other methods
	public Payroll() {
		
	}
	
	public Payroll(String name, int idNumber, double hourlyPayRate, int numHoursWorked) {
		this.name = name;
		this.idNumber = idNumber;
		this.hourlyPayRate = hourlyPayRate;
		this.numHoursWorked = numHoursWorked;
	}
	
	public double CalculateGrossPay(){
		return hourlyPayRate * numHoursWorked;
	}


	//Properties
	public String getName() {
		return name;
	}

	public void setName(String Name) {
		this.name = Name;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int IdNumber) {
		this.idNumber = IdNumber;
	}

	public double getHourlyPayRate() {
		return hourlyPayRate;
	}

	public void setHourlyPayRate(double HourlyPayRate) {
		this.hourlyPayRate = HourlyPayRate;
	}

	public int getNumHoursWorked() {
		return numHoursWorked;
	}

	public void setNumHoursWorked(int NumHoursWorked) {
		this.numHoursWorked = NumHoursWorked;
	}

}
