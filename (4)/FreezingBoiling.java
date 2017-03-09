//import JOptionPane to display results in methods
import javax.swing.JOptionPane;

public class FreezingBoiling {

	//store value for user input temperature
	private double temperature;
	
	//constructor
	public FreezingBoiling() {
		
	}
	
	//methods to return and set value of temperature
	public double getTemperature(){
		return temperature;
	}
	public void setTemperature(double Temperature){
		this.temperature = Temperature;
	}
	
	//determine if each subject is freezing or boiling at the user input temperature
	public boolean isEthylFreezing(){
		boolean isFreezing = false;
		
		if(this.getTemperature() <= -173){
			isFreezing = true;
		}
		
		return isFreezing;
	}
	public boolean isEthylBoiling(){
		boolean isBoiling = false;
		
		if(this.getTemperature() >= 172){
			isBoiling = true;
		}
		
		return isBoiling;
	}
	
	public boolean isOxygenFreezing(){
		boolean isFreezing = false;

		if(this.getTemperature() <= -362){
			isFreezing = true;
		}
		
		return isFreezing;
	}
	public boolean isOxygenBoiling(){
		boolean isBoiling = false;

		if(this.getTemperature() >= 172){
			isBoiling = true;
		}
		
		return isBoiling;
	}
	
	public boolean isWaterFreezing(){
		boolean isFreezing = false;
		
		if(this.getTemperature() <= 32){
			isFreezing = true;
		}
		
		return isFreezing;
	}
	public boolean isWaterBoiling(){
		boolean isBoiling = false;

		if(this.getTemperature() >= 172){
			isBoiling = true;
		}
		
		return isBoiling;
	}
	
	//Display information based on if the subject is freezing or boiling or unresponsive
	public void displayInformation(double UserInput){
		double temperature = UserInput;
		String message1, message2, message3;
		
		this.setTemperature(temperature);
		if(this.isEthylFreezing() == true){
			message1 = "Ethyl Alcohol is freezing at the input temperature.";
		} else if(this.isEthylBoiling() == true){
			message1 = "Ethyl Alcohol is boiling at the input temperature.";
		} else {
			message1 = "Ethyl Alcohol does not react to this temperature.";
		}
		
		if(this.isOxygenFreezing() == true){
			message2 = "Oxygen is freezing at the input temperature.";
		} else if(this.isOxygenBoiling() == true){
			message2 = "Oxygen is boiling at the input temperature.";
		} else {
			message2 = "Oxygen does not react to this temperature.";
		}
		
		if(this.isWaterFreezing() == true){
			message3 = "Water is freezing at the input temperature.";
		} else if(this.isWaterBoiling() == true){
			message3 = "Water is boiling at the input temperature.";
		} else {
			message3 = "Water does not react to this temperature.";
		}
		
		JOptionPane.showMessageDialog(null, message1 + "\n" + message2 + "\n" + message3 + "\n" );
	}

}
