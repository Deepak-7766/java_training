package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializingObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file=new File("D:/java_training/demo/serializefile.txt");
		Employee emp=new Employee(1,"deepak",60000);
		try {
			FileOutputStream fos=new FileOutputStream(file,true);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(emp);
			System.out.println("Object Serialized Success ...");
			oos.close();
			oos.flush();
			fos.close();
			
			
				
			
				
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (FileInputStream fis = new FileInputStream(file);
	             ObjectInputStream ois = new ObjectInputStream(fis)) {
	            Employee obj2;  
	            while((obj2=(Employee) ois.readObject())!=null){
	            System.out.println(obj2.getId());
	            }
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
		
		
		
		
		
		
//		FileInputStream fis=new FileInputStream("D:/java_training/demo/serializefile.txt");
//		ObjectInputStream ois=new ObjectInputStream(fis);
//		 Employee emp1=(Employee) ois.readObject();
//		Employee obj2=(Employee) ois.readObject();
//			System.out.println(obj2);
//			fis.close();
//			ois.close();
//		Employee e;
//		while((e=(Employee) ois.readObject())!=null) {
//			System.out.println(e);
//		}
		
		

	}

}

class Employee implements Serializable{

	private int id;
	private String name;
	private int sal;
	public Employee(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String toString() {
		return "["+this.id+" ,"+this.name+" ,"+this.sal+"]";
	}
	
}
