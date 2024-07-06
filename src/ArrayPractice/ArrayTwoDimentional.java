package ArrayPractice;

public class ArrayTwoDimentional {

	public static void main(String[] args) {
		int []a[]=new int[5][3];
		int i,j;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		for(i=0;i<a.length;i++) {
			for(j=0;j<a[j].length;j++) {
			a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Valures in Array : ");
		for(i=0;i<a.length;i++) {
			for(j=0;j<a[j].length;j++) {
				System.out.print(a[i][j]);
				}
			System.out.println();
		}
	}
	

}
