package chap01_test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int x=0;
		System.out.println(x);
		System.out.print("숫자를 입력하세요 :");
		
		//ctrl+space 빠르게 Scanner추가
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		System.out.print("출력값 :");//print:줄바꿈 없이 출력
		System.out.println(x);
		
		System.out.println(1+x); //1과 사용자 입력수가 더해져서 나옴
	}

}
