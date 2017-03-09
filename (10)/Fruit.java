import java.io.Serializable;

/**
 * 
 */

/**
 * @author Joe Kreke
 *
 */
public class Fruit implements Serializable {

	private String fruitType;
	private int qty;
	private String color;
	private int  rating;
	
	
	/**
	 * 
	 */
	public Fruit() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param fruitType
	 * @param qty
	 * @param color
	 * @param rating
	 */
	public Fruit(String fruitType, int qty, String color, int rating) {
		super();
		this.fruitType = fruitType;
		this.qty = qty;
		this.color = color;
		this.rating = rating;
	}

	/**
	 * @return the fruitType
	 */
	public String getFruitType() {
		return fruitType;
	}

	/**
	 * @param fruitType the fruitType to set
	 */
	public void setFruitType(String fruitType) {
		this.fruitType = fruitType;
	}

	/**
	 * @return the qty
	 */
	public int getQty() {
		return qty;
	}

	/**
	 * @param qty the qty to set
	 */
	public void setQty(int qty) {
		this.qty = qty;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

}
