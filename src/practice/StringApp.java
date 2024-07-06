package practice;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class StringApp {

	public static void main(String[] args) {
//	
//			Scanner sc=new Scanner(System.in);
//			System.out.println("Enetr String ");
//			String str=sc.nextLine();
//			StringBuffer b=new StringBuffer(str+" ");
//			System.out.println("Befor Concate String "+b);
//			System.out.println("Enter String to concate ");
//			String str1=sc.nextLine();
//			b.append(str1);
//			System.out.println("After String Concate "+b);
//			
//			String s="abcdtt";
//			
//			char[] ch=s.toCharArray();
//			int len=ch.length-1;
//			for(int i=0;i<ch.length/2;i++) {			
//				char temp=ch[i];
//				ch[i]=ch[len];
//				ch[len]=temp;
//				len--;
//			}
//			 s=new String(ch);
//			System.out.println(s);
		
			String ss="hello India";
			String charr[]=ss.split(" ");
			StringBuffer sb=new StringBuffer();
			
			for(int i=0;i<charr.length;i++) {
				char c[]=charr[i].toCharArray();
				int len=c.length-1;
				for(int j=0;j<c.length/2;j++) {
					char cc=c[j];
					c[j]=c[len];
					c[len]=cc;
					len--;
					
				}
				sb.append(c);
				sb.append(" ");
			}
//			if we try to handle cheked excpeion if there no chance to get cheked excpetion then
//			it will generate compile time excption
//			try {
//			System.out.println(ss);
//			System.out.println("---------------------");
//			System.out.println(sb);
//			}catch(IOException e) {
//				System.out.println("iii");
//			}
//			try {
//			File file=new File("D:\\d1.txt");
//			FileInputStream io=new FileInputStream(file);
//			String s1=io.readAllBytes().toString();
//		
//			System.out.println(io.read());
//			}
//			catch(IOException e) {
//				System.out.println(e);
//			}
			
		
			System.out.println(my());
	}
	
	public static int my() {
		try {
			System.out.println("This is try"+10/0);
			return 1;
		}
		catch(Exception e) {
			System.out.println(e+"Exception");
			return 2;
			
		}
		finally {
			return 3;
		}
	}

}

