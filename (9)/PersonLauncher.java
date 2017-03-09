
/**
 * @author Joe Kreke
 *
 */
public class PersonLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Instantiate normal customer
		Person person1 = new Customer(1234567, true, "The Necromancer", "123 Dol Guldur Lane", "1(618)922-5142");
		//Instantiate preferred customer
		Person person2 = new PreferredCustomer(1234568, true, "The Lich King", "Mordor", "1(314)513-6623", 1040.50);
		
		//Printing both with toString
		System.out.println(person1);
		System.out.println(person2);

	}

}
