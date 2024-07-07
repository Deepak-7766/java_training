package filehandling;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFileUsingBeufferedWriter {

	public static void main(String[] args) throws IOException {
		
		FileWriter fr = new FileWriter("D:/java_training/demo/demo1.txt",true);;
		BufferedWriter bwr=new BufferedWriter(fr);;
		try {
			
			
			
			bwr.write("this third line of file : 3");
			bwr.newLine();
			System.out.println("Write Success .......");
			bwr.close();
			fr.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Connection get closed...");
	}

}
