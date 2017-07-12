package ex0710.collection;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoSetExam {
	private Set<Integer> set=new TreeSet<>();
	
	/**
	 * �ζǹ�ȣ �߰�
	 */
	public void addSet(){
		Random r=new Random();
		
		while(set.size()<6){
			int no=r.nextInt(45)+1;
			set.add(no);
		}
	}
	
	/**
	 * ��ȣ ���
	 */
	public void printSet(){
//		System.out.println(set);
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()){
			int no=it.next();
			System.out.print(no+"|");
		}
	}
	
	public static void main(String[] args){
		LottoSetExam le=new LottoSetExam();
		le.addSet();
		le.printSet();
	}
}