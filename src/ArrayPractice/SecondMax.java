package ArrayPractice;

public class SecondMax {

	public static void main(String[] args) {
		int arr[]= {7,1,2,13,4,51,6,44};
		
		int i,j;
		for(int n:arr)
		System.out.println(n);
		int max=arr[0];
				int min=0;
		for(i=1;i<arr.length;i++) {
			
			if(max<arr[i]) {
				if(min<max) {
					min=max;
					}
				max=arr[i];
				
			}
		
		}
		System.out.println("--------------------");
		System.out.println(max+" "+min);
		
	}

}
