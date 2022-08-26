package chap06_array;

import java.util.Scanner;

public class ArrayEx {
	public static void main(String[] args) {
		// 실습, String 배열, 요소값 비교
		String fruits[] = {"바나나", "딸기", "포도", "사과", "키위"};
		Scanner input = new Scanner(System.in);
		System.out.print("과일 이름을 적어주세요 :");
		String x = input.next();
		boolean isFruit = false;
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i].equals(x)) {
				isFruit = true;
				break;
			}
		} if (isFruit) {
			System.out.println(x+"있습니다.");
		} else {
			System.out.println("없습니다.");
		}
		// 학생의 수를 입력받고, 점수배열을 만든후 성적 입력하기.
		System.out.print("학생수를 입력해주세요 :");
		int studentNum = input.nextInt();
		int scores[] = new int[studentNum]; // 배열 참조변수 선언과 생성
		for (int i = 0; i < scores.length; i++) {
			System.out.print((i+1)+"번째 성적을 입력해주세요 :");
			scores[i] = input.nextInt();
		}
		for (int score : scores) {
			if (score >= 60) {
				System.out.println(score);
			}
		}
	}
}
