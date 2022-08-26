package chap04_ifEx;

import java.util.Scanner;

public class IfEx03 {
	public static void main(String[] args) {
		// 실습 - 중첩if
		// 3개의 정수값을 받고 최대값을 출력하세요
		Scanner input = new Scanner(System.in);
		System.out.print("숫자 세개 를 띄워쓰기로 구분해서 입력해주세요 :");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int max;
		if(a > b) {
			// a이가 크므로 max값
				max = a; //max에 a값 할당
			if (a > c) { //조건문을 ( max > c)
				System.out.println("최대값은 :"+a);
			}
		} else {
			if (b > c) {
				System.out.println("최대값은 :"+b);
			} else { // c가 max값 보다 크므로 max값에 할당
				max = c;
				System.out.println("최대값은 :"+c);
			}
		}
	}

}
