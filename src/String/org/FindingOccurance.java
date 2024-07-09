package String.org;

public class FindingOccurance {

	public static void main(String[] args) {
		String str="hello world";
		
		int i,j,count=0;
		char ch[]=str.toCharArray();
		boolean b[]=new boolean[str.length()];
		for(i=0;i<ch.length;i++) {
			count=0;
			if(b[i]) {
				continue;
			}
		
			for(j=i;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					b[j]=true;
				}
			}
			System.out.println(ch[i]+" = "+count);
			
		}

	}

}
