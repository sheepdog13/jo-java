package test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("그만을 입력하면 멈춤니다 아무글이나 입력하세요 :");
		String s1 = input.next();
		while (!s1.equals("그만")) {
			System.out.println(s1);
			System.out.print("그만을 입력하면 멈춤니다 아무글이나 입력하세요 :");
			s1 = input.next();
		}
		System.out.print("일수를 알고 싶은 달을 입력하세요 :");
		int month = input.nextInt();
		switch (month) {
			case 4 : case 6 : case 9 : case 11 :
				System.out.println("30일");
				break;
			case 2 :
				System.out.println("28,29일");
				break;
			default :
				System.out.println("31일");
				break;
		}
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("30일");
		}
	}
}
