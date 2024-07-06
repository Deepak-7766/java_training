package practice;
import java.util.*;

public class MemoryLeak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v=null;
		System.out.println("Running...");
		try {
		v=new Vector(999999999);
		System.out.println("Run Fine");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			v=null;
			
			System.gc();
		}
		
	}

}
