package chap04_ifEx;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		// 값을 입력 받아서 10보다 크고, 20보다 작다면, 변수 num을 출력
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 :");
		int num = input.nextInt();
		if(num > 10 && num < 20 )
			System.out.println(num);
		System.out.println("프로그램이 종료되었습니다.");
		// 실습, 문자열 비교
		System.out.print("이름을 입력해주세요 :");
		// 참조형일 경우
		// 변수안에 값을 할당하고 비교할때는 == 연산자 사용가능
		// 값을 받아와서 비교할때는 .equals(비교할 문자열) 사용
		String name = input.next();
		if(name.equals("조창욱"))
			System.out.println("본인이 맞습니다");
		System.out.println("프로그램이 종료되었습니다.");
		
	}

}
