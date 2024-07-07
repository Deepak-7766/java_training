package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFileUsingBufferedReader {

	public static void main(String[] args) throws IOException {
		File file=new File("D:\\java_training\\demo\\demo1.txt");
		FileReader fr=new FileReader(file);
		BufferedReader bf=new BufferedReader(fr);
		String s;
		try {
			while( (s=bf.readLine())!=null) {
				System.out.println(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			fr.close();
			bf.close();
			System.out.println("-------------------------");
			System.out.println("Connection get closed...");
			
		}

	}

}
