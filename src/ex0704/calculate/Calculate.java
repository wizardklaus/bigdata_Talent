package ex0704.calculate;

import java.util.Scanner;

public class Calculate {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i,j;
		String k=new String();
		System.out.println("���� 1�� �Է�");
		i=sc.nextInt();
		System.out.println("�����ȣ�� �Է�");
		k=sc.next();
		System.out.println("���� 2�� �Է�");
		j=sc.nextInt();
		
		Cal c=new Cal();
		c.Cal(i,j,k);
	}
}

class Cal{
	public void Cal(int i, int j, String k){
		if(k.equals("+")){
			System.out.printf("%d + %d = %d",i,j,i+j);
			System.out.println();
		}
		else if(k.equals("-")){
			System.out.printf("%d - %d = %d",i,j,i-j);
			System.out.println();
		}
		else if(k.equals("*")){
			System.out.printf("%d * %d = %d",i,j,i*j);
			System.out.println();
		}
		else if(k.equals("/")){
			System.out.printf("%d / %d = %d",i,j,i/j);
			System.out.println();
		}
		else
			System.out.println("������ �� ���� �����Դϴ�.");
	}
}
