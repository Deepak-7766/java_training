package ArrayPractice;

public class RotateByIndex {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int i,j;
		System.out.println("Before Rotating ..");
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println("-------------------");
		for(i=0;i<2;i++) {
			int temp=arr[0];
			for(j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=temp;
		}
		System.out.println("---------------");
		System.out.println("After Rotating ..");
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}

	}

}
