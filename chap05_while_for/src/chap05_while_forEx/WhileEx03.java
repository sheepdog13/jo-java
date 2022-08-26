package chap05_while_forEx;

public class WhileEx03 {
	public static void main(String[] args) {
		// while - 구구단 4단.
		int dan = 4;
		int num = 0;
		int result;
		while (num <= 10) { // 10까지 출력하기위한 조건
			result = dan*num;
			System.out.println(dan+"X"+num+"="+result);
			num++; // num의 값을 증가시킴
		}
	}

}
