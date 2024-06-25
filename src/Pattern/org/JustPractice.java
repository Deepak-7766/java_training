package Pattern.org;

public class JustPractice {

	public static void main(String[] args) {
//		// Diomonde
		int i,j;
//		for(i=1;i<=9;i++) {
//			for(j=1;j<=17;j++) {
//				
//				if(i<5 && j<=8+i && j>=10-i)
//				System.out.print("*");
//				else if(i>=5 && j>=i && j<=18-i) {
//					System.out.print("*");
//				}
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}
		
		for(i=1;i<=9;i++) {
			
			for(j=1;j<=17;j++) {
				if(i<=5 && j<=4+i && j>=6-i) {
					System.out.print("*");
				}
				else if(i>=5 && j>=i+3 && j<=21-i){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
