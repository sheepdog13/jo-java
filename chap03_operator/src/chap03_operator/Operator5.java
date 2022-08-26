package chap03_operator;

public class Operator5 {
	public static void main(String[] args) {
		// 논리연산자 (&&, ||, !)
		// 논리형(boolean > true/false)을 계산하는 연산자
		boolean x = true;
		boolean y = false;
		// && and연산자는 true && true 일때 결과가 true가 나온다
		// 하나라도 false 이면 결과가 false가 나온다.
		System.out.println(x && y);// false
		// || or연산자는 하나라도 true이면 결과가 true가 나온다
		// false || false일 경우 결과가 false가 나온다
		System.out.println(x || y);// true
		
		// ! not연산자를 사용하면 원래값을 부정(반대)한 값이 나온다
		// true --> false, fale --> true
		System.out.println(!x);//false
		System.out.println(!y);//true
		
		System.out.println("=============================");
		//실습 논리 연산자
		int x1 = 20; int y1 = 40;
		System.out.println(x1==20 && y1==20);// false
		System.out.println(x1==20 && y1==40);// true
		System.out.println(x1==20 || y1==10);// true
		System.out.println(x1==10 || y1==10);// false
		System.out.println(x1==20 && y1!=20);// true
		System.out.println(!(x1==10));// true
				
	}

}
