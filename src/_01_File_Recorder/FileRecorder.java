package _01_File_Recorder;

import javax.swing.JOptionPane;

public class FileRecorder {
	// Create a program that takes a message from the user and saves it to a file.
	public static void main(String[] args) {
	FileRecorder g = new FileRecorder();
	g.gah();	
	}
	public void gah() {
	String message = JOptionPane.showInputDialog("say anything");
	}
}
