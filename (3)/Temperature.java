
public class Temperature {
	//Fields
	private double ftemp;

	//Constructor and other methods
	public Temperature(double Ftemp) {
		this.ftemp = Ftemp;
	}
	
	public void setFahrenheit(double Ftemp){
		this.ftemp = Ftemp;
	}
	public double getFahrenheit(){
		return ftemp;
	}
	
	public double getCelsius(){
		return (5.0/9.0) * (ftemp - 32.0);

	}
	
	public double getKelvin(){
		return (ftemp + 459.67) * 5/9;

	}

}
