package String.org;

public class ReverseStringWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	
		
			String name="akash chat gthm";
			
			int i,j;
			int first=0;
			char charArray[]=name.toCharArray();
			int start=0,len=charArray.length-1,s=0,end;
			System.out.println(name.length());
			for(i=0;i<name.length();i++) {
				
				System.out.println(i);
				if( (name.length()-1)==i || name.charAt(i)==' ') {
					if(i==(name.length()-1)) {
						i++;
					}
					System.out.println("***********"+i);
					 end=i-1;
					for(start=s;start<end;start++) {
						int temp=charArray[start];
						charArray[start]=charArray[end];
						charArray[end]=(char) temp;
						
						end--;
					}
					s=i+1;
				}
				System.out.println(i+" "+name.charAt(i) +" "+charArray[i]);
				
				

				
				
			}
			
			
			System.out.println(name);
			System.out.println("---------------------");
			System.out.println(charArray);
	}

}
