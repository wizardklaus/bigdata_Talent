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
	   super("�ȳ�");
       System.out.println(6);
   }
}
//////////////////////////////////////////////
class InheritanceConstructorExam{
	public static void main(String[] args) {
//		 new Child(); //1 4
		 new Child(20); //1 5
		//new Child(true);
		/*��� : �ڽĻ����ɶ� �θ��� �⺻������ ȣ��ȴ�.
		          �ڽĻ����� ������ ù�ٿ� super()�����Ǿ� �ִ�.
				  �ڽ��� �μ��ִ� �����ڸ� ȣ���ϴ��� �θ���
				  �⺻�������ʿ��ϴ�.*/

	
	  //����, 1,2,3 ���ٸ�(�θ� �����ڸ� �ϳ��� �ۼ����� �ʾ������)
/*	   new Child(); // ����
		new Child(20); //����
		new Child(true);//����
*/      /*
	    ���: �����ڸ� �ϳ��� �ۼ����� ������ �ڵ����� �⺻������ ���ԵǹǷ�
		      �θ� �����ڸ��ϳ��� �ۼ����� �ʾƵ� ���� ����
	  */

	  System.out.println("----------------------------");
	  //����, 1���� ����, 2,3���� �����ϴ� ���!!!
	   /* -> �ڽĻ����� ������ ù�ٿ��� ��� �����߻�
	      => �θ𰡻����ڸ� �ۼ��Ҷ� �⺻������ ���� �ۼ��Ͽ��� ������
			  �⺻�����ڰ� �ڵ����� ���� ���� �����Ƿ� �����߻�.
			  �ذ��ϱ� ���ؼ��� �ڽĻ����ڿ��� �ٸ� �����ڸ� ������
			  ȣ���������ν� �ذᰡ���ϴ�. */
/*
			  new Child(10);//
*/
	}
}
