package _01_File_Recorder;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class FileRecorder {
	// Create a program that takes a message from the user and saves it to a file.
	public static void main(String[] args) {
		String stage = JOptionPane.showInputDialog("Welcome to the Metaverse");
		try {
			FileWriter fw = new FileWriter("src/_01_File_recorder/FileRecorderText", true);
			fw.write(stage + "\n");
			fw.close();
		}catch(Exception e) {
			
		}
	}
}
