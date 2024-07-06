package mcq.org;
import java.util.*;

public class reverse {

	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr number ");
		number=sc.nextInt();
		int count=0;
		
		int rev=0;
		int rem;
		
		int i=0;
		boolean flag=false;
		int k=1;
		while(number!=0) {
			rem=number%10;
			
				if(rem==0) {
					count++;
					flag=true;
				}
				else {
					k++;
				}
				rev=rev*10+rem;
				number/=10;
				
			
			
//			System.out.print(rem);
		}
		
		if(flag) {
		for(i=k;i<=count;i++) {
			System.out.print("0");
			}
			System.out.println(rev);
		}
		else {
			System.out.println("Reverse Number is "+rev +"\t"+count);
		}

		
//		

	}

}
