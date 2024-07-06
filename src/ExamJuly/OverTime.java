package ExamJuly;
import java.util.*;

public class OverTime  {
	int i;
	int id;
	String name;
	int sal;
	int totalWorking;
	int ot;
	Employee emp[]=new Employee[5];
	public void setInfo() {
	Scanner sc=new Scanner(System.in);
	
	
	for(i=0;i<3;i++) {
		System.out.println("Enyter id name sallery total working and over time ");
		id=sc.nextInt();
		name=sc.next();
		sal=sc.nextInt();
		totalWorking=sc.nextInt();
		ot=sc.nextInt();
		emp[i]=new Employee(id,name,sal,totalWorking,ot);
	}
	for(i=0;i<3;i++) {
		emp[i].display();
	}
	}
	public void calOverTime() {
		int total=0;
		for(i=0;i<3;i++) {
			total=emp[i].getTotalWorking()+emp[i].getOt();
			int totalpay=total*50;
			emp[i].setTotalWorking(total);
			emp[i].setTotalpay(totalpay);
			emp[i].display();
			
		}
		
		System.out.println(total);
	}
	
}
