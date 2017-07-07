package ex0707.exceptionTest;

public class ExceptionExam {

	public static void main(String[] args) {
		System.out.println("���ν���");
		
//		try{
//			String data=args[0];
//			System.out.println("�Է°� : "+data);
//		}catch(Exception e){
//			System.out.println(e);
//			}
		
		try{
			String data=args[0]; //ArrayIndexOutOfBoundsException
			System.out.println("�Է°� : "+data);
			
			int no=Integer.parseInt(data); //NumberFormatException
			System.out.println("��ȯ�� no"+no);
			
			int result=100/no;
			System.out.println("���� ��� result : "+result);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("�ݵ�� �μ� �־��ּ��� : e"+e);
			}catch(NumberFormatException e){
				System.out.println("���ڸ� �Է����ּ��� : "+e.getMessage());
			}catch(Exception e){
				e.printStackTrace();
			}
		System.out.println("���� ��")
		;
	}
}