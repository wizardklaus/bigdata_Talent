package codding0704.grading;

import java.util.Scanner;

public class Grading02 {
	public static void main(String[] args){
		Grading gd=new Grading();
		Scanner sc=new Scanner(System.in);
		
		int lang, eng, math;
		String name=new String();
		
		System.out.println("��������� �����Ͻÿ�");
		lang=sc.nextInt();
		System.out.println("���������� �����Ͻÿ�");
		eng=sc.nextInt();
		System.out.println("���������� �����Ͻÿ�");
		math=sc.nextInt();
		System.out.println("�̸��� �����Ͻÿ�");
		name=sc.next();
		gd.getGrade(lang,eng,math,name);
	}
}

class Grading{
	private int lang, eng, math, total;
	private double average;
	private String name=new String();
	private String grade=new String();
	
	public void Grading(){
	}
	
	private int getTotal(int lang, int eng, int math){
		total=lang+eng+math;
		return total;
	}
	
	private double getAverage(int total){
		average=total/3;
		return average;
	}
	
	private String getMygrade(double average){
		switch (((int)average/10)){
		case 10 :
			grade="��"; break;
		case 9 :
			grade="��"; break;
		case 8 :
			grade="��"; break;
		case 7 :
			grade="��"; break;
		case 6 :
			grade="��"; break;
		case 5 :
			grade="��"; break;
		case 4 :
			grade="��"; break;
		default :
			grade="��"; break;	
		}
		return grade;
	}
	public void getGrade(int lang, int eng, int math, String name){
		getTotal(lang,eng,math);
		getAverage(total);
		getMygrade(average);
		
		System.out.println(name+"�� ���������� "+lang+", ���������� "+eng+", ���������� "+math
				+"�̴�. ������ "+total+"���� ����� "+average+", ���� �� ������ \""+grade+"\"�̴�.");
	}
}