package ex0704.grading;

public class Codding0703 {
	public static void main(String[] args){
		String myName=new String("�ְ���");
		int lang, eng, math, total;
		double average;
		String grade=new String();
		
		lang=(int)(Math.random()*56+45);
		eng=(int)(Math.random()*56+45);
		math=(int)(Math.random()*56+45);
		
		total=lang+eng+math;
		average=total/3;
		
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
		}
		
		System.out.println(myName+"�� ���������� "+lang+", ���������� "+eng+", ���������� "+math
				+"�̴�. ������ "+total+"���� ����� "+average+", ���� �� ������ \""+grade+"\"�̴�.");
	}
}