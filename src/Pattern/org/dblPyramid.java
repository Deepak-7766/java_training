package Pattern.org;

public class dblPyramid {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=18;j++) {
				if((j<=9 && (j>=6-i && j<=4+i)) || (j>=9 && (j>=15-i && j<=13+i)))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
