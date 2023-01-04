package abstract01;

import java.util.Arrays;
import java.util.Iterator;

public class Avengers {
	public static void main(String[] args) {
		Ironman ironman = new Ironman();
		Hulk hulk = new Hulk();
		Superman superman = new Superman();
		
//		ironman.attack();
//		hulk.attack();
//		superman.attack();
		
		//한꺼번에 공격가능?
		Hero[] aven = new Hero[3];
		aven[0] = ironman;		//부모타입이더라도 생성은 Ironman
		aven[1] = hulk;
		aven[2] = superman;
//		System.out.println(Arrays.toString(aven));
		for (int i = 0; i < aven.length; i++) {
//			aven[i].attack();
			
		}
		//이게 다형성이다!
		//부모	 =		자식
		Hero h1 = new Ironman();
		h1.attack();	//레이저
		h1.defense();	//방어
		((Ironman)h1).javis = "";
		((Ironman)h1).callJavis();
		Ironman h2 = (Ironman)h1;
		
//		Object obj = new Ironman();
//		부모타입, super타입으로 변환가능
		
/* 다형성
 * 다형성은 동적바인딩을 지원해야 합니다.
 * 런타임때 최종 타입이 결정되는 것
 * 다형성의 한계 : 상위 클래스에 만들어진 메소드에 한해서 가능
 * */		
		
		
	}
}
