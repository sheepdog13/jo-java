package chap03_operatorEx;

import java.util.Scanner;

public class OperatorEx2 {
	public static void main(String[] args) {
		int am = 2000;
		int cl = 3000;
		int cp = 3500;
	Scanner input = new Scanner(System.in);
	
	System.out.print("아메리카노 판매개수 :");
	int amx = input.nextInt();
	
	am *= amx;
	System.out.print("아메리카노 판매금 :");
	System.out.println(am+"원");
	
	System.out.print("카페라떼 판매개수 :");
	int clx = input.nextInt();
	
	cl *= clx;
	System.out.print("카페라떼 판매금 :");
	System.out.println(cl+"원");
	
	System.out.print("카푸치노 판매개수 :");
	int cpx = input.nextInt();
	
	cp *= cpx;
	System.out.print("카푸치노 판매금 :");
	System.out.println(cp+"원");
	
	System.out.print("총매출 :");
	System.out.println(am+cl+cp+"원");
	
	
	
	}

}
