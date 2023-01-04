package what;
//인스턴스를 하나만 생성?
public class What {
	// ctrl shift L >>이클립스 전체 단축키
	public static void main(String[] args) {
		
		Human h1 = Human.getInstance();
		Human h2 = Human.getInstance();
		System.out.println(h1==h2);
		
		
	}
}
//나중에 DB 연결할 때(p243)>>커넥션을 사용할 때
class Human{
	
	private static Human human = new Human();
	//		하나만 사용하게 하기 위해서
	
//	private Human() {}
	
	public static Human getInstance() {	//하나의 개체를 만들때 사용
		//static 안 붙은 메소드는 객체 생성 후에 실행해야 합니다.
		//우리는 지금 인스턴스없이 사용하려고 하는데
		//static 이 없으면 인스턴스를 넘겨줄 수 없기 때문에 붙여줘야함
		return human;
	}
}




