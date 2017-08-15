package ex0706.jobProblem;

	public class MainApp {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			
			Employee [] emp = new Employee[5];
			
			emp[0] = new FullTime(10, "���缮", "���׿��", 0 , "2013-05-01", "���ѵ���",8500,200);
			emp[1] = new FullTime(20, "�ڸ��", "����",10, "2013-06-20", "���ѵ���",7500,100);
			emp[2] = new FullTime(30, "������", "������",10 , "2013-06-22", "���ѵ���",6000,0);
			
			emp[3] = new PartTime(40, "��ȫö", "������",20 , "2014-05-01", "���ѵ���",20000);
			emp[4] = new PartTime(50, "����", "����",30 , "2014-05-02", "���ѵ���",25000);
			
			System.out.println("�ڡڡڡڡڡڡڡ�emp �����ڡڡڡڡڡڡڡڡ�"+"\n");
			for(int i=0; i<emp.length; i++){
			    System.out.println(emp[i]);
			}
			
			System.out.println("--------------------------");
			for(Employee e:emp)
			    System.out.println(e);
			
			System.out.println("�ڡڡڡڡڡڡڡڡ�message �����ڡڡڡڡڡڡڡڡ�"+"\n");
			for(int i=0 ;i<emp.length; i++){
				emp[i].message();
			}
			
			System.out.println("--------------");
			for(Employee e:emp){
				e.message();
			}
		
			
			
			
		}

	}
