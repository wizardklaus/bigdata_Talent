package ex0705.mvcModeling;
/**
 * ����� ��û�� �ش��ϴ� ��� ���� ��
 */

public class EndView {

	/**
	 * �������� ���
	 */
	
	public static void printMessage(String message){
		System.out.println(message);
	}
	/**
	 * ��ü���ڵ� ���
	 */
	public static void printSelectAll(StudentVo [] stArr){
		System.out.println("*****��ü �л� ����*****");
		
		
		for(StudentVo st :stArr){
			System.out.println(st);
			//System.out.println("�̸� : " + st.getName()+"\t");
			//System.out.println("���� : " + st.getAge()+"\t");
			//System.out.println("�ּ� : " + st.getAddr()+"\t");
			 
		}
	}
	/**
	 * �κз��ڵ� ���
	 */

	
}
