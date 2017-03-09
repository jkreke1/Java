
public class HockeyCard {

	private String name;
	private String team;
	private double value = 0;
	private static double totalValue = 0;
	
	public HockeyCard() {
		this.name = "";
		this.team = "";
		this.value = 0;
		totalValue = 0;
	}
	
	public HockeyCard(String name, String team, double value){
		this.name = name;
		this.team = team;
		this.value = value;
		totalValue += value;
	}
	
	public HockeyCard(HockeyCard hockeyCard){
		this.name = hockeyCard.name;
		this.team = hockeyCard.team;
		this.value = hockeyCard.value;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the team
	 */
	public String getTeam() {
		return team;
	}

	/**
	 * @param team the team to set
	 */
	public void setTeam(String team) {
		this.team = team;
	}

	/**
	 * @return the value
	 */
	public double getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(double value) {
		this.value = value;
	}

	/**
	 * toString
	 */
	public String toString(){
		String str;
		str = "Name: " + this.name + "\n" + 
			  "Team: " + this.team + "\n" + 
			  "Value: " + this.value;
		return str;
	}
}
