package ex0710.collection;

import java.util.ArrayList;
import java.util.List;

public class StudentListExam {
	private List<Student> list=new ArrayList<Student>();
	/**
	 * �л��� ������ list�� ����
	 **/
	public void addList(Object[][] data){
		//list �߰�
		for(int i=0;i<data.length;i++){
			list.add(new Student((String)data[i][0],(Integer)data[i][1],(String)data[i][2]));
		}
	}
	
	/**
	 * list�� �ִ� �л��� ���� ��� ���
	 **/
	public void printList(){
		for(int i=0;i<list.size();i++){
			Student st=list.get(i);
			System.out.println(st);
		}
		
		System.out.println("������ for��");
		for(Student st:list){
			System.out.println(st);
		}
	}
	
	/**
	 * �̸��� �ش��ϴ� Student ��ü�� ã�Ƽ� �����ϴ� �޼ҵ� �ۼ�
	 */
	private Student search(String name){
		for(Student st:list){
			if(st.getName().equals(name)){
				return st; //�Լ��� ����������
			}
		}
		return null;
	}
	
	/**
	 * �̸��� �ش��ϴ� �л� ���� �˻�
	 **/
	public void searchByName(String name){
		Student st=this.search(name);
		if(st!=null)
			System.out.println(st);
		else
			System.out.println(name+"�� ������ �����ϴ�.");
	}
	
/*	public void searchByName(String name){
		for(Student st:list){
			if(st.getName().equals(name)){
				System.out.println(st);
				return; //�Լ��� ����������
			}
		}
		System.out.println(name+"�� ������ �����ϴ�.");
	}*/
	
	/**
	 * �̸��� �ش��ϴ� �л� ���� ����
	 **/
	public void deleteList(String name){
		Student st=search(name);
		if(st!=null){
			list.remove(st);
			System.out.println(name+"�л� ������ ���� �Ǿ����ϴ�.");
		}else{
		System.out.println(name+"�� ���� �̸����� �����Ұ��մϴ�.");
		}
	}
	
/*	public void deleteList(String name){
		for(Student st:list){
			if(st.getName().equals(name)){
				list.remove(st);
				System.out.println(name+"�л��� ������ �����Ǿ����ϴ�.");
				return; //�Լ��� ����������
			}
		}
		System.out.println(name+"�� ���� �̸����� �����Ұ��մϴ�.");
	}*/
	
	/**
	 * �̸��� �ش��ϴ� �л��� ����, �ּ� ����
	 **/
	public void updateList(Student st){
		Student searchSt=search(st.getName());
		if(searchSt!=null){
			//�� ����
			searchSt.setAge(st.getAge());
			searchSt.setAddr(st.getAddr());
		}else{
			System.out.println(st.getName()+"�� ������ ������ ���� �ʽ��ϴ�.");
		}
	}
	
	public static void main(String[] args){
		//�ʱ�ġ ������ �غ�
		Object data[][]={
				{"������", 20,"�Ǳ�"},	
				{"���߱�", 25,"�Ǳ�"},
				{"������", 25,"���ֵ�"},
				{"��ȿ��", 30,"����"},
				{"����", 27,"����"}
		};
		
		StudentListExam st=new StudentListExam(); 
		//1. �߰�
		st.addList(data);
		
		//2. ��� �˻�
		st.printList();
		
		//3. �̸����� �˻�
		System.out.println("�����ϴ� ���...");
		st.searchByName("������");
		
		System.out.println("�������� �ʴ� ���...");
		st.searchByName("����");
		
		//4. �̸����� ����
		st.deleteList("������");
		st.deleteList("������");
		st.printList();
		
		System.out.println("�����ϱ� - �����Ϸ�");
		st.updateList(new Student("������",50,"�뱸"));
		st.printList();
	}
}
