package Pattern.org;

public class reverseFlag {
	public static void main(String asr[]) {
		int i,j;
		for(i=1;i<=8;i++) {
			for(j=1;j<=17;j++) {
				if(j>=10-i && j<=8+i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
