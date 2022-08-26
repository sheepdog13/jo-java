package chap05_while_forEx;

import java.util.Scanner;

public class ForEx {
	public static void main(String[] args) {
		// 반복할 숫자를 입력받은후 반복해서 더한 값 출력하기.
		Scanner input = new Scanner(System.in);
		System.out.print("더하기를 몇 번 반복할지 작성하세요 :");
		int repeat = input.nextInt();
		// 횟수만큼 반복해줄때는 초기값을 0으로 많이 둔다.
		for (int num = 0; num < repeat; num++) {
			System.out.print("두 수를 띄워서 작성하세요 :");
			int x = input.nextInt();// String 값이다
			int y = input.nextInt(); 
			System.out.println("결과 :"+(x + y));
		}
		                   // 1, 5, 7, 11,
		// 1~20까지의 정수중 2또는 3의 배수가 아닌 수의 총합.
		int result = 0;
		for (int num1 = 0 ; num1 < 20 ; num1++) {
			if ( num1 % 2 == 0 || num1 % 3 == 0) {
			}else {
				result += num1;
			}
		}System.out.println(result);
		// for문의 초기화값은 for문안에서만 사용이 가능하다
		for (int i = 0 ; i < 5 ; i++) {
			System.out.println("반복문입니다" + i);
		}
		// System.out.println(i); // for문 밖에서는 쓸수 없다.
		// 다른 for문에서 사용한 이름은 다른 for문에서 사용할 수있다
		for (int i = 0 ; i < 10; i++) {
			System.out.println("새로운 i를 이용한 반복문입니다"+i);
		}
		// 중첩 반복문 : 반복문 안에 반복문이 들어가 있는 형태
		for (int i = 0 ; i < 2 ; i++) {
			System.out.println("for문 i에서 반복중입니다");
			for (int j = 0 ; j < 2 ; j++) {
				System.out.println("i : "+i+", j : "+j);
			}
		}
		
	}

}
