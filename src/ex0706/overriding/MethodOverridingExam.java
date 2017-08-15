package ex0706.overriding;

class SuperClass{ //MethodOverridingExam.java << �� class�� �������� ������.
 	protected int intNumber;

 	protected String memberString="Sting in SuperClass";
 	SuperClass(){
 		System.out.println("������ SuperClass()�� ȣ��Ǿ����ϴ�.");
 	}
 	public void methodZero(){
 		System.out.println("SuperClass��ü�� methodZero()�޼ҵ尡 ȣ��Ǿ����ϴ�.");		
		System.out.println("intNumber="+intNumber+"\t"+"memberString="+memberString);
	}
 	
 	protected void methodOwn(){
 		System.out.println("SuperClass��ü�� methodOwn()�޼ҵ尡 ȣ��Ǿ����ϴ�.");
		System.out.println("intNumber="+intNumber+"\t"+"memberString="+memberString);
 	}
 	
	int methodTwo(int i){
 		intNumber=i;
 		System.out.println("SuperClass��ü�� methodTwo(int i)�޼ҵ尡 ȣ��Ǿ����ϴ�.");
 		System.out.println("intNumber="+intNumber+"\t"+"memberString="+memberString);
 		return intNumber;
 	}
 	
	protected String methodThree(int i, String s){
 		intNumber=i;
 		memberString=s;
 		System.out.println("SuperClass��ü�� methodThree(int i, String s)�޼ҵ尡 ȣ��Ǿ����ϴ�.");
 		System.out.println("intNumber="+intNumber+"\t"+"memberString="+memberString);
 		return i+s;
 	}
 	
	public void methodFour(){
 		memberString="methodFour invokes methodOwn";
 		methodOwn();
 	}
}
//SubClass�� Error�� �����ϰ� Error�� ������ �ּ����� �ۼ��ϼ���.

/*overrriding�� �⺻����
	����Ÿ��,�޼ҵ��̸�,�μ� ���ƾ��Ѵ�
	modifier�� ���ų� Ŀ���Ѵ�.
*/

class SubClass extends SuperClass{
	SubClass(){
		memberString = "SubClass�� �����ڰ� �Է��� String";
 		System.out.println("������ SubClass()�� ȣ��Ǿ����ϴ�.");
 	}
 	
	public void methodZero(){
		System.out.println("SubClass��ü�� methodZero()�޼ҵ尡 ȣ��Ǿ����ϴ�.");
		System.out.println("intNumber="+intNumber+"\t"+"memberString="+memberString);
	}
 	
	public void methodOwn(){
		System.out.println("SubClass��ü�� methodOwn()�޼ҵ尡 ȣ��Ǿ����ϴ�.");
 		System.out.println("intNumber="+intNumber+"\t"+"memberString="+memberString);
 	}
 	
	int methodTwo(int a){	
		intNumber=a;
 		System.out.println("SubClass��ü�� methodTwo()�޼ҵ尡 ȣ��Ǿ����ϴ�.");
 		System.out.println("intNumber="+intNumber+"\t"+"memberString="+memberString);
		return intNumber; 
 	}
 	
	String methodThree(String s, int k){
		intNumber=k;
 		memberString=s;
 		System.out.println("SubClass��ü�� methodThree()�޼ҵ尡 ȣ��Ǿ����ϴ�.");
 		System.out.println("intNumber="+intNumber+"\t"+"memberString="+memberString);
 		return memberString;
 	}
	
	public String methodThree(int k,String str){
		intNumber=k;
 		memberString=str;
 		System.out.println("SubClass��ü�� methodThree()�޼ҵ尡 ȣ��Ǿ����ϴ�.");
 		System.out.println("intNumber="+intNumber+"\t"+"memberString="+memberString);
 		return memberString;
 	}
 	
	public void methodFour(){	
		System.out.println("SubClass�� public double methodFour()�� ȣ��Ǿ����ϴ�.");
 		memberString="methodFour invokes methodOwn";
 		methodOwn();
 	}
}

//�� class�� �������� ������.
class MethodOverridingExam{
	public static void main(String [] args){
		SuperClass sp = new SuperClass();
		System.out.println("**************************************");
		SubClass sb = new SubClass();		
		System.out.println("**************************************");
		
		sp.methodZero();
		sp.methodOwn();
		sp.methodTwo(2);
		sp.methodThree(3, "MethodOverridingExam.java");
		sp.methodFour();
		System.out.println("**************************************");
		
		sb.methodZero();
		sb.methodOwn();
		sb.methodTwo(2222);
		sb.methodThree(3333, "�� MethodOverridingExam.java");
		sb.methodFour();	
	}
}					
