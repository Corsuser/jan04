package abstract01;

public class Ironman extends Hero{
	String javis;
	@Override
	public void attack() {
		System.out.println("자비스! 레이저");
	}
	@Override
	public void defense() {
		System.out.println("방어");
	}
	public void callJavis() {
		System.out.println("javis, suit 가져와");
	}
}
