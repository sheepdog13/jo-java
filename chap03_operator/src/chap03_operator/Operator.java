package chap03_operator;

public class Operator {

	public static void main(String[] args) {
		// 연산자
		// 산술연산자와 대입연산자
		
		int x,y;
		x = 10;
		y = 3;
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y); // int끼리 나눗셈은 int형으로 나옴
		System.out.println(x%y); // int끼리 나머지는 int형으로 나옴
		
		// 대입연산자(=) : 오른쪽의 식을 계산한 후에 변수에 대입
		// 계산식이 끝난 후에 값을 할당하기때문에 int형에서 double형으로 형변환만 하게된다
		double sum = 10+20+x;
		double sum7 = x/y;
		System.out.println(sum);
		System.out.println(sum7);
		
		int sum1 = 10+20+30+40+50;
		int mult1 = 10*20*30*40;
		int sum2 = 10*(20+30)+40;
		System.out.println(sum1);
		System.out.println(mult1);
		System.out.println(sum2);
		
		// 실습 산술 연산자2
		int result = 80/3;
		int resultRest = 80%3;
		
		System.out.println(result); // 몫 : 26
		System.out.println(resultRest); // 나머지 : 2
		System.out.println(26*3+2); // 80이 나오므로 계산확인.
		
		// 나머지 연산자의 계산결과의 특징
		// 1. 항상 정수로만 나온다.
		// 2. 값의 범위가 정해져있다(0 ~ 나누는 수)
		double resultDouble = 80.0/3.0;
		
		System.out.println(resultDouble); // 소수점 자리까지 나옴
		
		// 실습 연산자 결합규칙
		// 11.5 > 실수형이 들어가 있어서 결과가 실수형으로 출력
		System.out.println(30.0/20+30-10*2);
		// 41 > 정수형으로 들어가 있어서 정수형으로 출력
		// 괄호를 통해 순서가 바뀌었기때문에 값의 차이가 남
		System.out.println(30/20+(30-10)*2);
		
		
		}

}
