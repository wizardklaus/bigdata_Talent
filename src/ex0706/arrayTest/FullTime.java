package ex0706.arrayTest;

public class FullTime {

   private int empNo;
   private String eName;
   private String job;
   private int mgr;
   private String hiredate;
   private String deptName;
   private int salary;
   private int bonus;
   
   public FullTime(){}
   public FullTime(int empNo, String eName, String job, int mgr, 
         String hiredate, String deptName, int salary, int bonus)
   {
      this.empNo=empNo;
      this.eName=eName;
      this.job=job;
      this.mgr=mgr;
      this.hiredate=hiredate;
      this.deptName=deptName;
      this.salary=salary;
      this.bonus=bonus;   
   }
   
   public int getEmpNo(){
      return empNo;
   }
   public void setEmpNo(int empNo){
      this.empNo=empNo;
   }
   
   public String getEName(){
      return eName;
   }
   public void setEName(String eName){
      this.eName=eName;
   }
   
   public String getJob(){
      return job;
   }
   public void setJob(String job){
      this.job=job;
   }
   
   public int getMgr(){
      return mgr;
   }
   public void setMgr(int mgr){
      this.mgr=mgr;
   }
   
   public String getHiredate(){
      return hiredate;
   }
   public void setHiredate(String hiredate){
      this.hiredate=hiredate;
   }
   
   public String getDeptName(){
      return deptName;
   }
   public void setDeptName(String deptName){
      this.deptName=deptName;
   }
   
   public int getSalary(){
      return salary;
   }
   public void setSalary(int salary){
      this.salary=salary;
   }
   
   public int getBonus(){
      return bonus;
   }
   public void setBonus(int bonus){
      this.bonus=bonus;
   }
   
   public void message(){
      //System.out.println("************** Message **************");
      System.out.println(this.eName+" ����� �������Դϴ�.");
   }
   
   @Override
   public String toString(){
      return (getEmpNo()+getEName()+getJob()+getMgr()+
            getHiredate()+getDeptName()+getSalary()+getBonus());
   }
}