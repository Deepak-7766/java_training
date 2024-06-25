package Exception;
class A extends Exception{
	
}
class B extends A{
	
}
public class UserdefindException {

	public static void main(String[] args) {
		try {
			throw new B();
		}
		catch(B b) {
			System.out.println("child Exception caught");
		}
		catch(A a) {
			System.out.println("Parrent Exception is caught");
		}

	}

}
