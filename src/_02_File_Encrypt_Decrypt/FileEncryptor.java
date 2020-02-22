package _02_File_Encrypt_Decrypt;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;

import javax.swing.JOptionPane;

public class FileEncryptor {
	// Create a program that takes a message from the user.
	// Use the methods in the String and Character classes to save
	// an encrypted form of the message to a file
	public static void main(String[] args) {
	FileEncryptor ihavenoideawhatimdoing = new FileEncryptor();
	String message = JOptionPane.showInputDialog("say anything");
	String what = ihavenoideawhatimdoing.encrypt(message, 'w');
	try {
		FileWriter fw = new FileWriter(what);
	}catch(IOException a){
		a.printStackTrace();
	}
	}
	
	
	
	
	
	
	
	
	public static String encrypt(String s, char key) {
		byte[] bytes = s.getBytes();
		String g = Utilities.encrypt(bytes, (byte) key);
		return g;
	}

}

class Utilities {
	// This basic encryption scheme is called single-byte xor. It takes a single
	// byte and uses exclusive-or on every character in the String.
	public static String encrypt(byte[] plaintext, byte key) {
		for (int i = 0; i < plaintext.length; i++) {
			plaintext[i] = (byte) (plaintext[i] ^ key);
		}
		return Base64.getEncoder().encodeToString(plaintext);
	}

	public static String decrypt(String cyphertext, byte key) {
		byte[] b = Base64.getDecoder().decode(cyphertext);
		for (int i = 0; i < b.length; i++) {
			b[i] = (byte) (b[i] ^ key);
		}
		return new String(b);
	}
}