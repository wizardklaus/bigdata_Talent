package ex0705.mvcModeling;
/**
 * 사용자 요청에 해당하는 결과 정보 뷰
 */

public class EndView {

	/**
	 * 성공여부 출력
	 */
	
	public static void printMessage(String message){
		System.out.println(message);
	}
	/**
	 * 전체레코드 출력
	 */
	public static void printSelectAll(StudentVo [] stArr){
		System.out.println("*****전체 학생 정보*****");
		
		
		for(StudentVo st :stArr){
			System.out.println(st);
			//System.out.println("이름 : " + st.getName()+"\t");
			//System.out.println("나이 : " + st.getAge()+"\t");
			//System.out.println("주소 : " + st.getAddr()+"\t");
			 
		}
	}
	/**
	 * 부분레코드 출력
	 */

	
}
