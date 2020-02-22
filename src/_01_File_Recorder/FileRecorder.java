package _01_File_Recorder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

import javax.swing.JOptionPane;

public class FileRecorder {
	// Create a program that takes a message from the user and saves it to a file.
	public static void main(String[] args) {
	FileRecorder g = new FileRecorder();
	g.gah();	
	}
	public void gah() {
	String message = JOptionPane.showInputDialog("say anything");
	try {
	FileWriter f = new FileWriter(message);
	}catch(IOException a){
		a.printStackTrace();
	}
	}
}
