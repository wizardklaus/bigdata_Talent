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
	public void aa(){//������(overriding)
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
	   //System.out.println(super.c);//���� */
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
	   //super.dd();// �ڽĿ� �ִ� �޼ҵ带 super�δ� ���� �ȵ�

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

		Sub s1 = new Sub(); //�ڽĺκ� �θ�κ� ��� ���ٰ���(�ڽĺκп켱!)
		System.out.println(s1.a);//20
		System.out.println(s1.b);//5
		System.out.println(s1.c);//50

		System.out.println("--------------------");
		s1.aa();// 3
		s1.bb();//2
		s1.dd();//4

		System.out.println("---------------------");
		Super s2 = new Sub();//�θ�κи� ���ٰ���!
		System.out.println(s2.a);// 10
		System.out.println(s2.b);//
		//System.out.println(s2.c);//�ڽĺκ��̹Ƿ� ���پȵ�.

		System.out.println("---------------------");
		s2.aa(); //3 (�����ǵ� �޼ҵ�� �θ�Ÿ�Ժ����� �ݵ�� �ڽĺκ�ȣ��)
		s2.bb();
		//s2.dd(); //�ڽĺκ��̹Ƿ� ���پȵ�

      System.out.println("---------------------");
		// �θ�Ÿ�� ���� s2�� �ڽĺκ� ���پȵǹǷ� ObjectDownCasting�ʿ���
		Sub s3 =(Sub)s2;
        System.out.println(s3.c);
		s3.dd();

		System.out.println("s2�ּҰ�:"+s2);
		System.out.println("s3�ּҰ�:"+s3);
	}
}
