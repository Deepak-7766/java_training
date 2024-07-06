package ArrayPractice;

public class JaggedArray {

	public static void main(String[] args) {
			
		int a[][]=new int[3][];
		a[0]=new int[5];
		a[1]=new int[2];
		a[2]=new int[3];
		System.out.println("Enter array Values : ");
		int i,j;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		for(i=0;i<a.length;i++) {
			for(j=0;j<a[j].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The Arrray Values : ");
		for(i=0;i<a.length;i++) {
			for(j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
