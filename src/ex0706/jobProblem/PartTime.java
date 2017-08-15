package ex0706.jobProblem;

public class PartTime extends Employee{
	private int timepay;
	
	public PartTime(){}

	public PartTime(int empno, String ename, String job, int mgr, String hiredate, String deptname, int timepay) {
		super(empno, ename, job, mgr, hiredate, deptname);
		this.timepay=timepay;
	}

	public int getTimepay() {
		return timepay;
	}

	public void setTimepay(int timepay) {
		this.timepay = timepay;
	}

	@Override
	public String toString() {
		return "PartTime [timepay=" + timepay + "]";
	}

	public void message(){
		System.out.println(getEname()+"사원은 비정규직입니다.");
	}
}
