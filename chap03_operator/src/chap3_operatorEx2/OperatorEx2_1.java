package chap3_operatorEx2;

import java.util.Scanner;

public class OperatorEx2_1 {
		public static void main(String[] args) {
			// 이름을 입력받으면 반갑습니다라고 출력하는코드
			Scanner input = new Scanner(System.in);
			System.out.print("이름을 입력해주세요 :");
			String name = input.next();
			System.out.println("반갑습니다."+name+"님");
			// 체온을 입력받아 출력하는 코드
			System.out.print("체온을 입력해주세요 :");
			double temperature = input.nextDouble();
			System.out.print("강의실 호수를 입력해주세요 :");
			int lectureRoomName = input.nextInt();
			System.out.println("현제 체온 "+temperature+"도 입니다."+lectureRoomName+"강의실 입니다.");
		}
}
