package ex0706.arrayTest;

public class MainApp {

   public MainApp(){};
   
   public static void main(String[] args) {
	   MainApp app=new MainApp();
	   
	   FullTime []full = new FullTime[3];
	   full[0] = new FullTime(10, "���缮", "���׿��", 0 , "2013-05-01", "���ѵ���",8500,200);
	   full[1] = new FullTime(20, "�ڸ��", "����",10, "2013-06-20", "���ѵ���",7500,100);
	   full[2] = new FullTime(30, "������", "������",10 , "2013-06-22", "���ѵ���",6000,0);
	   
	   //printFullTime(full []);
	   System.out.println(full[0]);
	   app.printFullTime(full);
      }
   
   void printFullTime(FullTime []f){
       System.out.println("*****FullTime ����*****");
       
       for(FullTime element : f){
          System.out.println(f);
          System.out.println("���: " + element.getEmpNo()+"|");
          System.out.println("���� : " + element.getEName()+"|");
          System.out.println("����: " + element.getJob()+"|");
          System.out.println("��� : " + element.getMgr()+"|");
          System.out.println("����: " + element.getHiredate()+"|");
          System.out.println("�μ� : " + element.getDeptName()+"|");
          System.out.println("���� : " + element.getSalary()+"|");
          System.out.println("���ʽ� : " + element.getBonus()+"|");
       }
   }
}
