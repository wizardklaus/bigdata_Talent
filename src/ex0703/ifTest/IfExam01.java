package ex0703.ifTest;
import java.util.Scanner;

public class IfExam01 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ��� : ");
		int var=sc.nextInt();
		
		if(var%2==0)
			System.out.println(var+"�� ¦���Դϴ�.");
		else
			System.out.println(var+"�� Ȧ���Դϴ�.");
	}
}