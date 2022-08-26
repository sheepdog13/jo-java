package chap3_operatorEx2;

import java.util.Scanner;

public class OperatorEx2_2 {
	public static void main(String[] args) {
		
		// 놀이기구를 타는 사람이 6세 이상인지
		// 키가 140 이상인지
		// 6세 이상 (true), 키가 140이상(true) 놀이기구를 탈수있다(true)
		Scanner input = new Scanner(System.in);
		System.out.print("나이를 입력해주세요 :");
		int age = input.nextInt();
		System.out.print("키를 입력해주세요 :");
		int height = input.nextInt();
		
		if(age>=6 && height>=140) {
			System.out.println("반갑습니다. 탑승해주세요");
		}else {
			System.out.println("죄송합니다. 다음에 탑승해주세요");
		}
	}

}
