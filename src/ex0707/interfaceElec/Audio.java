package ex0707.interfaceElec;

public class Audio extends Elec implements ElecFunction {
	private int volumn;
	
	public Audio() {	}

	public Audio(int volumn) {
		super();
		this.volumn = volumn;
	}
	
	public Audio(String code, int cost, int volumn) {
		super(code, cost);
		this.volumn=volumn;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void start() {
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
		return super.toString()+"Audio [volumn=" + volumn + "]";
	}
}
