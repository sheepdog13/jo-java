package chap05_while_for;

import java.util.Scanner;

public class For { 
	public static void main(String[] args) {
		// for문
		// for(초기화 ; 조건식 ; 증감계산)
		for (int num = 1; num <= 10; num++) {
			System.out.println(num);
		}
		// for문을 이용한 1~10 까지의 합
		int sum = 0;
		for (int num1 = 1; num1 <= 10; num1++) {
			sum += num1;
			}System.out.println(sum);
		// 실습 for - 팩토리얼
		Scanner input = new Scanner(System.in);
		long mult = 1L;
		System.out.print("n!의 n값을 넣어주세요 :");
		int n = input.nextInt();
		for (int num2 = 1; num2 <= n; num2++) {
			mult *=num2;
			}System.out.println(n+"!의 값은 :"+mult);
	}
}
