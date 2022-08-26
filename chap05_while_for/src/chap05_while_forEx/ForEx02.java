package chap05_while_forEx;

public class ForEx02 {
	public static void main(String[] args) {
	// 중첩 반복문 - 구구단 2~9
	for (int i = 2; i < 10 ; i++) {
		System.out.println("<"+i+"단>");
		for (int j = 1; j < 10; j++) {
			System.out.println(i+"X"+j+"="+(i*j));
			}
		}
	// 중첩 반복문으로 5x5 박스 출력하기
	for (int i = 0; i < 5 ; i++) {
		for (int j = 0; j < 5 ; j++) {
			System.out.print("* ");
		}
		// * 5개가 찍힌 후 줄바꿈
		System.out.println();
	}
	// 중첩 반복문 확인 + 조건문 확인
	for (int i = 0; i < 5; i++ ) {
		for (int j = 0; j < 5; j++) {
			if (true) {
			System.out.print(i+","+j+"  ");
			} 
		}
		System.out.println();
	}
	// 계단식 박스
	for (int i = 0; i < 5; i++ ) {
		for (int j = 0; j < 5; j++) {
			if (i >= j) {
			System.out.print("* ");
			} 
		}
		System.out.println();
	}
	}
}
