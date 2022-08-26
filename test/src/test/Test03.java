package test;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("지하철에 탑승하시겠습니까? 네:1, 아니요:0 :");
		int x = input.nextInt();
		int sum = 3000;
		while (x !=0) {
			if (sum >= 1300) {
				sum -= 1300;
				System.out.println("탑승하셨습니다. 현재남은 잔액은 :"+sum+"원 입니다.");
			}else {
				System.out.println("잔액이 부족합니다");
			} System.out.print("지하철에 탑승하시겠습니까? 네:1, 아니요:0 :");
			x = input.nextInt();
		} System.out.println("종료되었습니다");
	}
}
