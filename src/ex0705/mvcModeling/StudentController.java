package ex0705.mvcModeling;
/**
 * ����� ��û�� �޾� �׿� �ش��ϴ� Model����(Service)�� ȣ���ϰ�
 * �� ����� �޾� ����������� �̵�.
 * */
public class StudentController {
	private StudentService service =new StudentService();
	
	/**
	 * ����ϱ�
	 * */
	public void insert(String data [][]){
		if( service.insert(data)){
			EndView.printMessage("����� �Ϸ�Ǿ����ϴ�.");
		}else{
			EndView.printMessage("��ϵ��� �ʾҽ��ϴ�.");
		}
	}
	
	/**
	 * �˻��ϱ�
	 * */
	public void selectAll(){
		StudentVo [] stArr = service.selectAll();
		EndView.printSelectAll(stArr);
	}
}