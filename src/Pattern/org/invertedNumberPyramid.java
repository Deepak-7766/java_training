package Pattern.org;

public class invertedNumberPyramid {

	public static void main(String[] args) {
		int i,j;
		int k=1;
		boolean flag=true;
		for(i=1;i<=5;i++) {
			k=i;
			for(j=1;j<=9;j++) {
				if(j>=i && j<=9-i && flag) {
					System.out.print(k);
					k++;
					flag=false;
				}
				else {
					System.out.print(" ");
					flag=true;
				}
			}
			System.out.println("");
		}

	}

}
