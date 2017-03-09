
public class Month {

	int monthNumber;
	
	public Month() {
		monthNumber = 1;
	}

	/**
	 * @param monthNumber
	 */
	public Month(int monthNumber) {
		this.monthNumber = monthNumber;
		if(monthNumber < 1 || monthNumber > 12){
			this.monthNumber = 1;
		}
	}
	
	public Month(Month month2){
		this.monthNumber = month2.monthNumber;
	}
	
	/**
	 * Constructor that accepts month 
	 * name instead of number
	 */
	public Month(String name){
		switch(name){
		case("January"):
		case("january"):
			this.monthNumber = 1;
			break;
		case("February"):
		case("february"):
			this.monthNumber = 2;
			break;
		case("March"):
		case("march"):
			this.monthNumber = 3;
			break;
		case("April"):
		case("april"):
			this.monthNumber = 4;
			break;
		case("May"):
		case("may"):
			this.monthNumber = 5;
			break;
		case("June"):
		case("june"):
			this.monthNumber = 6;
			break;
		case("July"):
		case("july"):
			this.monthNumber = 7;
			break;
		case("August"):
		case("august"):
			this.monthNumber = 8;
			break;
		case("September"):
		case("september"):
			this.monthNumber = 9;
			break;
		case("October"):
		case("october"):
			this.monthNumber = 10;
			break;
		case("November"):
		case("november"):
			this.monthNumber = 11;
			break;
		case("December"):
		case("december"):
			this.monthNumber = 12;
			break;
		default:
			this.monthNumber = 1;
		}
	}

	/**
	 * @return the monthNumber
	 */
	public int getMonthNumber() {
		return monthNumber;
	}

	/**
	 * @param monthNumber the monthNumber to set
	 */
	public void setMonthNumber(int monthNumber) {
		this.monthNumber = monthNumber;
		if(this.monthNumber < 1 || this.monthNumber > 12){
			this.monthNumber = 1;
		}
	}
	
	/**
	 * Method that returns the name of a month
	 */
	public String getMonthName(){
		String name = "";
		
		switch(this.monthNumber){
		case(1):
			name = "January";
		break;
		case(2):
			name = "February";
		break;
		case(3):
			name = "March";
		break;
		case(4):
			name = "April";
		break;
		case(5):
			name = "May";
		break;
		case(6):
			name = "June";
		break;
		case(7):
			name = "July";
		break;
		case(8):
			name = "August";
		break;
		case(9):
			name = "September";
		break;
		case(10):
			name = "October";
		break;
		case(11):
			name = "November";
		break;
		case(12):
			name = "December";
		break;
		}
		
		return name;
	}
	
	/**
	 * toString method
	 */
	public String toString(){
		String outString;
		
		outString = "" + this.getMonthName();
		
		return outString;
	}
	
	/**
	 * equals method to determine if two
	 * objects hold the same data
	 */
	public boolean equals(Month month2){
		boolean isEqual = false;
		if(this.monthNumber == month2.monthNumber){
			isEqual = true;
		}
		return isEqual;
	}
	
	/**
	 * greaterThan method to determine if calling object's
	 * monthNumber is greater than argument's number
	 */
	public boolean greaterThan(Month month2){
		boolean isGreaterThan = false;
		if(this.monthNumber > month2.monthNumber){
			isGreaterThan = true;
		}
		return isGreaterThan;
	}
	
	/**
	 * lessThan method to determine if calling object's
	 * monthNumber is less than argument's number
	 */
	public boolean lessThan(Month month2){
		boolean isLessThan = false;
		if(this.monthNumber < month2.monthNumber){
			isLessThan = true;
		}
		return isLessThan;
	}

}
