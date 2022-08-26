package chap04_if;

public class TernaryOperator {
	public static void main(String[] args) {
		// 삼항연산자 ( ? : )
				// 한줄에다가 참/거짓을 확인하고 싶을 때
				// 삼항연산자의 결과값은 조건에 따라 참/ 거짓 값을 출력한다
				
				int x = 10;
				int y = 11;
				// 삼항 연산자, 연산자의 특징 : 계산을 하고 그 결과값을 출력/되돌려줌
				int maxNum = x>y ? x : y;
				System.out.println( maxNum );
				
				int num3 = -1;
				//              boolean   ?  참일때 할당값 : 거짓일때 할당값
				String state = (num3 > 0) ? "양수" : "음수";
				System.out.println(state);
	}

}
