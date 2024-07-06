package mcq.org;


class Abc{
	public void a(char k)
	{
		System.out.println(k);
	}
}
public class MostRepeting {

	public static void main(String[] args) {
		String str="ssseeke";
		int count1=0;
		Abc a1=new Abc();
		int k=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length-1;i++)
		{
			int count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			if(count>=count1)
			{
				count1=count;
				//System.out.println(ch[i]+"sdf");
				if(count==count1)
				{
					char cc=ch[i];
				  	a1.a(cc);
				}
				k=i;
				
			}
		}
		//System.out.println(ch[k]);

	}

}