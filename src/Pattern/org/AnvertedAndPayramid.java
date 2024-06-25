package Pattern.org;

public class AnvertedAndPayramid {

	public static void main(String[] args) {
			int i,j;
			for(i=1;i<=9;i++) {
				for(j=1;j<=18;j++) {
					if( (j>=6-i && j<=4+i && i<=5) ||(i>=5 && j<=22-i && j>=i+4)  ) {
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
