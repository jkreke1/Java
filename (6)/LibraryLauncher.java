import javax.swing.JOptionPane;

/**
 * @author Joe Kreke
 *
 */
public class LibraryLauncher {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int userInputInt;
		String userInput;
		String libraryName;
		
		libraryName = JOptionPane.showInputDialog("Library name?");
		userInputInt = Integer.parseInt(JOptionPane.showInputDialog("How many books?"));
		
		for(int i = 0; i < userInputInt; i++){
			Books book = new Books();
			userInput = JOptionPane.showInputDialog("Enter book name: ");
			book.setName(userInput);
			userInput = JOptionPane.showInputDialog("Enter publishing date: ");
			book.setPublishDate(userInput);
			userInput = JOptionPane.showInputDialog("Enter author name: ");
			book.setAuthor(userInput);
			
			Library library = new Library(libraryName, book);
			System.out.println(library);
		}

	}

}
