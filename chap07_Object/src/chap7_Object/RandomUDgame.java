package chap7_Object;

import java.util.Scanner;

public class RandomUDgame {

	public static void main(String[] args) {
		
		// RandomUD 객체확인
		RandomUD randomNum = new RandomUD();
		//randomNum.start(); // 캡슐화
		
		
		//randomNum.startplay();
		RandomUD02 random2 = new RandomUD02();
		
		random2.startplay();
		// 랜덤 수를 가진 업다운게임
		// 1. 랜덤한 수가 만들어짐
		// 2. 수를 입력받음
		// 3. 입력받은 수를 랜덤한 수와 비교 결과를 알려줌
		// 4. 결과에 따라서 크다, 작다 를 알려주고
		// 5. 같다면 게임끝

		// 1. 랜덤한 수 만듦
		int num = (int) (Math.random() * 100) + 1;

		// 2. 수를 입력받음
		Scanner input = new Scanner(System.in);
		System.out.print("수를 입력해주세요 :");
		int usernum = input.nextInt();

		while (num != usernum) {
			if (num > usernum) {
				System.out.print("up");
			} else {
				System.out.print("down");
			}
			System.out.print("수를 입력해주세요 :");
			usernum = input.nextInt();
		}
		System.out.println("정답입니다.");
	}

}
