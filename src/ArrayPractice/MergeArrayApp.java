package ArrayPractice;

class MergeArray {
	int a[],b[],c[];
	public void setArray(int a[],int b[]) {
		this.a=a;
		this.b=b;
		
	}
	public int[] getMergerArray() {
		int len=b.length+a.length;
		int i,j;
		c=new int[len];
		for(i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(j=0;j<b.length;j++) {
			c[i]=b[j];
			i++;
		}
		
		return c;
	}
}
public class MergeArrayApp {

	public static void main(String[] args) {
		int a[]= {1,3,4,5,6};
		int []b= {5,6,7,8};
		
		MergeArray m=new MergeArray();
		m.setArray(a, b);
		int result[]=m.getMergerArray();
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		
	}

}
