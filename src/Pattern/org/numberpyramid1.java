package Pattern.org;

public class numberpyramid1 {

	public static void main(String[] args) {
		int i,j;
		boolean flag=true;
		int k=1;
		for(i=1;i<=4;i++) {
			for(j=1;j<=7;j++) {
				if(j>=5-i && j<=3+i &&flag) {
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
