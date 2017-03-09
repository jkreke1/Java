import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 
 */

/**
 * @author Joe Kreke
 *
 */
public class FileEncryption {

	/**
	 * 
	 */
	public FileEncryption() {
		
	}
	
	public static void encryptFile(String fileName, String fileContents) throws IOException{
		FileOutputStream fstream = new FileOutputStream(fileName);
		DataOutputStream OutputFile = new DataOutputStream(fstream);
		
		OutputFile.writeChars(fileContents);

		fstream.close();
		OutputFile.close();
		
		RandomAccessFile file = new RandomAccessFile(fileName, "rw");
		
		final int CHAR_SIZE = 2;
		int charNum = 0;
		final long FILE_LENGTH = file.length() / CHAR_SIZE;
		for(int i = 0; i < FILE_LENGTH; i++){
			file.seek(CHAR_SIZE * charNum);
			char ch = file.readChar();
			ch += 5;
			file.writeChar(ch);
			System.out.print(ch);
			charNum++;
		}
		
		file.close();

		
	}

}
