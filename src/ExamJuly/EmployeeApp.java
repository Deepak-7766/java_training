package ExamJuly;

public class EmployeeApp {

	public static void main(String[] args) {
		System.out.println("Before Calculate OverTime");
		OverTime o=new OverTime();
		o.setInfo();
		System.out.println("After Calculate OverTime");
		o.calOverTime();
		

	}

}
