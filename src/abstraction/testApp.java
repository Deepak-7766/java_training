package abstraction;

class A{
	public void method1() {
		System.out.println("parrent");
		}
}
class B extends A{
	public void method1() {
		System.out.println("Child");
		}
}
public class testApp {

	public static void main(String[] args) {
		A a=new B();
//		a.method1();
		B b=new B();
		b.method1();
	

	}

}
