package chap03_operatorEx;

import java.util.Scanner;

public class OperatorEx4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 값을 입력하세요 :");
		int x = input.nextInt();
		System.out.print("두번째 값을 입력하세요 :");
		int y = input.nextInt();
		System.out.println("몫 :"+x/y+"  나머지 :"+x%y);
	}

}
