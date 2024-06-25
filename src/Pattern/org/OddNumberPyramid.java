package Pattern.org;

public class OddNumberPyramid {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++) {
			int k=(i*2)-1;
			for(j=1;j<=9;j++) {
				
				if(j>=6-i && j<=4+i) {
					
					if(k%2==1) {
						System.out.print(k);
						k--;
						}
					else {
						System.out.print(" ");
						k--;
					}
					
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
