package ex0705.mvcModeling;
/**
 * ����� ��û�� �ش��ϴ� ��� ���� ��
 * */
public class EndView {
  /**
   * ��������(�޽���) ���
   * */
	public static void printMessage(String message){
		System.out.println(message);
	}
	
  /**
   * ��ü���ڵ� ���
   * */
	public static void printSelectAll(StudentVo [] stArr){
		System.out.println("***��ü �л� ����********");
		for(StudentVo st :stArr){
			System.out.println(st.toString()); //�ּҰ�
			/*System.out.print("�̸� : "+ st.getName()+"\t");
			System.out.print("���� : "+ st.getAge()+"\t");
			System.out.print("�ּ� : "+ st.getAddr()+"\n");*/
		}
	}
   /**
    * �κз��ڵ� ���
    * */
}