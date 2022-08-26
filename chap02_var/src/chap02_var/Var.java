package chap02_var;

public class Var {
	public static void main(String[] args) {
		int speed; //변수 선언
		long interertRate = 1; //변수 초기화 : 선언과 값을 넣어주는것
		int 반복횟수, loop2 ; // 변수 동시 선언
		
		// 선언을 한 경우 변수 이름에다가 값을 넣음
		speed = 10;
		반복횟수 = 2;
		loop2 = 20;
		
		// 변수는 값을 할당할때 마지막에 할당된 값이 들어간다.
		speed = 0; // 위에서는 10이였지만 0의값을 넣어주었기 때문에 값이 0이 된다.
		
		// 변수를 출력을 하기위해서는 이름만 작성한다
		System.out.println(speed);
		System.out.println(반복횟수);
		
		//실습  정수형 변수 선언/초기화 하기
		int age = 26;
		int date = 10;
		int amount = 5000;
		int count = 5;
		int score = 100;
		
		
		System.out.println(age);
		System.out.println(date);
		System.out.println(amount);
		System.out.println(count);
		System.out.println(score);
		
		// 실습 long 변수
		// long 초기화시 int의 범위를 지난 값은 L을 붙여준다.
		long 거리 = 9460800000000L;
		long 속도 =300000; //변수는 동일한 이름을 선언할수 없다.
		// print메소드 안에 수식을 작성하면 계산하여 출력한다.
		System.out.println(거리/속도);
		
		// 실습 실수 double형
		// 반지름이 10인 구의 부피 구하기
		// 변수의 값에 계산식도 들어갈수 있다.
		double Volume = 4 / 3 * 3.14 * 10 * 10 * 10;
		System.out.println(Volume);
		
		//기호 상수(final) - 값을 수정하여 할당할수 없다.
		//초기화 값을 바꾸어서 원하는 값을 넣을 수 있다
		final double PI = 3.141592;
		System.out.println(PI);
		
		final int LINE = 4;
		// 변수는 변수끼리 계산한 값도 할당할 수 있다
		int Volume1 = LINE*LINE*LINE;
		System.out.println(Volume1);
		
		// boolean 논리형 - 참, 거짓 두 가지 값만 가지는 자료형
		boolean isRain = false; // 0과 같은 정수값은 넣을수 없다.
		System.out.println(isRain);//false로 출력되지만 boolean값이다.
		
		// num 값을 30으로 바꿔서 확인하기
		int num=10;
		boolean check;
		check =(num>20);
		System.out.println(check);
	}

}
