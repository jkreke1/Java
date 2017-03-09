/**
 * 
 */

/**
 * @author Joe Kreke
 *
 */
public class Books {

	private String name;
	private String publishDate;
	private String author;
	
	public Books() {
		this.name = "";
		this.publishDate = "";
		this.author = "";
	}
	
	public Books(String name, String publishDate, String author) {
		this.name = name;
		this.publishDate = publishDate;
		this.author = author;
	}
	
	public Books(Books book2){
		this.name = book2.name;
		this.publishDate = book2.publishDate;
		this.author = book2.author;
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
	 * @return the publishDate
	 */
	public String getPublishDate() {
		return publishDate;
	}

	/**
	 * @param publishDate the publishDate to set
	 */
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String toString(){
		String str = "";
		str += this.name + "\n" + 
			   this.publishDate + "\n" + 
			   this.author + "\n\n";
		return str;
	}

}
