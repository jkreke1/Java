/**
 * 
 */

/**
 * @author Joe Kreke
 *
 */
public class Library {

	private Books book;
	private String name;
	
	public Library(String name, Books book) {
		this.name = name;
		this.book = new Books(book);
	}
	
	/**
	 * @return the book
	 */
	public Books getBook() {
		return book;
	}

	/**
	 * @param book the book to set
	 */
	public void setBook(Books book) {
		this.book = new Books(book);
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

	public String toString(){
		String str = "";
		
		str += this.name + 
				"\n****************\n" + 
				book;
		
		return str;
	}

}
