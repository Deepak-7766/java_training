package Pattern.org;

public class numericPattern {

	public static void main(String[] args) {
		int i,j;
		int k=1;
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if(j<=i) {
					System.out.print( " "+k);
					k++;
				}
				
			}
			System.out.println("");
		}

	}

}
