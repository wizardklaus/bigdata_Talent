package ex0705.mvcModeling;

/**
 * ���� ����� �����ϴ� Ŭ����(�˰���)
 */
public class StudentService {
	private StudentVo stArr [];

	/**
	 * ������ ����ϱ�
	 * @return :true�̸� ��ϼ���
	 * @retrun :false�̸� ��Ͻ���
	 */
	public boolean insert(String [][]data){
		stArr = new StudentVo[data.length];
		for(int i=0; i<data.length;i++){
			stArr[i]=this.create(data[i]);
	}
		if(stArr!=null&& stArr.length>0)return true;
		else return false;
	}
	public StudentVo create(String []row){
		return new StudentVo(row[0],Integer.parseInt(row[1]),row[2]);
	}
	
	/**
	 * ��� ���� �˻�
	 *
	 */
	public StudentVo[] selectAll(){
		return stArr;
	}
	
}
	
	
	
	
	




