package ex0705.mvcModeling;

public class StartView {

	public static void main(String[] args) {
		//�ʱ�ġ ������ �غ�
		String data[][] = {{"������","26","�Ǳ�"},
						  {"�̹̼�","22","����"},
						  {"��̼�","25","�λ�"},
						  {"���߱�","33","�߸�"},
						  {"������","49","����"}};
		
		
		//���
		
		StudentController controller = new StudentController();
		controller.insert(data);
		
		//��ü�˻�..
		controller.selectAll();
		//�κа˻�..
		
		
	}

}
