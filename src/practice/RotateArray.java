package practice;
import java.util.Scanner;

public class RotateArray {
	static void Rotatearray(int arr[],int index)
	{
		int j;
		System.out.println("Array before rotating");
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i=0;i<=index;i++)
		{
			int temp=arr[0];  
			for(j=0;j<=5-1;j++)
			{
				arr[j]=arr[j+1]; 
				
			}
			arr[5-1]=temp;
		}
		System.out.println("After rotating an array");
		for(int i=0;i<=5-1;i++)
		{
			System.out.println(arr[i]);
		}
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		int arr[]=new int[8];
		System.out.println("Enter Array Values : ");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter index number to rotate : ");
		int index=sc.nextInt();
		Rotatearray(arr,index);
	}

}
