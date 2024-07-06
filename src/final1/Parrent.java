package final1;
class parrent1{
	static {
		System.out.println("Static Block");
	}
	{
		System.out.println("initializer Block");
	}
	
	void show() {
		System.out.println("user defined method");
		
	}
	parrent1()
	{
		System.out.println("constructor Block");
	}
}

public class Parrent extends parrent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("main method Block");
//		new parrent1();
//		parrent1 p=new parrent1();
//		p.show();

	}

}
