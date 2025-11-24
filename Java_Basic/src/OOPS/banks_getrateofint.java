package OOPS;

class sbi extends getrateofint{

	@Override
	int getrateofint1() {
		// TODO Auto-generated method stub
		return 8;
	}
	
}
class bob extends getrateofint{@Override
	int getrateofint1() {
		// TODO Auto-generated method stub
		return 8;
	}}
public class banks_getrateofint {

	public static void main(String[] args) {
		sbi s = new sbi();
		System.out.println("SBI rate of intrest is " + s.getrateofint1());
		bob b = new bob();
		System.out.println("BOB intrest rate is " + b.getrateofint1());
	}
}
