package test;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("메뉴를 선택해주세요 1.짜장 2.짬뽕 3.탕수육 0.종료 : ");
		int x = input.nextInt();
		while (x != 0) {
		switch(x) {
		case 1:
			System.out.println("짜장을 선택하였습니다.");
			break;
		case 2:
			System.out.println("짬뽕을 선택하였습니다.");
			break;
		case 3:
			System.out.println("탕수육을 선택하였습니다.");
			} System.out.print("메뉴를 선택해주세요 1.짜장 2.짬뽕 3.탕수육 0.종료 : ");
			  x = input.nextInt();
		} System.out.println("종료되었습니다.");
	}
}
