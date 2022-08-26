package chap04_if;

import java.util.Scanner;

public class Ifelseif {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("주민번호 뒷자리 두번째 숫자를 입력하세요 :");
		int code = input.nextInt();
		if (code == 1 || code == 3) {
			System.out.println("남자입니다");
		}// else if 통해서 다른 조건문을 작성해 줄수가 있다
		 else if (code == 2 || code == 4) {
			System.out.println("여자입니다");
		}// 여기서 else문은 바로 위에있는 조건이 거짓(false)일때 실행
		 else {
			System.out.println("4이하의 숫자를 입력해주세요");
		}
		// 실습 연속적 if - else if - else
				// 음수, 양수, 0 판별하기
				int x = 0;
				if (x > 0) {
					System.out.println("양수입니다");
				} else if (x < 0) {
					System.out.println("음수입니다");
				} else {
					System.out.println("0입니다");
				}
	}
}
