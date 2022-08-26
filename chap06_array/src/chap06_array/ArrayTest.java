package chap06_array;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// 배열 확인 1.
		int[] numbers; // 배열의 참조변수 선언
		numbers = new int[6]; // 배열의 생성
		// 2.
		int[] numbers2 = new int[6]; // 배열의 생성

		int[] numbers3 = numbers2; // 주소값 전달
		// {} 중괄호를 통해서 값을 바로 입력가능(초기화)
		// 3.
		int[] scores = { 10, 20, 40, 70 };

		int index = 0;

		// [] 대괄호를 이용하여 배열의 값 접근
		// [] : 인덱스 (0~) : 정수값(변수, 식)
		numbers[0] = 1;
		System.out.println(numbers[0]);
		System.out.println(scores[index + 1]);
		System.out.println(scores);
		System.out.println(numbers);
		System.out.println(numbers2);
		System.out.println(numbers3);

		numbers2[0] = 5;
		System.out.println(numbers2[0]);
		System.out.println(numbers3[0]);

		// for문을 이용한 배열 요소 출력
		// 배열의 길이를 직접입력해줄수있지만 length를 사용해서 쓸수있다
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		// for-each 루프
		// 배열안에 있는 요소를 score에 담아서 사용할수 있다
		// 배열안에 있는 값을 가져오는 것이기 때문에 배열의 값을 수정할수 없다
		for (int score : scores) {
			System.out.println(score);
		}
		// 실습 double배열 초기화
		// double 배열 초기화
		double sum = 0;
		double[] height = { 160, 165, 170, 175, 180, 180.6 };
		for (int i = 0; i < height.length; i++) {
			System.out.println(height[i]);
			sum += height[i];
		}
		System.out.println("평균키 :" + sum / height.length);
		// Scanner을 통해서 체온값 입력
		Scanner input = new Scanner(System.in);
		double temperatures[] = new double[3];
		for (int i = 0; i < temperatures.length; i++) {
			System.out.print("체온을 입력해주세요 :");
			temperatures[i] = input.nextDouble();
		}
		// for-each 사용
		for (double temperature : temperatures) {
			if (temperature >= 37) {
				System.out.println("위험" + temperature);
			} else {
				System.out.println(temperature);
			}
		}

	}

}
