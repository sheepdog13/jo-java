package chap05_while_for;

import java.util.Scanner;

public class Dowhile {
	public static void main(String[] args) {
		// do while : 반복할 내용이 무조건 한번은 실행되는 조건문
		Scanner input = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		do { // while의 뒤에 있던 반복할 내용이 do를 이용해서 앞으로 가져옴
			System.out.print("더할값을 입력해주세요(0을 넣으면 멈춤) :");
			num = input.nextInt();
			sum += num;
		} while (num != 0); //조건이 참이라면 do로 올라가 다시 반복 
		System.out.println("더한 값 :"+sum);
	}
}
