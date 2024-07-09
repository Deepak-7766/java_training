package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationApp1 {

	public static void main(String[] args) throws IOException,FileNotFoundException, ClassNotFoundException {
		MyClass obj1=new MyClass(12,"deepak",8009);
		File file=new File("D:\\java_training\\file handling1\\file1.txt");
		FileOutputStream fos=new FileOutputStream(file,true);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(obj1);
		System.out.println("Object is Serialized");
		oos.flush();
		oos.close();
		
		
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		MyClass obj2;
		while((obj2=(MyClass) ois.readObject())!=null) {
			System.out.println("XXXXXXXXXXXXX"+obj2);
		}
		ois.close();
		fis.close();

	}
	

}
class MyClass implements Serializable{
	
	private int id;
	private String name;
	private int marks;
	
	public MyClass(int id,String name,int marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public String toString() {
		return "["+id+" "+name+" "+marks+"]";
		
	}
}