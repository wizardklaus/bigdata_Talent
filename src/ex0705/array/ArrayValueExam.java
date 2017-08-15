package ex0705.array;

class ArrayValue{
	String[] arr=new String[10];
	
	void printArrayvalue(){
//		for(int i=0;i<arr.length;i++)
//			System.out.println(arr[i]);
		for(String i : arr)
			System.out.println(i);
	}
}

class ArrayValueExam{
	public static void main(String args []){
		ArrayValue av=new ArrayValue();
		av.printArrayvalue();
	}
}