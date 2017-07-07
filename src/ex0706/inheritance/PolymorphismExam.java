package ex0706.inheritance;

class CarCenter{
	public void engineer(Car cd){
		System.out.print(cd.carname+" 수리완료!\t");
		System.out.println("청구비용"+cd.cost+" 원");
		System.out.println("cd주소 : "+cd);
		
		if(cd instanceof EfSonata){
			EfSonata efs=(EfSonata)cd;
			System.out.println("efs주소 : "+efs);
			System.out.println("ef.a = "+efs.a);
		}
	}
}

public class PolymorphismExam{
	public static void main(String[] args) {
		
		CarCenter cc=new CarCenter();
		EfSonata ef=new EfSonata("소나타",5000);
		Canival ca=new Canival("카니발",7000);
		Excel ex=new Excel("악셀",2500);
		
		Car c= new Car();
		
//		cc.engineer(c);
//		cc.engineer(ca);
//		cc.engineer(ex);
		
		System.out.println("ef주소 : "+ef);
		System.out.println("ef.a = "+ef.a);
		cc.engineer(ef);

	
	}
}
