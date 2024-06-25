package ArrayPractice;

class ArraySum{
	int a[];
	public void setArrayValue(int a[]) {
		this.a=a;
	}
	
	
}
class getArraySum extends ArraySum{
	
	public int GetSum() {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		
		return sum;
	}
	
}
public class ArraySumApp {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		getArraySum g=new getArraySum();
		g.setArrayValue(a);
		System.out.println(g.GetSum());

	}

}
