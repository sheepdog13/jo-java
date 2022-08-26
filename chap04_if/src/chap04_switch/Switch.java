package chap04_switch;

public class Switch {
	public static void main(String[] args) {
		// ()안에 비교할 값을 넣는다
		// 비교할 값은 동일한 자료형으로 넣어주어야한다.
		int number = 6;
		switch (number) {
		case 0: // case 뒤에 원하는 값일 경우 출력할 값을 넣는다.
			System.out.println("없음");
			break;
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		default :
			System.out.println("많음");
			break;
		}
		int day = 0;
		switch (day) {
		case 0: 
			System.out.println("월요일");
			break;
		case 1:
			System.out.println("화요일");
			break;
		case 2:
			System.out.println("수요일");
			break;
		case 3:
			System.out.println("목요일");
			break;
		case 4:
			System.out.println("금요일");
			break;
		case 5:
			System.out.println("토요일");
			break;
		case 6:
			System.out.println("일요일");
			break;
		default :
			System.out.println("그러한 요일은 없습니다");
			break;
		}
		// 실습 switch 학점계산
		int score = 85;
		int scoreCase = score/10;
		System.out.println(scoreCase);
		switch ( scoreCase ) {
		case 10 : case 9 :
			System.out.println("A");
			break;
		case 8 :
			System.out.println("B");
			break;
		case 7 :
			System.out.println("C");
			break;
		default :
			System.out.println("F");
			break;
		}
	}
}
