package Pattern.org;

public class DiomondApp {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=17;j++) {
				if((i<=4 && j<=8+i && j>=10-i)||(i>4 && j<=16-i && j>i+1)) {
					System.out.print("*");
				} 
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
