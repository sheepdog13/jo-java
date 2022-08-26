package chap7_Object;

import java.util.Scanner;

public class RandomUD02 {
	private int num;
	private int usernum;
	
	// 랜덤 숫자 받아오기
	private int getRandomNum() {
		return this.num = (int) (Math.random()*100)+1;
	}
	// 숫자 입력 받기
	private int checkUserGuess() {
		System.out.print("숫자를 입력해주세요 :");
		Scanner input = new Scanner(System.in);
		return this.usernum = input.nextInt();
	}
	// 비교하기
	private void checkNum () {
		if (num > usernum) {
			System.out.println("up");
		} else {
			System.out.println("down");
		} checkUserGuess();
		  
	}
	// 실행 메소드
	void startplay () {
		getRandomNum();
		checkUserGuess();
		while (num != usernum) {
			checkNum();
		} System.out.println("같습니다.");
	}
}
