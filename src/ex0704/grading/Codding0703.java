package ex0704.grading;

public class Codding0703 {
	public static void main(String[] args){
		String myName=new String("최관현");
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
		}
		
		System.out.println(myName+"의 국어점수는 "+lang+", 영어점수는 "+eng+", 수학점수는 "+math
				+"이다. 총점은 "+total+"으로 평균이 "+average+", 따라서 총 학점은 \""+grade+"\"이다.");
	}
}