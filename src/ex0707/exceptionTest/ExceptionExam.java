package ex0707.exceptionTest;

public class ExceptionExam {

	public static void main(String[] args) {
		System.out.println("메인시작");
		
//		try{
//			String data=args[0];
//			System.out.println("입력값 : "+data);
//		}catch(Exception e){
//			System.out.println(e);
//			}
		
		try{
			String data=args[0]; //ArrayIndexOutOfBoundsException
			System.out.println("입력값 : "+data);
			
			int no=Integer.parseInt(data); //NumberFormatException
			System.out.println("변환값 no"+no);
			
			int result=100/no;
			System.out.println("나눈 결과 result : "+result);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("반드시 인수 넣어주세요 : e"+e);
			}catch(NumberFormatException e){
				System.out.println("숫자만 입력해주세요 : "+e.getMessage());
			}catch(Exception e){
				e.printStackTrace();
			}
		System.out.println("메인 끝")
		;
	}
}