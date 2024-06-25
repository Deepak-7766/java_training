package ArrayPractice;

class FindMax1{
	int arr[];
	public void setArray(int arr[]) {
		this.arr=arr;
	}
	public int getMax() {
		
		int i,j;
		int max=0;
		int index=0;
		for(i=0;i<arr.length-1;i++) {
				if(arr[index]<arr[i+1]) {
					index=i+1;
				}
			
		}
		max=arr[index];
		return max;
	}
}

public class FindMax {
	public static void main(String x[]) {
		int i;
		int a[]={1,3,12,4,5,6};
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		FindMax1 f=new FindMax1();
		f.setArray(a);
		int result=f.getMax();
		System.out.println();
		System.out.println("Maximum Value is "+result);
	}
}
