package dog;

import java.util.HashSet;
import java.util.Set;
import animal.Animal;
import animal.Human;

public class Dog extends Animal {
	
	//1-45 숫자 6개를 뽑아주는 개
	public Set<Integer> lotto(){
		Set<Integer> lotto = new HashSet<Integer>(); //HashSet : 중복제거
			while(lotto.size()<6) {
				lotto.add((int)(Math.random()*45)+1);
				System.out.println(lotto.size());
			}
			return lotto;
	}
	
	
	@Override
	public void sound() {
//		super.sound();
		System.out.println("멍멍....");
	}
	@Override
	public void add() {
		
	}

	public static void main(String[] args) {
//		Animal ani  = new Animal();
		
		Dog dog = new Dog();
		Human human = new Human();
//		human.ssn = "주민번호"; //같은 패키지가 아니여서 사용불가
		human.setSsn("940128");
		System.out.println(human.getSsn());
		
		Set<Integer>lotto = dog.lotto();
		System.out.println(lotto);
		System.out.println(dog.lotto());
	}
}
