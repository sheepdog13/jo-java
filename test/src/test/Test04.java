package test;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		//Test 01
		Scanner input = new Scanner(System.in);
		System.out.print("출력할 단을 입력하세요(2~9) : ");
		int x = input.nextInt();
		if (x >= 2 && x < 10){
		for(int i = 2; i < 10; i++) {
		System.out.println(x+"X"+i+"="+x*i);
			}
		}else {
			System.out.println("구구단에 등록된 수가 아닙니다");
		}
		//Test02
		System.out.print("메뉴를 선택해주세요 1.짜장 2.짬뽕 3.탕수육 0.종료 : ");
		int x1 = input.nextInt();
		while (x1 != 0) {
		switch(x1) {
		case 1:
			System.out.println("짜장을 선택하였습니다.");
			break;
		case 2:
			System.out.println("짬뽕을 선택하였습니다.");
			break;
		case 3:
			System.out.println("탕수육을 선택하였습니다.");
			break;
			} System.out.print("메뉴를 선택해주세요 1.짜장 2.짬뽕 3.탕수육 0.종료 : ");
			  x1 = input.nextInt();
		} System.out.println("종료되었습니다.");
	}
	
}
