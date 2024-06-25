package ArrayPractice;


class ArrayParant{
	
	int a[];
	public void setArray(int a[]) {
		this.a=a;
	}
	
	public void getseq() {
		int i,j;
		System.out.println("Before Sorting Array : ");
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
}

class ArrangeAss extends ArrayParant{
	
	public void getseq() {
		int i,j;
		int index;
		for(i=0;i<a.length;i++) {
			index=i;
			for(j=i+1;j<a.length;j++) {
				if(a[index]>a[j])
				{
					index=j;
				}
			}
			int c=a[i];
			a[i]=a[index];
			a[index]=c;
		}
		System.out.println("After Sorting Array : ");
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}
	

}
class ReverseArray extends ArrayParant{
	
	public void getseq() {
		int i,j;
		int end=a.length;
		for(i=0;i<a.length/2;i++) {
			int n=a[i];
			a[i]=a[end-1];
			a[end-1]=n;
			end--;
		}
		
		System.out.println("After Reverse Array : ");
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
}
public class OverridingApp {

	public static void main(String[] args) {
		int a[]= {1,5,9,2,7,8};
		ArrayParant ap=new ArrayParant();
		ap.setArray(a);
		ap.getseq();
		System.out.println();
		ArrangeAss as=new ArrangeAss();
		System.out.println();
		as.setArray(a);
		as.getseq();
		System.out.println();
		ReverseArray r=new ReverseArray();
		r.setArray(a);
		r.getseq();

	}

}
