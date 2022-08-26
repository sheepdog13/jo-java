package chap05_while_for;

public class While {
	public static void main(String[] args) {
		// 반복문 while
		// 조건이 참일때 안의 블록을 반복한다.
		// 반복문 while을 쓸때 주의점
		// 1. 조건문이 true일때만 안의 내용이 실행
		// 2. 조건문이 항상 true이면 무한반복에 빠져서 프로그램이 끝나지않는다
		int num = 0;
		while ( num < 5 ) {
			System.out.println("반복하고 있습니다 :"+num);
			num++;
		}
		// 실습 while - 카운트다운
		int count = 10;
		while (count > 0) {
			System.out.println(count);
			count--;
			
		}
	}
}
