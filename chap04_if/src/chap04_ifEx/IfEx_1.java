package chap04_ifEx;

import java.util.Scanner;

public class IfEx_1 {
	public static void main(String[] args) {
		// 점수를 입력받고
		// 점수가 60보다 크면, 합격
		// 아니면 불합격
		// if-else 문이 끝나면 수고하셨습니다.
		Scanner input = new Scanner(System.in);
		System.out.print("점수를 입력해주세요 :");
		int score = input.nextInt();
		if (score > 60)
			System.out.println("합격");
		else
			System.out.println("불합격");
		System.out.println("수고하셨습니다");
	}

}
