package ArrayPractice;


class SortArray{
	int arr[];
	public void setArray(int arr[]) {
		this.arr=arr;
	}
	public int[] getArray() {
		int i,j;
		
//		for(i=0;i<arr.length;i++) {
//			for(j=i+1;j<arr.length;j++) {
//				if(arr[i]>arr[j]) {
//					int num=arr[i];
//					arr[i]=arr[j];
//					arr[j]=num;
//				}
//			}
//		}
		int index;
		for(i=0;i<arr.length;i++) {
				index=i;
			for(j=i+1;j<arr.length;j++) {
				  if(arr[index]>arr[j]) {
					  index=j;
				  }
			}
			int c=arr[i];
			arr[i]=arr[index];
			arr[index]=c;
		}
		
		return arr;
	}
}
public class SortArrayApp {

	public static void main(String[] args) {
		int a[]= {0,4,12,6,9,23,4,6,1};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		SortArray sr=new SortArray();
		sr.setArray(a);
		a=sr.getArray();
		System.out.println("After Sorting an Array");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
