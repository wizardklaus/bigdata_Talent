package ex0706.jobProblem;

public class FullTime extends Employee{
	private int salary;
	private int bonus;
	
	public FullTime(){}
	
	public FullTime(int empno, String ename, String job, int mgr, String hiredate, String deptname,int salary, int bonus) {
		super(empno, ename, job, mgr, hiredate, deptname);
		this.salary=salary;
		this.bonus=bonus;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "FullTime [salary=" + salary + ", bonus=" + bonus + "]";
	}
	
	public void message(){
		System.out.println(getEname()+"사원은 정규직입니다.");
	}
}
