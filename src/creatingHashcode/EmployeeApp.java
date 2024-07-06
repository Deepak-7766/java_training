package creatingHashcode;
import java.util.*;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee emp1=new Employee(1,"deepak",1000);
		Employee emp2=new Employee(1,"deepak",1000);
		Employee emp3=new Employee(1,"rahul",1000);
		Employee emp4=new Employee(1,"vishal",1000);
		Employee emp5=new Employee(1,"deepak",1000);
		Employee emp6=new Employee(1,"deepak",1000);
		
		
		
		if(emp1.equals(emp2)) {
			System.out.println("Both Objects Are Equale ");
			System.out.println("HashhCode of Emp1 is = "+System.identityHashCode(emp1));
			System.out.println("HashCode of Emp2 is = "+System.identityHashCode(emp2));
			System.out.println("");
			System.out.println("HashCode of Emp1 is = "+emp1.hashCode());
			System.out.println("HashCode of Emp2 is = "+emp2.hashCode());
		}
		else {
			System.out.println("objects are diffrent");
			System.out.println("HashCode of Emp1 is = "+emp1.hashCode());
			System.out.println("HashCode of Emp2 is = "+emp2.hashCode());
		}
		LinkedHashSet ls=new LinkedHashSet();
		
		ls.add(emp1);
		ls.add(emp2);
		ls.add(emp3);
		ls.add(emp4);
		ls.add(emp5);
		ls.add(emp6);
		System.out.println("\n\n\n");

		System.out.println("After Creating User defining Hashcode : ");
		for(Object obj:ls) {
			Employee e=(Employee)obj;
			System.out.println(e.getName()+"\t"+e.getId()+"\t"+e.getSal()+"\t"+System.identityHashCode(e));
			
		}
	}

}
