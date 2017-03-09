
public class Payroll {

	//Fields
	private String name;
	private int idNumber;
	private double hourlyPayRate;
	private int numHoursWorked;
	
	//Default Constructor
	public Payroll() {
		this.name = "";
		this.idNumber = 0;
		this.hourlyPayRate = 0.0;
		this.numHoursWorked = 0;
	}
	
	public Payroll(String name, int idNumber, double hourlyPayRate, int numHoursWorked) throws EmptyNameException, InvalidIdNumberException,
																							   InvalidHoursException, InvalidPayRateException{
		//Determine if fields are invalid and throw exceptions
		this.name = name;
		if(this.name == "")
			throw new EmptyNameException();
		this.idNumber = idNumber;
		if(this.idNumber < 0)
			throw new InvalidIdNumberException();
		this.hourlyPayRate = hourlyPayRate;
		if(this.hourlyPayRate < 0 || this.hourlyPayRate > 25)
			throw new InvalidPayRateException();
		this.numHoursWorked = numHoursWorked;
		if(this.numHoursWorked < 0 || this.numHoursWorked > 84)
			throw new InvalidHoursException();
	}
	
	public double CalculateGrossPay(){
		return hourlyPayRate * numHoursWorked;
	}


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
