package ex0705.mvcModeling;

public class StartView {
	public static void main(String[] args) {
		//초기치 데이터 준비
		String data[][]={
				{"장희정", "20","판교"},	
				{"송중기", "25","판교"},
				{"송혜교", "25","제주도"},
				{"이효리", "30","서울"},
				{"원빈", "27","대전"}
		};
	   //1.등록
		StudentController controller =new StudentController();
		controller.insert(data);
		
	   //2.전체검색
		controller.selectAll();
		
	   //3.부분검색
	}
}