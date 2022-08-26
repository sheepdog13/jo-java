package break_continue;

import java.util.Scanner;

public class BreakEx {
	public static void main(String[] args) {
		// for문에서 break
		// 1~100까지 출력하는 중 77까지 출력하고 멈추기
		for (int i = 1; i <= 100; i++) {
			System.out.print(i+" ");
			if (i % 10 == 0) {
				System.out.println();
			}
			if (i==77) {
				break;
			}
		}
		// 실습 while문에서 break
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("숫자를 입력해주세요(0:종료) :");
			int x = input.nextInt();
			if (x == 0) {
				break;
			}System.out.println(x);
		}System.out.println("종료");
	}
}
