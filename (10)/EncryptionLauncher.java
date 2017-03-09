import java.io.IOException;

/**
 * 
 */

/**
 * @author Joe Kreke
 *
 */
public class EncryptionLauncher {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileEncryption.encryptFile("EncryptedFile.txt", "This is the contents of the file. I am writing it on my computer now.");

	}

}
