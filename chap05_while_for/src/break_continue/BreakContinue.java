package break_continue;

public class BreakContinue {
	public static void main(String[] args) {
		// 반복문안에서 사용할 수 있는 키워드
		// break;
		
		// switch문에서 break;
		int num = 0;
		switch (num) {
		case 0:
			System.out.println("입력된 값은 0입니다");
			break; // break를 사용해서 switch문을 나간다.
		default:
			System.out.println("다른 숫자값입니다");
			break;
		}
		
		// 반복문에서 break
		for (int i = 0; i<10; i++) {
			System.out.println(i);
			if (i == 4) {
				break;
			}
		}
		
		// while문에서 break
		int a = 1;
		while(true) {
			a++;
			System.out.println(a);
			if(a > 10) {
				break;
			}
		}
		
		// continue 확인
		// 현재의 반복문을 건너뜀
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				continue;
				// 건너뛰고싶은 코드 위쪽에 작성
			}
			System.out.println(i);
		}
	}
}
