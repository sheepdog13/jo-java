package chap04_if;

public class If {
	public static void main(String[] args) {
		// 조건문
		// if문 - 한줄일때
		// ()안의 조건이 참(true)일때 실행이된다
		if (true)
			System.out.println("코드가 실행됩니다");
		// if문 바깥에 있는 코드는 if문의 영향을 받지 않는다
		System.out.println("프로그램이 종료되었습니다");
		
		// 조건문을 넣어서 확인 - 여러줄
		int age = 5;
		if (age >= 6) {
			System.out.println(age+"살 입니다.");
			System.out.println("놀이기구를 탈수 있습니다");
		}
		// 실습 if문만 사용하는 경우
		int num = 13;
		if (num >= 10) {
			System.out.println("참입니다. :" +num);
		}
		System.out.println("종료되었습니다");
		
		// 실습, if문을 연달아서 사용하는 경우
		boolean eat = true;
		int time = 9;
		if (eat)
			System.out.println("밥을 먹었습니다");
		
		if (time < 10)
			System.out.println("택시를 탄다");
		System.out.println("프로그램이 종료되었습니다");
		// if- else 참일때와 거짓일 때 다른 코드 실행
		if (false)
			System.out.println("참입니다");
		else
			System.out.println("거짓입니다");
		
		// if-else문 조건식과 여러줄 출력
		int age1 = 5;
		if ( age1 > 6) {
			System.out.println("축하합니다");
			System.out.println("놀이기구를 탈 수 있습니다");
		} else {
			System.out.println("놀이기구를 탈 수 없습니다");
			System.out.println("나중에 또 오세요");
		}
		// num1의 값을 초기화 하고
				// num1이 0이 아니면, 10을 num1 로 나눈값을 출력
				// num1이 0이면, "입력한 값이 0입니다" 출력
				int num1 = 10;
				if ( num1 != 0) {
					System.out.println(10/num1);
					} else {
						System.out.println("입력한값이 0입니다");
					}
				// word를 초기화 하고
				// word가 "종료"와 같다면, "시스템을 종료합니다"라고 출력
				// 아니면, "시스템을 유지합니다" 출력
				String word = "종료";
				if (word == "종료")
					System.out.println("시스템을 종료합니다");
				else
					System.out.println("시스템을 유지합니다");
	}
	

}
