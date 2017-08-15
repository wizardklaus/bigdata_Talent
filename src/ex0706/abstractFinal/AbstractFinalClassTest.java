package ex0706.abstractFinal;


//Error 를 수정하고 이유를 주석으로 처리하세요.

final class FinalClassExam{//상속불가, 생성가능
 final int i =100 ; //상수, 값변경불가, 반드시 초기화필수
}


abstract  class AbstractClassExam{//상속가능, 생성불가.
    abstract String abstractMethodExam(int i,String s);   //기능없고, 재정의를 위해서 사용 
    final int finalMethodExam(int i, int j){ //재정의불가.
        return i+j;
    }
}


class Sample01 extends AbstractClassExam{
	String abstractMethodExam(int i,String s){
		System.out.println("return "+s+i);
		return s+i;
	}
	
	/*int finalMethodExam(int i, int j){//final메소드이므로 재정의 불가.
		return i*j;
	}*/
	
}

class Sample02 /*extends FinalClassExam*/{//final클래스 상속안됨.

  }


 
 abstract class Sample03 extends AbstractClassExam{
	 String abstractMethodExam(int i,String s){
		return s+i;
	 }
	abstract String abstractMethodExam(String s,int i);    

	void sampleMethod03(){
		System.out.println("void sampleMethod03() 호출 됨");
	}
}

class AbstractFinalClassTest{
    public static void main(String args[]){
		AbstractClassExam ace /*= new AbstractClassExam()*/;//abstract클래스는생성불가. 
		FinalClassExam fce = new FinalClassExam();
		//fce.i=100000;//상수이므로 값변경불가.
		Sample01 s01 = new Sample01();
		AbstractClassExam aceS01 = new Sample01();
		aceS01.abstractMethodExam(700,"_999");
	}
}
