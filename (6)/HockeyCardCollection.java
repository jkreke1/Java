
public class HockeyCardCollection {

	private HockeyCard hockeyCard;
	
	public HockeyCardCollection() {
		
	}
	
	public HockeyCardCollection(HockeyCard hockeyCard) {
		this.hockeyCard = new HockeyCard(hockeyCard);
	}

	/**
	 * @return the hockeyCard
	 */
	public HockeyCard getHockeyCard() {
		return new HockeyCard(hockeyCard);
	}

	/**
	 * @param hockeyCard the hockeyCard to set
	 */
	public void setHockeyCard(HockeyCard hockeyCard) {
		this.hockeyCard = new HockeyCard(hockeyCard);
	}
	
	/**
	 * toString
	 */
	public String toString(){
		String str;
		str = "Hockey Card Collection: " + "\n" + 
			  "***********************" + "\n" + 
			  hockeyCard;
		return str;
	}

}
