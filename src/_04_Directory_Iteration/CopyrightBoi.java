package _04_Directory_Iteration;

import java.io.File;
import java.util.Iterator;

public class CopyrightBoi {
	public static void main(String[] args) {
		File src = new File("/src");
		itterate(src);
	}
	public static void itterate(File file) {
		File[] filetwo = filetwo.length;
		if (filetwo != null) {
			for (File f : filetwo) {
				System.out.println(f.getAbsolutePath());
				if (f.getAbsolutePath().contains(".java")) {
					
				}
				else {
					itterate(f);
				}
			}
		}
	}
}
