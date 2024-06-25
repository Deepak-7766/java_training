package Pattern.org;

public class Dimond {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=9;i++) {
			for(j=1;j<=9;j++) {
				if( (i>5 && j<=14-i && j>=i-4) || (i<=5 && j>=6-i && j<=4+i)  )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
