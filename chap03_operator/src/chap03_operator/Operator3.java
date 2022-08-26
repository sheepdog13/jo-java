package chap03_operator;

public class Operator3 {
	public static void main(String[] args) {
		// 복합대입 연산자
		// 동일한 변수안에서 값을 바꿔서 혹은 계산해서 사용할때 쓰는방법
		
		// 10, 20, 30, 40 더해서 결과값 확인하기
		// int sum3 = 10+20+30+40; //한꺼번해 더해서 계산하는법
		
		// 만약에 한꺼번에 계산할수 없고
		// 한 코드가 끝날 때 그 값을 추가해서 더해야하는 경우
		int sum3 = 0; // 처음 값
		
		//sum3 = 10; // sum3에 값이 대입해서 들어감(할당)
		
		sum3 = sum3 + 10; // 0(sum3) + 10
		sum3 = sum3 + 20; // 10(sum3) + 20
		sum3 = sum3 + 30; // 30(sum3) + 30
		sum3 = sum3 + 40; // 60(sum3) + 50
		
		System.out.println(sum3);
		
		// 복합대입연산자 사용방법 (*=, /=, +=, -=)
		int mult2 = 1;
		
		//mult2 = mult2 * 10;
		mult2 *= 10; // 곱셈과 대입 연산자를 복합해서 사용
		mult2 *= 20;
		mult2 *= 30;
		mult2 *= 40;
		
		System.out.println(mult2);
		
		// 실습 복합 대입 연산자
		int sum4 = 0;
		sum4 += 10;
		
		System.out.println(sum4);
		
		int mult3 = 1;
		mult3 *= 20;
		
		System.out.println(mult3);
		}
}
