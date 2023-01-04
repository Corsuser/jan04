package animal;
//추상클래스(p.329)
public abstract class Animal /*extends Object 이게 생략되어 있음*/ {
	//class에도 abstract(추상)을 붙여줘야 추상 클래스로 만들 수 있음
	protected int age;
	protected String name;
	//abstract : 추상화
	public abstract void sound();	//추상 메서드
	public abstract void add();		//상속받는 모든 클래스는 add 메서드를 강제적으로 만들야함
	
	public void eat() {
		System.out.println("먹이를 먹습니다.");
	}
	
	//추상화_인터페이스를 만들요소
}
