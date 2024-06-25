package Pattern.org;

public class StarPattern {

	public static void main(String[] args) {
		int i,j;
		boolean flag=true;
		for(i=1;i<=5;i++) {
			for(j=1;j<=9;j++) {
				if((j>=6-i && j<=4+i) && ((i%2==1 && j%2==1)||(i%2==0 && j%2==0))) {
				
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
