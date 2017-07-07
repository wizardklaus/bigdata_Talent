package codding0704.grading;

import java.util.Scanner;

public class Grading02 {
	public static void main(String[] args){
		Grading gd=new Grading();
		Scanner sc=new Scanner(System.in);
		
		int lang, eng, math;
		String name=new String();
		
		System.out.println("언어점수를 기입하시오");
		lang=sc.nextInt();
		System.out.println("영어점수를 기입하시오");
		eng=sc.nextInt();
		System.out.println("수학점수를 기입하시오");
		math=sc.nextInt();
		System.out.println("이름을 기입하시오");
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
			grade="수"; break;
		case 9 :
			grade="수"; break;
		case 8 :
			grade="우"; break;
		case 7 :
			grade="미"; break;
		case 6 :
			grade="양"; break;
		case 5 :
			grade="가"; break;
		case 4 :
			grade="가"; break;
		default :
			grade="가"; break;	
		}
		return grade;
	}
	public void getGrade(int lang, int eng, int math, String name){
		getTotal(lang,eng,math);
		getAverage(total);
		getMygrade(average);
		
		System.out.println(name+"의 국어점수는 "+lang+", 영어점수는 "+eng+", 수학점수는 "+math
				+"이다. 총점은 "+total+"으로 평균이 "+average+", 따라서 총 학점은 \""+grade+"\"이다.");
	}
}