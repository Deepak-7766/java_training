package creatingHashcode;
import java.util.*;

public class Employee {

	private int id;
	private int sal;
	private String name;
	
	Employee(int id,String name,int sal){
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	
	public int getId() {
		return id;
	}
	public int getSal() {
		return sal;
	}
	public String getName() {
		return name;
	}
	
	public boolean equals(Object obj) {
		Employee temp=(Employee)obj;
		
		if(this.name.equals(temp.name) && this.id==temp.id && this.sal==temp.sal) {
			return true;
		}
		else {
			return false;
		}
	}
	public int hashCode()
	{
		return id*sal*10;
	}
}
