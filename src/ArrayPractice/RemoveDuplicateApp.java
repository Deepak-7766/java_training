package ArrayPractice;


class RemoveDuplicate{
	int a[];
	public void setArray(int a[]) {
		this.a=a;
	}
	public void remove1() {
		int i,j;
		int count=0;
		for(i=0;i<a.length-1;i++)
		{
			for(j=i+1;j<a.length-1;j++) {
				if(a[i]==a[j]) {
					count++;
					for(int k=i;k<a.length-1;k++) {
						a[k]=a[k+1];
					}
				}
			}
		}
		System.out.println();
		--count;
		int b[]=null;
		System.out.println("After Removing Duplicate Values : ");
		for(i=0;i<a.length-count;i++) {
			a[i]=a[i];
		}
		System.out.println("..........-----------..........-------.........--------...............");
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}
}
public class RemoveDuplicateApp {

	public static void main(String[] args) {
	
		int a[]= {1,3,2,4,1,8,3,5};
		System.out.println("Before Duplicating :");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		RemoveDuplicate r=new RemoveDuplicate();
		r.setArray(a);
		r.remove1();
	}

}
