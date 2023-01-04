package animal;

public class Human extends Animal{
	private String ssn;
	final static int NUM = 101;
	static int check = 500;
	
	//생성자
	
	
	
	//메서드
	
	public String getSsn() {
		return ssn;
	}
	@Override
	public void add() {
		
	}
	public void setSsn(String ssn) {
		System.out.println(13-ssn.length());
		if(ssn.length()<13) {
//			this.ssn = "잘못된 주민번호입력";
			//모자란 자리수만큼 *로 입력해서 저장하기
			
			String n="";
			for(int i=0; i<13-ssn.length(); i++) {
				System.out.println(ssn.length());
				n += "*";
			}
			ssn=ssn+n;
		}
		this.ssn = ssn;
	}
	int add(int num1, int num2){
		return num1+num2;
	}
	@Override
	public void sound() {
//	super.sound();
		System.out.println("하 추워...");
		
}
	
	public static void main(String[] args) {
		Human human = new Human();
		Human.check = 5000;	//static 붙은 녀석들은 class명.variable명
//		human.check = 100;	
//		human.NUM = 12222; final 수정불가
		int result = human.add(15, 30);
		human.setSsn("940128");
		System.out.println(human.getSsn());
	}

}
