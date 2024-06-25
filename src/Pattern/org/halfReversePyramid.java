package Pattern.org;

public class halfReversePyramid {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=9;j++) {
				
				if(j<=10-i && j>=5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
