package Pattern.org;

public class KiranWagh {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=3;j++) {
				if(j%2==0 || i==1 || i==4) {
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
