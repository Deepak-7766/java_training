package String.org;
import java.util.*;

public class Mostrepetedwords {

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		str=sc.nextLine();
		
		int i,j;
		int count=0,count1=0;
		char ch = 0;
		char []arr=str.toCharArray();
		for(i=0;i<arr.length;i++) {
			count=1;
			for(j=i+1;j<arr.length;j++) {
				if((arr[i]==arr[j])) {
					count++;
				}
			}
			if(count>count1) {
				count1=count;
				ch=arr[i];
			}
			
			
		}
		System.out.println("Most repeting character is "+ch +"");

	}

}
