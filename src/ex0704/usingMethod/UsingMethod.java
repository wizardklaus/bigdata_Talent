package ex0704.usingMethod;
//UsingMethod.java
class UsingMethodExam{
	private int methodExam03_01(int i){
		System.out.println("methodExam03_01�� ȣ��Ǿ����ϴ�.");
		System.out.println(i);
		return i*2;
	}

	public String methodExam03_02(String i, int j){
		System.out.println("methodExam03_02�� ȣ��Ǿ����ϴ�.");
		System.out.println(i+"�ٺ�");
		System.out.println(this.methodExam03_01(j));
		return i+"�ٺ�";
	}
	
	void methodExam03_03(int i, String j){
		System.out.println("methodExam03_03�� ȣ��Ǿ����ϴ�.");
		this.methodExam03_02(j,i);
	}
	
	protected double methodExam03_04(int i, double j, int k){
		System.out.println("methodExam03_04�� ȣ��Ǿ����ϴ�.");
		MakeMethodExam02 mm2=new MakeMethodExam02();
		return mm2.methodExam02_04(i, j, k);
	}
}

class UsingMethod{
	public static void main(String[] args){
	UsingMethodExam using=new UsingMethodExam();
	int i=10, k=20;
	String j="������";
	double l=10.10;
	
	System.out.println(using.methodExam03_02(j, i));
	//System.out.println(using.methodExam03_03(i, j));
	System.out.println(using.methodExam03_04(i, l, k));
	}
}

  
