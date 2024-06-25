package Pattern.org;

public class RightSideFlag {

	public static void main(String[] args) {
		int i,j,k=0;
		for(i=1;i<=11;i++) {
			for(j=1;j<=11;j++) {
				if(j<=12-(i+k)  )
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			k++;
		}

	}

}
