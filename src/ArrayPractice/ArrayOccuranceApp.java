package ArrayPractice;
class Arrays{
	
	int a[];
	public void setArray(int a[]) {
		this.a=a;
	}
	public void getOccurance() {
		int i,j;
		int count=0;
		for(i=0;i<a.length;i++) {
			count=1;
			for(j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			System.out.println(a[i]+" = "+count);
		}
	}
}
public class ArrayOccuranceApp {

	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,2,4,1,6,2};
		System.out.println();
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		Arrays aa=new Arrays();
		aa.setArray(a);
		aa.getOccurance();
	}

}
