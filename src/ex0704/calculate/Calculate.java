package ex0704.calculate;

import java.util.Scanner;

public class Calculate {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i,j;
		String k=new String();
		System.out.println("숫자 1을 입력");
		i=sc.nextInt();
		System.out.println("연산기호를 입력");
		k=sc.next();
		System.out.println("숫자 2를 입력");
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
			System.out.println("수행할 수 없는 연산입니다.");
	}
}
