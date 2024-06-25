package Exception;

class MyExe extends Exception{
	
	public MyExe(String s) {
	super(s);
	
	}
}
public class UserDefinedExe {

	public static void main(String[] args) {
		try {
		throw new MyExe("This is user defined Exception ");
		}
		catch(Exception ex) {
			System.out.println("caought");
			System.out.println(ex);
		}
	}

}
