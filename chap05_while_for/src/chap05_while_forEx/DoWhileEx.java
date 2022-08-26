package chap05_while_forEx;

import java.util.Scanner;

public class DoWhileEx {
	public static void main(String[] args) {
		// 실습 do while
		// 1~10까지의 내용 출력
		int num=1;
		do {
			System.out.println(num); // 1출력
			num++; // num의 값 증가
		} while (num <= 10);
		
	// do while - 업다운 게임
	// 반복 조건 - 59이 아니면 반복한다.
	// 반복 내용 - 입력받은 값을 59와 비교해서 작은지 큰지 알려준다.
	Scanner input = new Scanner(System.in);
	int result = 59;
	int x=0;
	int sum =0;
	do { sum += 1;
		System.out.print("추측값을 적어주세요 :");
		x = input.nextInt();
		if (x > result) {
			System.out.println("정답값보다 큽니다");
		}else if (x < result) {
			System.out.println("정답값보다 작습니다");
		}
		
	}while( x != result);
	// 정답은 반복문을 빠져나와서 한번만 출력
	System.out.println("축하합니다! 시도횟수 ="+sum);
	}
}
