package ex0704.usingMethod;

class MakeMethodExam02{
	public static void main(String [] args){
       	MakeMethodExam02 mme = new MakeMethodExam02();
		System.out.println("mme : " + mme);

		int k = mme.methodExam02_01(33, 22);
		System.out.println(k);

       	String s = mme.methodExam02_02("������");
		System.out.println(s);

       	mme.methodExam02_03(42, "�̻Ѵ�");

       	double d = mme.methodExam02_04(7, 5.5, 8);
		System.out.println(d);
	}


  //���������� ����Ÿ�� �޼ҵ��̸�(�μ�,....){}
  private int methodExam02_01(int a, int b){ //33 22
	 int sum = a+b;
    System.out.println("�� ������ �� : " + sum); 
	if(sum%3==0)System.out.println("3�ǹ��!");

	return sum;
  }


public String methodExam02_02(String s){//������
    System.out.println(s+"�ٺ�");
	return s+"�ٺ�";
}


 void methodExam02_03(int i, String s){//42  �̻Ѵ�
	System.out.println(i+s);
	if(i%4==0)System.out.println(1);
	else System.out.println(0);
 }

 protected double methodExam02_04(int i, double j, int k){//7 5.5 8
  double result = i*j-k;
   System.out.println("������ : " + result);
   return result;
 }
	
}
