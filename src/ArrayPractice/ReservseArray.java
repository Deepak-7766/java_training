package ArrayPractice;

public class ReservseArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int i,j,len=arr.length-1;
		System.out.println("Before Reverse ..");
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println("-------------------");
		for(i=0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[len];
			arr[len]=temp;
			len--;
			
		}
		System.out.println("---------------");
		System.out.println("After Reverse ..");
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}

}
