package practice;

class A {
	public static void show() {
		System.out.println("This is Parant Class static method");
	}
	public void display() {
		System.out.println("This is Parant Class Instance method");
	}
}

class B extends A{
	public static void show() {
		System.out.println("This is child Class static method");
	}
	public void display() {
		System.out.println("This is child Class Overrided by parrent Instance method");
	}
	
}
public class MethodHidingApp {

	public static void main(String[] args) {
		A a=new A();
		System.out.println("BY creating parrant class object and reference");
		a.show();
		a.display();
		System.out.println("----------------------------------------------");
		System.out.println("BY creating child class object and reference");
		
		B b=new B();
		b.show();
		b.display();
		System.out.println("----------------------------------------------");
		System.out.println("BY creating parrant class refernce and child class object");
		A a1=new B();
	
		a1.show();
		a1.display();
		

	}

}
