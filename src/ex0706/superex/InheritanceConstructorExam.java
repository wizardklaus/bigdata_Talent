package ex0706.superex;

class Parent{
 /* Parent(){
    System.out.println(1);
  }*/
  Parent(int i){
      System.out.println(2);
  }
  Parent(String i){
      System.out.println(3);
  }
}
////////////////////////////////////////
class Child extends Parent{
   Child(){
	   super(3);
       System.out.println(4);
   }
   Child(int i){
	   this(true);
       System.out.println(5);
   }
   Child(boolean b){
	   super("안녕");
       System.out.println(6);
   }
}
//////////////////////////////////////////////
class InheritanceConstructorExam{
	public static void main(String[] args) {
//		 new Child(); //1 4
		 new Child(20); //1 5
		//new Child(true);
		/*결론 : 자식생성될때 부모의 기본생성자 호출된다.
		          자식생성자 구현부 첫줄에 super()생략되어 있다.
				  자식이 인수있는 생성자를 호출하더라도 부모의
				  기본생성자필요하다.*/

	
	  //만약, 1,2,3 없다면(부모가 생성자를 하나도 작성하지 않았을경우)
/*	   new Child(); // 성공
		new Child(20); //성공
		new Child(true);//성공
*/      /*
	    결론: 생성자를 하나도 작성하지 않으면 자동으로 기본생성자 삽입되므로
		      부모가 생성자를하나도 작성하지 않아도 오류 없다
	  */

	  System.out.println("----------------------------");
	  //만약, 1번은 없고, 2,3번만 존재하는 경우!!!
	   /* -> 자식생성자 구현부 첫줄에서 모두 오류발생
	      => 부모가생성자를 작성할때 기본생성자 없이 작성하였기 때무에
			  기본생성자가 자동으로 삽입 되지 않으므로 오류발생.
			  해결하기 위해서는 자식생성자에서 다른 생성자를 강제로
			  호출해줌으로써 해결가능하다. */
/*
			  new Child(10);//
*/
	}
}
