package ex0706.inheritance;

class CarCenter{
	public void engineer(Car cd){
		System.out.print(cd.carname+" �����Ϸ�!\t");
		System.out.println("û�����"+cd.cost+" ��");
		System.out.println("cd�ּ� : "+cd);
		
		if(cd instanceof EfSonata){
			EfSonata efs=(EfSonata)cd;
			System.out.println("efs�ּ� : "+efs);
			System.out.println("ef.a = "+efs.a);
		}
	}
}

public class PolymorphismExam{
	public static void main(String[] args) {
		
		CarCenter cc=new CarCenter();
		EfSonata ef=new EfSonata("�ҳ�Ÿ",5000);
		Canival ca=new Canival("ī�Ϲ�",7000);
		Excel ex=new Excel("�Ǽ�",2500);
		
		Car c= new Car();
		
//		cc.engineer(c);
//		cc.engineer(ca);
//		cc.engineer(ex);
		
		System.out.println("ef�ּ� : "+ef);
		System.out.println("ef.a = "+ef.a);
		cc.engineer(ef);

	
	}
}
