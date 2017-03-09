
public class RomanNumerals {
	
	private String romanNumeral;
	private int userInput;
	
	public RomanNumerals(){
		
	}
	
	public void setRomanNumeral(int num){
		switch(num){
		case 1:
			romanNumeral = "I";
			break;
		case 2:
			romanNumeral = "II";
			break;
		case 3:
			romanNumeral = "III";
			break;
		case 4:
			romanNumeral = "IV";
			break;
		case 5:
			romanNumeral = "V";
			break;
		case 6:
			romanNumeral = "VI";
			break;
		case 7:
			romanNumeral = "VII";
			break;
		case 8:
			romanNumeral = "VIII";
			break;
		case 9:
			romanNumeral = "IX";
			break;
		case 10:
			romanNumeral = "X";
			break;
		default:
			romanNumeral = "You have entered and invalid number or range";
			break;
			
		}
	}
	
	public void getRomanNumeralStatement(){
		String str = this.getRomanNumeral();
		switch(str){
		case "I":
		case "II":
		case "III":
		case "IV":
		case "V":
		case "VI":
		case "VII":
		case "VIII":
		case "IX":
		case "X":
			System.out.println("The number " + userInput + "\'s Roman numeral equivalent is " + this.getRomanNumeral());
			break;
		default:
			System.out.println("You have entered and invalid number or range.");
			
		}
		
	}
	
	public String getRomanNumeral(){
		return romanNumeral;
	}
	
	public void setUserInput(int userInput){
		this.userInput = userInput;
	}
	
	public int getUserInput(){
		return userInput;
	}

}
