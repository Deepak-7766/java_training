package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WirtingFile {

	public static void main(String[] args) throws IOException {
		File file=new File("D:/java_training/demo/demo1.txt");
		FileWriter wr=new FileWriter(file,true);
		
		wr.write("This first line of code : 1");
		System.out.println("Data saved in file...");
		
		wr.close();
		
		FileReader fr=new FileReader(file);
		char ch;
		int i;
		while(( i= fr.read())!=-1) {
			System.out.println((char)i);
		}
	}

}
