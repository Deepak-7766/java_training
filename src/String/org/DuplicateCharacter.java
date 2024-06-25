package String.org;
import java.util.*;
public class DuplicateCharacter {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str;
	System.out.println("Enter String ");
	str=sc.nextLine();
	int i,j;
	String temp="";
	char []arr=str.toCharArray();
	for(i=0;i<arr.length;i++) {
		
		for(j=i+1;j<arr.length;j++) {
			if((arr[i]==arr[j])) {
				temp=temp+arr[i];
				
			}
		}
		
	}
	System.out.println("Most repeting character is "+temp +"");

	}

}
