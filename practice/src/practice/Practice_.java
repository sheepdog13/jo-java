package practice;

import java.util.Scanner;

public class Practice_ {
	public static void main(String[] args) {
		int sum; // 변수 선언 = 변수를 사용할 준비가 됨
		sum = 6+8;
		sum = 2+1; //3 - 변수는 가장 마지막 값을 가지게 된다
		// 코드는 항상 위에서 아래로 실행된다.
		System.out.println("출력");
		String name = "홍길동"; // 변수 초기화
		// 선언을 먼저하는 경우
		// for과 while 반복문을 사용할때 선언을 해줌
		int num = 0;
		for (int i=0; i<5; i++) {
			num = i;
		}System.out.println(num); // 
		if (num > 3) {
			System.out.println("a값은 3보다 큽니다");
		}
		
		// 통장 확인 프로그램
		// 기능을 선택하고 금액을 입력하면
		// 입금, 출금, 송금 하는 프로그램
		// 변수 : 통장 = 가지고 있는 금액
		// 입금 : 통장에 입력한 금액을 추가함
		// 출금 : 통장에 입력한 금액을 감소함
		// 송금 : 통장에 입력한 금액을 감소함 
		// + 어디로 보낼건지를 입력받고 , 마지막에 어디로 보내는지 안내함 
		int sum1 = 150000;
		Scanner input = new Scanner(System.in);
		System.out.print("1. 입금 2.출금 3.송금 4.종료 번호를 입력해주세요 :");
		int x = input.nextInt();
		while (x != 4) {
			switch (x) {
			case 1 : System.out.print("입금할 금액을 입력해주세요 :");
				int x1 = input.nextInt();
				System.out.print("잔액 :"+(sum1 += x1)+"원");
				break;
			case 2 : System.out.print("출금할 금액을 입력해주세요 :");
				int x2 = input.nextInt(); 
				if (sum1 >= x2) { 
				System.out.print("잔액 :"+(sum1 -= x2)+"원");
				break;
			} else {
				System.out.println("잔액이 부족합니다");
				break;
			}
			case 3 : System.out.print("어디로 돈을 보낼까요?");
				String who = input.next();
				System.out.print("송금할 금액을 입력해주세요 :");
				int x3 = input.nextInt();
				if (sum1 >= x3) {
					System.out.println(who+"에게 송금했습니다  "+"잔액"+(sum1 -= x3)+"원");
					break;
				} else {
					System.out.println("잔액이 부족합니다");
					break;
				}
			}	System.out.println();
				System.out.print("1. 입금 2.출금 3.송금 4.종료 번호를 입력해주세요 :");
				x = input.nextInt();
		} System.out.println("다음에 또 이용해주세요");
	}
}
