package ex0703.ifTest;
import java.util.Scanner;

public class IfExam01 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 : ");
		int var=sc.nextInt();
		
		if(var%2==0)
			System.out.println(var+"는 짝수입니다.");
		else
			System.out.println(var+"은 홀수입니다.");
	}
}