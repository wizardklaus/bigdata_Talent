package ex0706.abstractFinal;


//Error �� �����ϰ� ������ �ּ����� ó���ϼ���.

final class FinalClassExam{//��ӺҰ�, ��������
 final int i =100 ; //���, ������Ұ�, �ݵ�� �ʱ�ȭ�ʼ�
}


abstract  class AbstractClassExam{//��Ӱ���, �����Ұ�.
    abstract String abstractMethodExam(int i,String s);   //��ɾ���, �����Ǹ� ���ؼ� ��� 
    final int finalMethodExam(int i, int j){ //�����ǺҰ�.
        return i+j;
    }
}


class Sample01 extends AbstractClassExam{
	String abstractMethodExam(int i,String s){
		System.out.println("return "+s+i);
		return s+i;
	}
	
	/*int finalMethodExam(int i, int j){//final�޼ҵ��̹Ƿ� ������ �Ұ�.
		return i*j;
	}*/
	
}

class Sample02 /*extends FinalClassExam*/{//finalŬ���� ��Ӿȵ�.

  }


 
 abstract class Sample03 extends AbstractClassExam{
	 String abstractMethodExam(int i,String s){
		return s+i;
	 }
	abstract String abstractMethodExam(String s,int i);    

	void sampleMethod03(){
		System.out.println("void sampleMethod03() ȣ�� ��");
	}
}

class AbstractFinalClassTest{
    public static void main(String args[]){
		AbstractClassExam ace /*= new AbstractClassExam()*/;//abstractŬ�����»����Ұ�. 
		FinalClassExam fce = new FinalClassExam();
		//fce.i=100000;//����̹Ƿ� ������Ұ�.
		Sample01 s01 = new Sample01();
		AbstractClassExam aceS01 = new Sample01();
		aceS01.abstractMethodExam(700,"_999");
	}
}
