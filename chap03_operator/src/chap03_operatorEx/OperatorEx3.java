package chap03_operatorEx;

import java.util.Scanner;

public class OperatorEx3 {
	/*public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		System.out.print("몇초 입니까? :");
		int a = input.nextInt();
		System.out.print(a+"초는 "+a/60+"분 "+a%60+"초 입니다.");
		 	}*/
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("몇초입니까? :");
		int s = input.nextInt();//s초
		int m = s/60;// m분
	if(m<=60) {
		System.out.print(m+"분");
		System.out.print(" "+s%60+"초 입니다");
		
	}else {
		int h = m/60;
		m %= 60;
		System.out.print(h+"시");
		System.out.print(" "+m+"분");
		System.out.print(" "+s%60+"초 입니다");
	}
		
	}	
}


