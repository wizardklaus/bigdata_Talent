package ex0705.mvcModeling;
/**
 * 사용자 요청을 받아 그에 해당하는 Model영역(Service)를 호출하고
 * 그 결과를 받아 결과뷰쪽으로 이동.
 * */
public class StudentController {
	private StudentService service =new StudentService();
	
	/**
	 * 등록하기
	 * */
	public void insert(String data [][]){
		if( service.insert(data)){
			EndView.printMessage("등록이 완료되었습니다.");
		}else{
			EndView.printMessage("등록되지 않았습니다.");
		}
	}
	
	/**
	 * 검색하기
	 * */
	public void selectAll(){
		StudentVo [] stArr = service.selectAll();
		EndView.printSelectAll(stArr);
	}
}