package ex0706.inheritance;

class Car{
	public String carname;
	public int cost;
	
	protected void printAttributes(){
		System.out.println("carname="+carname+"\tcost="+cost);
		}
}

class EfSonata extends Car{
	int a=50;
	public EfSonata(String carname,int cost){
		this.carname=carname;
		this.cost=cost;
	}
}

class Excel extends Car{
	public Excel(String carname,int cost){
		this.carname=carname;
		this.cost=cost;
	}
}

class Canival extends Car{
	public Canival(String carname,int cost){
		this.carname=carname;
		this.cost=cost;
	}
}

public class InheritanceExam{
	public static void main(String[] args){
		Car ca=new Car();
		EfSonata ef=new EfSonata("EF¼Ò³ªÅ¸",2000);
		Excel ex=new Excel("¿¢¼¿",1500);
		Canival cani=new Canival("Ä«´Ï¹ß",3000);

		ca.printAttributes();
		ef.printAttributes();
		ex.printAttributes();
		cani.printAttributes();
	}
}

