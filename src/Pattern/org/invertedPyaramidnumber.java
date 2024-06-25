package Pattern.org;

public class invertedPyaramidnumber {

	public static void main(String[] args) {
		int i,j;
		boolean flag=true;
		for(i=1;i<=4;i++) {
			int k=i;
			for(j=1;j<=7;j++) {
				if(j>=i && j<=8-i && flag) {
					System.out.print(k);
					k++;
					flag=false;
				}else {
					System.out.print(" ");
					flag=true;
				}
			}
			System.out.println();
			
		}

	}

}
