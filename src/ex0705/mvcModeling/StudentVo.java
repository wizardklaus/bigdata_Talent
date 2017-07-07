package ex0705.mvcModeling;
/**
 *학생 정보를 담음 객체(저장소)
 */
public class StudentVo {

	private String name;
	private int age;
	private String addr;
	
	public StudentVo(){
	}
	public StudentVo(String name, int age, String addr){
		this.name=name;
		this.age=age;
		this.addr=addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String toString(){
		return (getName()+getAge()+getAddr());
	}
	
	
}
