package ex0707.exception;

class Over18 extends Exception{
	public Over18(String e){
		super(e);
		System.out.println(e);
	}
}

class ShoppingMall{
	int age;
	
	public ShoppingMall(){}
	public ShoppingMall(int age){
		this.age=age;
	}
	
	void yourAge(int age) throws Over18{
		if(age>=18)
			System.out.println("�ȳ��ϼ���, "+age+"�� ����^^");
		else
			throw new Over18("���̰�..");
	}
	
/*	if(age<18){
		Over18 ex=new Over18("�ֵ��� ����");
		throw ex;
	}*/
}

public class MakingException {
	public static void main(String[] args){
		ShoppingMall shop=new ShoppingMall();
		int age;
		int total=0;
		
		for(int i=0;i<10;i++){
			try{
				age=(int)(Math.random()*55+1);
				shop.yourAge(age);
			}catch(Over18 e){
				e.getMessage();
				total+=1;
			}
		}
/*		try{
			for(int i=0;i<10;i++){
				age=(int)(Math.random()*55+1);
				shop.yourAge(age);
			}
		}catch(Over18 e){
			total+=1;
		}*/
		System.out.println("����ģ �̼����� �� : "+total);
	}
}