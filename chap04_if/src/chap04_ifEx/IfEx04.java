package chap04_ifEx;

import java.util.Scanner;

public class IfEx04 {
	public static void main(String[] args) {
		// 실습, 연속적 if - else if -else
		// 학점계산
		Scanner input = new Scanner(System.in);
		System.out.print("점수를 입력하세요 :");
		int score = input.nextInt();
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
		// 실습
		// 미세먼지 판별기
		// 0~30 좋음, 31~80 보통, 81~150 나쁨, 151~ 매우 나쁨
		// && 를 써보자
		System.out.print("미세 먼지 농도를 적어주세요 :");
		int FD =input.nextInt();
		if (FD <= 30 && 0 <= FD) {
			System.out.println("좋음");
		} else if (FD <= 80) {
			System.out.println("보통");
		} else if (FD <= 150) {
			System.out.println("나쁨");
		} else {
			System.out.println("매우 나쁨");
		}
	}

}
