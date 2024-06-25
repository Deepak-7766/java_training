package Exception;



class Test extends Exception {
		public Test(String s) {
			super(s);
		}
}
public class Userdefined{
	public static void main(String x[]) {
		try {
			throw new Test("This is User defined exception ");
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}
}