package ex0705.constructor;
class Puppy3{
	/*String Ÿ�� ���� ���� ����
		int Ÿ�� ���� ���� ����*/
	static String walwal;
	static int in;
		
	
	/*�μ��� ���� �������ۼ�
		String Ÿ�� ���������� "�޸�" �Ҵ�
		"puplic Puppy3()ȣ��Ǿ����ϴ�"���
		�������� ���
	*/		
	public Puppy3(){
		System.out.println("public Puppy3() ȣ��Ǿ����ϴ�.");
		System.out.println("walwal="+walwal+"in="+in);
	}
		
	
	
	/*String Ÿ���� �μ� 1���� �޴� �������ۼ�
		String Ÿ�� ���������� �μ� �Ҵ�
		"puplic Puppy3()ȣ��Ǿ����ϴ�"���
		�������� ���
	*/		
	public Puppy3(String st){
		System.out.println("public Puppy3() ȣ��Ǿ����ϴ�.");
		walwal=st;		
	}
		
	
	/*String Ÿ���� �μ� 2���� �޴� �������ۼ�
		�μ�2���� �ϳ��� String���� �����
		String Ÿ���� �μ� 1���� �޴� �����ڿ��� �μ��� �ָ� ȣ��
		"puplic Puppy3()ȣ��Ǿ����ϴ�"���
	*/		
	public Puppy3(String st1, String st2){
		walwal=st1+st2;
		System.out.println("public Puppy3() ȣ��Ǿ����ϴ�.");
	}
		
	
	
	/*boolean Ÿ���� �μ� 1���� �޴� �������ۼ�
		�μ��� "��"�� �ٿ� �ϳ��� String���� �����
		String Ÿ���� �μ� 1���� �޴� �����ڿ��� �μ��� �ָ� ȣ��
		"puplic Puppy3()ȣ��Ǿ����ϴ�"  ���
	*/					
	
	
	
	/*char Ÿ���� �μ� 1���� �޴� �������ۼ�
			�μ��� ���� �����ڸ� ȣ���ϰ�
			�μ��� ���� data�� intŸ�� ���������� �Ҵ�	
			"puplic Puppy3()ȣ��Ǿ����ϴ�"���
			int�� �����������
	*/			
		
	
	
	/*�޼ҵ� printMemberVariable
	���� ����
	���������� ���
	*/	
		

}

class ConstructorOverloadingExam{
		//���θ޼ҵ忡��
		public static void main(String [] args){
			//Puppy3 Ŭ������ �� �����ڸ� �ѹ��� �̿��� ��ü 5�� ����
			

	
			
		//�� ��ü�� printMemberVariable�޼ҵ带 �ѹ��� ȣ��
			
	}
}