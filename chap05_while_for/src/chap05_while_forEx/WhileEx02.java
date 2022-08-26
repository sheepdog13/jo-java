package chap05_while_forEx;

import java.util.Scanner;

public class WhileEx02 {
	public static void main(String[] args) {
		// 입력받은 모든 수를 더하는 프로그램
		// while문 사용 (조건, 반복내용)
		// 조건 - 0을 입력 받을때까지 모든 숫자 더함
		//        : == 관계연산자를 사용
		// 0이 들어왔을때 : 반복 멈춤
		// 다른 수가 들어왔을 때 : 계속해서 모든 숫자를 더함
		// 반복내용 - 모든 숫자를 더함
		//			  sum변수를 통해서 들어오는 값들을 더하여 저장
		Scanner input = new Scanner(System.in);
		int x = 1;
		int sum = 0;
		while (x != 0) {
			System.out.print("더할 수를 입력해주세요(0을 넣으면 종료) :");
			x = input.nextInt();
			sum += x;
			//while문이 끝나면 while문의 조건문으로 이동한다.
		}System.out.println("실행이 종료 됐습니다. 총합 :"+sum);
	}
}
