package ex0705.mvcModeling;

public class StartView {
	public static void main(String[] args) {
		//�ʱ�ġ ������ �غ�
		String data[][]={
				{"������", "20","�Ǳ�"},	
				{"���߱�", "25","�Ǳ�"},
				{"������", "25","���ֵ�"},
				{"��ȿ��", "30","����"},
				{"����", "27","����"}
		};
	   //1.���
		StudentController controller =new StudentController();
		controller.insert(data);
		
	   //2.��ü�˻�
		controller.selectAll();
		
	   //3.�κа˻�
	}
}