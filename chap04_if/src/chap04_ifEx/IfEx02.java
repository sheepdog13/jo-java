package chap04_ifEx;

import java.util.Scanner;

public class IfEx02 {
	public static void main(String[] args) {
		// 실습 코드값을 이용한 성별 확인
		// 1,3 들어왔을때 -남자입니다
		// 2,4 들어왔을때 -여자입니다
		int code = 1;
		//내 풀이
		/*if (code == 1)
			System.out.println("남");
		if (code == 3)
			System.out.println("남");
		if (code == 2)
			System.out.println("여");
		if (code == 4)
			System.out.println("여");*/
		// 선생님 풀이
		if ( code == 1 || code == 3)
			System.out.println("남자입니다");
		else {
			// 중첩 조건문
			// if문 또는 else 안에서 작성 가능하다
			if (code == 2 || code == 4) {
			System.out.println("여자입니다");
			} else
				System.out.println("4이하의 수를 초기화하세요");
		}
		// 실습 - 중첩 if
		// 홀수짝수/ 음수양수 판단
		Scanner input = new Scanner(System.in);
		System.out.print("0이 아닌 정수를 입력해주세요 :");
		int x = input.nextInt();
		if ( x%2 == 0 ) {
			System.out.println("짝수입니다.");
			if (x < 0) {
				System.out.println("음수입니다.");
			} else {
				System.out.println("양수입니다.");
			}
		} else {
			System.out.println("홀수입니다.");
			if (x < 0) {
				System.out.println("음수입니다.");
			} else {
				System.out.println("양수입니다.");
			}
		} 
	}

}
