package chap07_1_access;

import chap07_1_accessB.AccessB;

public class AccessTest {

	public static void main(String[] args) {
		// 같은 패키지 안에 들어있음
		AccessA a = new AccessA();
		a.printName();
		
		// 다른 패키지 안에 들어있는 클래스 접근
		// 패키지가 다르다면 import로 불러와야지 객체 생성이 가능하다
		AccessB b = new AccessB();
		// import로 불러와도 public 메소드가 아니면 사용이 안된다
		b.printName();
	}

}
