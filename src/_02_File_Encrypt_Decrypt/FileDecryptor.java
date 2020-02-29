package _02_File_Encrypt_Decrypt;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileDecryptor {
	// Create a program that opens the file created by FileEncryptor and display
	// the decrypted message to the user in a JOptionPane.
	public static void main(String[] args) {
		Encryption g = new Encryption();
		String m = "";
		try {
			FileReader fr = new FileReader("message.txt");
			int c = fr.read();
			while(c != -1){
				System.out.print((char)c);
				m = m + (char)c;
				c = fr.read();
			}
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String b = g.decryptor(m);
		JOptionPane.showMessageDialog(null, b);
	}
}
