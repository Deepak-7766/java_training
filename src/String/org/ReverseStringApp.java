package String.org;


class test{
	
	
}
public class ReverseStringApp {

	public static void main(String[] args) {
		String str="vikas";
		StringBuffer str1=new StringBuffer("Vikrant");
		int i;
		test t=new test();
		System.out.println(str+" hashCode : "+str.hashCode());
		System.out.println();
		System.out.println(str1+" hashcode : "+ str1.hashCode());
		
		str=str+"solanke";
		String s="vikas";
		
		System.out.println(s.hashCode()  );
		str1=str1.append("Jangle");
	
		System.out.println(str+" HachCode : "+str.hashCode());
		System.out.println();
		System.out.println(str1 +" HAshcode : "+str1.hashCode());
		
		
		
		
//		char ch[]=str.toCharArray();
//		int end=ch.length; 
//		System.out.println("STring Before Reverse "+str+" "+end);
//		
//		for(i=0;i<=end/2;i++) {
//			char c=ch[i];
//			ch[i]=ch[end-1];
//			ch[end-1]=c;
//			end--;
//		}
//		String s=ch.toString();
//		System.out.println(ch);
		
		
	}

}
