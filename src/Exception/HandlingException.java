package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingException {

	public static void main(String[] args) {
		D d=new D();
		d.a();
	}
	
	
}
class D{
	public void a(){
		System.out.println("Method A() ");
		b();
	}
	public void b() {
		System.out.println("Method A() ");
		c();
	}
	public void c() throws NumberFormatException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
	
		int n=9;
		
		System.out.println("Yes you Handled Exception");
	}

}