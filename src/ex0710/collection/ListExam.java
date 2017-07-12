package ex0710.collection;

import java.util.ArrayList;

public class ListExam extends ArrayList<String>{
	public ListExam(){}
	public ListExam(int i){
		super(i);
	}
	
	/*
	 * list에 데이터 저장(이름 저장)하는 메소드 작성
	 */
	public void addList(String[] names){
		for(String name : names){
			if(!this.contains(name))
				this.add(name);
		}
	}
	
	/*
	 * list안에 있는 데이터 출력 메소드 작성
	 */
	public void printList(){
		int size=super.size();
		System.out.println("총 저장된 갯수 : "+size);
		
		for(int i=0;i<size;i++){
			String name=super.get(i);
			System.out.println(name);
		}
		
		System.out.println("개선된 for문으로 변환");
		for(String name:this){
			System.out.println(name);
		}
	}
	
	public static void main(String[] args){
		ListExam ex=new ListExam(5);
		ex.addList(args);
		
		ex.printList();
	}
}
