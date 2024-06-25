package Pattern.org;

public class Butterfly {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=11;i++) {
			for(j=1;j<=11;j++) {
				if((i<6 && j>i && j<=11-i) || (i>6 && j>12-i && j<=i-1))
				System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println("");
		}

	}

}
