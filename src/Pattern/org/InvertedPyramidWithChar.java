package Pattern.org;

public class InvertedPyramidWithChar {

	public static void main(String[] args) {
		int i,j;
		int k=79;
		boolean flag=true;
		for(i=1;i<=5;i++) {
			for(j=1;j<=9;j++) {
				if(j>=i && j<=10-i && flag) {
					System.out.print((char)k);
					k--;
					flag=false;
				}
				else {
					flag=true;
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}

}
