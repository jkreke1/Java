
/**
 * @author Joe Kreke
 *
 */
public class ShipLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Array of different kinds of ships
		Ship[] shipList = new Ship[3];
		
		//instantiate first ship
		shipList[0] = new Ship("The Butt", "1909");
		//instantiate second ship
		shipList[1] = new CruiseShip("Gigantor", "1654", 250);
		//instantiate third ship
		shipList[2] = new CargoShip("Dinostrus", "2013", 500);
		
		//ToStrings for ships
		System.out.println(shipList[0]);
		System.out.println(shipList[1]);
		System.out.println(shipList[2]);

	}

}
