package String.org;

public class ReversingString {

	public static void main(String[] args) {
//			String str="good morning india";
			
			try {
				System.out.println("1");
				
				String str=null;
				System.out.println(str.charAt(0));
				int sum=9/0;
				System.out.println("2");
			}
			catch(ArithmeticException ex) {
				
				int r=24/0;
				System.out.println("3");
				
			}
			catch(Exception e) {
				System.out.println("4");
			}
			finally {
				System.out.println("5");
			}

	}

}
