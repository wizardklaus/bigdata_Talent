package ex0706.superex;

class Super{
	int a=10;
	int b=5;
	public void aa(){
      System.out.println(1);
	}
	public void bb(){
      System.out.println(2);
	}
}
////////////////////////////////////////
class Sub extends Super{
	int a=20;
	int c=50;
	public void aa(){//재정의(overriding)
		System.out.println(3);
      /* System.out.println(a);//20
	   System.out.println(this.a);//20
	   System.out.println(super.a);//10
    
	   System.out.println("=======================");
	   System.out.println(b);//
	   System.out.println(this.b);//
	   System.out.println(super.b);//

       System.out.println("=======================");
	   System.out.println(c);//
	   System.out.println(this.c);//
	   //System.out.println(super.c);//오류 */
	}
	public void cc(){
       aa();// 3
	   this.aa();//3
	   super.aa();//1

	   System.out.println("-----------------------");
	   bb();//2
	   this.bb();//2
	   super.bb();//2

	   System.out.println("-----------------------");
	   dd();//4
	   this.dd();//4
	   //super.dd();// 자식에 있는 메소드를 super로는 접근 안됨

	}
    public void dd(){
       System.out.println(4);
	}
}
////////////////////////////////////
class SuperKeywordExam {
	public static void main(String[] args) {
		//new Sub().aa();

		//new Sub().cc();

		Sub s1 = new Sub(); //자식부분 부모부분 모두 접근가능(자식부분우선!)
		System.out.println(s1.a);//20
		System.out.println(s1.b);//5
		System.out.println(s1.c);//50

		System.out.println("--------------------");
		s1.aa();// 3
		s1.bb();//2
		s1.dd();//4

		System.out.println("---------------------");
		Super s2 = new Sub();//부모부분만 접근가능!
		System.out.println(s2.a);// 10
		System.out.println(s2.b);//
		//System.out.println(s2.c);//자식부분이므로 접근안됨.

		System.out.println("---------------------");
		s2.aa(); //3 (재정의된 메소드는 부모타입변수라도 반드시 자식부분호출)
		s2.bb();
		//s2.dd(); //자식부분이므로 접근안됨

      System.out.println("---------------------");
		// 부모타입 변수 s2로 자식부분 접근안되므로 ObjectDownCasting필요함
		Sub s3 =(Sub)s2;
        System.out.println(s3.c);
		s3.dd();

		System.out.println("s2주소값:"+s2);
		System.out.println("s3주소값:"+s3);
	}
}
