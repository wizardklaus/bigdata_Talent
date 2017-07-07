package ex0704.usingMethod;

class MakeMethodExam02{
	public static void main(String [] args){
       	MakeMethodExam02 mme = new MakeMethodExam02();
		System.out.println("mme : " + mme);

		int k = mme.methodExam02_01(33, 22);
		System.out.println(k);

       	String s = mme.methodExam02_02("장희정");
		System.out.println(s);

       	mme.methodExam02_03(42, "이뿌니");

       	double d = mme.methodExam02_04(7, 5.5, 8);
		System.out.println(d);
	}


  //접근제한자 리턴타입 메소드이름(인수,....){}
  private int methodExam02_01(int a, int b){ //33 22
	 int sum = a+b;
    System.out.println("두 정수의 합 : " + sum); 
	if(sum%3==0)System.out.println("3의배수!");

	return sum;
  }


public String methodExam02_02(String s){//장희정
    System.out.println(s+"바보");
	return s+"바보";
}


 void methodExam02_03(int i, String s){//42  이뿌니
	System.out.println(i+s);
	if(i%4==0)System.out.println(1);
	else System.out.println(0);
 }

 protected double methodExam02_04(int i, double j, int k){//7 5.5 8
  double result = i*j-k;
   System.out.println("연산결과 : " + result);
   return result;
 }
	
}
