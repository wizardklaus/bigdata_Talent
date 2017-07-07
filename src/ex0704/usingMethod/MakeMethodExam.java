package ex0704.usingMethod;
//MakeMethodExam.java
class MakeMethodExam{
	
	public static void main(String[] args){
		MakeMethodExam mme=new MakeMethodExam();
		int k=mme.methodExam01(33);
		System.out.println(k);
		mme.methodExam02();
		mme.methodExam03(42);
		String s = mme.methodExam04(17);
		System.out.println(s);
	}
	
	private int methodExam01(int i){
		System.out.println(i);
		return i*2;
	}
	
	public void methodExam02(){
		System.out.println("뭐 어떻게 하시겠어요~");
	}
	
	void methodExam03(int i){
		if(i%2==0)
			System.out.println("받아들인 숫자는 짝수로군요 !");
		else
			System.out.println("받아들인 숫자인 홀수로군요 !");
	}
	
	protected String methodExam04(int i){
		System.out.println(i);
		String st=new String();
		
		if(i%2==0)
			st="짝수";
		else
			st="홀수";
		
		return st;
	}
}