package ex0707.interfaceElec;

public class Tv extends Elec implements ElecFunction {
	int chnnel;
	
	public Tv() {	}
	
	public Tv(int chnnel) {
		super();
		this.chnnel = chnnel;
	}

	public Tv(String code, int cost, int chnnel) {
		super(code, cost);
		this.chnnel=chnnel;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void start() {
		// TODO Auto-generated method stub
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub	
	}

	@Override
	public String toString() {
		return super.toString()+"Tv [chnnel=" + chnnel + "]";
	}
}