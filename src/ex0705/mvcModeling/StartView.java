package ex0705.mvcModeling;

public class StartView {

	public static void main(String[] args) {
		//초기치 데이터 준비
		String data[][] = {{"김종경","26","판교"},
						  {"이미숙","22","서울"},
						  {"김미순","25","부산"},
						  {"송중기","33","발리"},
						  {"송혜교","49","알파"}};
		
		
		//등록
		
		StudentController controller = new StudentController();
		controller.insert(data);
		
		//전체검색..
		controller.selectAll();
		//부분검색..
		
		
	}

}
