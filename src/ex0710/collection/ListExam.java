package ex0710.collection;

import java.util.ArrayList;

public class ListExam extends ArrayList<String>{
	public ListExam(){}
	public ListExam(int i){
		super(i);
	}
	
	/*
	 * list�� ������ ����(�̸� ����)�ϴ� �޼ҵ� �ۼ�
	 */
	public void addList(String[] names){
		for(String name : names){
			if(!this.contains(name))
				this.add(name);
		}
	}
	
	/*
	 * list�ȿ� �ִ� ������ ��� �޼ҵ� �ۼ�
	 */
	public void printList(){
		int size=super.size();
		System.out.println("�� ����� ���� : "+size);
		
		for(int i=0;i<size;i++){
			String name=super.get(i);
			System.out.println(name);
		}
		
		System.out.println("������ for������ ��ȯ");
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
