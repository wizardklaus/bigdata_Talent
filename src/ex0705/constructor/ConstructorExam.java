package ex0705.constructor;

//ConstructorExam.java
class Puppy{
	static String st="Hello";
	static int in=5;
	
	void printPuppyName(){
		System.out.println("public void printPuppyName() ȣ��Ǿ����ϴ�!");
		System.out.println("st = "+st+"in = "+in);
	}
	//String,int  Ÿ�� ���� ���� ����(member ��������)
	
	/*	�޼ҵ� printPuppyName�ۼ�
		�μ�����, ���Ͼ���
		"public void printPuppyName() ȣ��Ǿ����ϴ�!"���
		���������� ���
	*/	
	
	public Puppy(){
		System.out.println("������ public Puppy() ȣ��Ǿ����ϴ� !");
		this.printPuppyName();
		st="�޸�";
		in=-98998;
	}
	
	/*�μ��� ���� ������ �ۼ�
		"������ public Puppy() ȣ��Ǿ����ϴ�!"���
		printPuppyName�޼ҵ� ȣ��
			�������� String��"�޸�" �Ҵ�
		�������� int�� -98998 �Ҵ�
	*/
			
		
}
class ConstructorExam{
	//���θ޼ҵ忡��
	public static void main(String [] agrs){
	//Puppy��ü ����
	Puppy pup=new Puppy();
	pup.printPuppyName();
		
	//Puppy��ü�� printPuppyName�޼ҵ� ȣ��
		
	}
}
			
