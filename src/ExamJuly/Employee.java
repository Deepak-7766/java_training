package ExamJuly;

public class Employee {

	private int id;
	private String name;
	private int sal;
	private int totalWorking;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public void setTotalWorking(int totalWorking) {
		this.totalWorking = totalWorking;
	}
	public void setOt(int ot) {
		this.ot = ot;
	}
	public void setTotalwork(int totalwork) {
		this.totalwork = totalwork;
	}
	public void setTotalpay(int totalpay) {
		this.totalpay = totalpay;
	}
	public String getName() {
		return name;
	}
	public int getSal() {
		return sal;
	}
	public int getTotalWorking() {
		return totalWorking;
	}
	public int getOt() {
		return ot;
	}
	public int getTotalwork() {
		return totalwork;
	}
	public int getTotalpay() {
		return totalpay;
	}
	private int ot;
	private int totalwork,totalpay;
	
	public Employee(int id,
					String name,
					int sal,
					int totalWorking,
					int ot) 
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.totalWorking=totalWorking;
		this.ot=ot;
	}
	public void display() {
		totalpay=totalWorking*50;
		
		System.out.println(id+"\t"+name+"\t"+sal+"\t"+totalWorking+"\t"+ot+"\t"+"\t"+totalpay);
	}
	

}
