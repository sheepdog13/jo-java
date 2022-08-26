package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("비밀번호를 입력해주세요 :");
		String secret = input.next();
		if (secret.equals("1111")) {
			System.out.println("비밀번호가 맞습니다.");
		}else {
			System.out.println("비밀번호가 틀립니다.");
		}

	}

}
