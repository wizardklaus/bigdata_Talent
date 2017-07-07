package ex0705.mvcModeling;

/**
 * 실제 기능을 구현하는 클래스(알고리즘)
 */
public class StudentService {
	private StudentVo stArr [];

	/**
	 * 데이터 등록하기
	 * @return :true이면 등록성공
	 * @retrun :false이면 등록실패
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
	 * 모든 정보 검색
	 *
	 */
	public StudentVo[] selectAll(){
		return stArr;
	}
	
}
	
	
	
	
	




