package ex0710.collection;

import java.util.ArrayList;
import java.util.List;

public class StudentListExam {
	private List<Student> list=new ArrayList<Student>();
	/**
	 * 학생의 정보를 list에 저장
	 **/
	public void addList(Object[][] data){
		//list 추가
		for(int i=0;i<data.length;i++){
			list.add(new Student((String)data[i][0],(Integer)data[i][1],(String)data[i][2]));
		}
	}
	
	/**
	 * list에 있는 학생의 정보 모두 출력
	 **/
	public void printList(){
		for(int i=0;i<list.size();i++){
			Student st=list.get(i);
			System.out.println(st);
		}
		
		System.out.println("개선된 for문");
		for(Student st:list){
			System.out.println(st);
		}
	}
	
	/**
	 * 이름에 해당하는 Student 객체를 찾아서 리턴하는 메소드 작성
	 */
	private Student search(String name){
		for(Student st:list){
			if(st.getName().equals(name)){
				return st; //함수를 빠져나가라
			}
		}
		return null;
	}
	
	/**
	 * 이름에 해당하는 학생 정보 검색
	 **/
	public void searchByName(String name){
		Student st=this.search(name);
		if(st!=null)
			System.out.println(st);
		else
			System.out.println(name+"의 정보는 없습니다.");
	}
	
/*	public void searchByName(String name){
		for(Student st:list){
			if(st.getName().equals(name)){
				System.out.println(st);
				return; //함수를 빠져나가라
			}
		}
		System.out.println(name+"의 정보는 없습니다.");
	}*/
	
	/**
	 * 이름에 해당하는 학생 정보 삭제
	 **/
	public void deleteList(String name){
		Student st=search(name);
		if(st!=null){
			list.remove(st);
			System.out.println(name+"학생 정보가 삭제 되었습니다.");
		}else{
		System.out.println(name+"은 없는 이름으로 삭제불가합니다.");
		}
	}
	
/*	public void deleteList(String name){
		for(Student st:list){
			if(st.getName().equals(name)){
				list.remove(st);
				System.out.println(name+"학생의 정보가 삭제되었습니다.");
				return; //함수를 빠져나가라
			}
		}
		System.out.println(name+"은 없는 이름으로 삭제불가합니다.");
	}*/
	
	/**
	 * 이름에 해당하는 학생의 나이, 주소 변경
	 **/
	public void updateList(Student st){
		Student searchSt=search(st.getName());
		if(searchSt!=null){
			//값 변경
			searchSt.setAge(st.getAge());
			searchSt.setAddr(st.getAddr());
		}else{
			System.out.println(st.getName()+"의 정보는 수정이 되지 않습니다.");
		}
	}
	
	public static void main(String[] args){
		//초기치 데이터 준비
		Object data[][]={
				{"장희정", 20,"판교"},	
				{"송중기", 25,"판교"},
				{"송혜교", 25,"제주도"},
				{"이효리", 30,"서울"},
				{"원빈", 27,"대전"}
		};
		
		StudentListExam st=new StudentListExam(); 
		//1. 추가
		st.addList(data);
		
		//2. 모든 검색
		st.printList();
		
		//3. 이름으로 검색
		System.out.println("존재하는 경우...");
		st.searchByName("송혜교");
		
		System.out.println("존재하지 않는 경우...");
		st.searchByName("송해");
		
		//4. 이름으로 삭제
		st.deleteList("장희정");
		st.deleteList("장희정");
		st.printList();
		
		System.out.println("수정하기 - 수정완료");
		st.updateList(new Student("송혜교",50,"대구"));
		st.printList();
	}
}
