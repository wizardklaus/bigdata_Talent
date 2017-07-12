package ex0705.array;

class ArrayExam{
	static int a[]=new int[]{1,2,3,4,5};
	static double b[]=new double[]{1.1,2.2,3.3,4.4,5.5};
	static char c[]=new char[]{'a','b','c','d','e'};
	static boolean d[]=new boolean[]{true,false,true,false,true};
	static String e[]=new String[]{"a","b","c","d","e"};
	
	public static void main(String[] args){
		ArrayExam ae=new ArrayExam();
		ae.printArrayValue01();
		ae.printArrayValue02();
		ae.printArrayValue03();
	}
	
	void printArrayValue01(){
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);
		for(int i=0;i<c.length;i++)
			System.out.println(c[i]);
		for(int i=0;i<d.length;i++)
			System.out.println(d[i]);
		for(int i=0;i<e.length;i++)
			System.out.println(e[i]);
	}
	
	void printArrayValue02(){
		
		String str[]={"1","2","3","4","5"};
		
		for(int i=0;i<a.length;i++)
			a[i]=i;
		for(int i=0;i<b.length;i++)
			b[i]=i;
		for(int i=0;i<c.length;i++)
			c[i]='i';
		for(int i=0;i<d.length;i++)
			d[i]=true;
		for(int i=0;i<e.length;i++)
			e[i]=str[i];
	}
	
	void printArrayValue03(){
		this.printArrayValue01();
	}
}