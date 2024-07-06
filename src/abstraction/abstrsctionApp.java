package abstraction;
import java.util.Scanner;

public class abstrsctionApp {

	public static void main(String[] args) {
		int a,b;
		Scanner sc =new Scanner(System.in);
		calculater c=new calculater();
		System.out.println("Enetr values ");
		a=sc.nextInt();
		b=sc.nextInt();
	Value v=new Add();
	v.setvalue(a,b);
	c.show(v);
	
	System.out.println("Enetr values ");
	a=sc.nextInt();
	b=sc.nextInt();
	v=new Sub();
	v.setvalue(a,b);
	c.show(v);
	
	System.out.println("Enetr values ");
	a=sc.nextInt();
	b=sc.nextInt();
	v=new Mul();
	v.setvalue(a,b);
	c.show(v);
	
	}

}
