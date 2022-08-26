package chap03_operator;

public class Operator2 {
	public static void main(String[] args) {
		// 단항 연산자
				int a = +10; // +붙여서 양수(붙이지않아도 양수)
				int b = -10; // -붙여서 음수
				
				System.out.println(a);
				System.out.println(b);
				
				// 전위 단항 연산자 (++,--)
				// 다른 연산을 하기전에 1증가,1감소 한다.
				int c = ++a; // 변수(a)앞에 사용해서 a값이 증가한다.
				System.out.println(c);
				
				++a; // a의 값이 1증가 : 12
				System.out.println(a);
				
				--a; // a의 값이 1감소 : 11
				System.out.println(a);
				
				// 후위 단항 연산자
				// 모든 연산이 끝난 후에 값을 1증가, 1감소 시킨다.
				int d = a++;
				System.out.println(d); // 11 : 값을 증가시키기전에 들어간 값
				System.out.println(a); // 12 : 이후에 1을 증가시킴
				
				a++; // a의 값이 1증가함 : 13
				System.out.println(a);
				
				// 실습 단항 연산자
				int minusX = 1;
				int minusY = 1;
				// 후위연산자를 사용해서 먼저 값이 출력된 후에 1이 감소한다
				System.out.println(minusX--); // 1
				// 전위연산자를 사용해서 값을 1감소한 후에 출력된다
				System.out.println(--minusY); // 0
				System.out.println(minusX); // 0
				System.out.println(minusY); // 0
	}

}
