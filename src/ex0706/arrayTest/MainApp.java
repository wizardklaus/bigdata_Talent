package ex0706.arrayTest;

public class MainApp {

   public MainApp(){};
   
   public static void main(String[] args) {
	   MainApp app=new MainApp();
	   
	   FullTime []full = new FullTime[3];
	   full[0] = new FullTime(10, "유재석", "개그우먼", 0 , "2013-05-01", "무한도전",8500,200);
	   full[1] = new FullTime(20, "박명수", "가수",10, "2013-06-20", "무한도전",7500,100);
	   full[2] = new FullTime(30, "정준하", "예능인",10 , "2013-06-22", "무한도전",6000,0);
	   
	   //printFullTime(full []);
	   System.out.println(full[0]);
	   app.printFullTime(full);
      }
   
   void printFullTime(FullTime []f){
       System.out.println("*****FullTime 정보*****");
       
       for(FullTime element : f){
          System.out.println(f);
          System.out.println("사번: " + element.getEmpNo()+"|");
          System.out.println("나이 : " + element.getEName()+"|");
          System.out.println("직업: " + element.getJob()+"|");
          System.out.println("상관 : " + element.getMgr()+"|");
          System.out.println("일자: " + element.getHiredate()+"|");
          System.out.println("부서 : " + element.getDeptName()+"|");
          System.out.println("연봉 : " + element.getSalary()+"|");
          System.out.println("보너스 : " + element.getBonus()+"|");
       }
   }
}
