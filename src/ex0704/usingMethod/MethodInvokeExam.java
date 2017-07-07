package ex0704.usingMethod;

class Methodinvoke01{
	public int method01(int i, int j){
		System.out.println(i*j);
		return i*j;
	}
}

class Methodinvoke02{
	public int method02(int i, int j){
		System.out.println(i+j);
		return i+j;
	}
}

class MethodInvokeExam{
	public static void main(String []args){
		Methodinvoke01 in01=new Methodinvoke01();
		Methodinvoke02 in02=new Methodinvoke02();
		int i=2, j=3;
		in01.method01(i,j);
		in02.method02(i,j);
	}
}

