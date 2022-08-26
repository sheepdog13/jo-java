package calculator;

import java.util.Scanner;

public class VolumeCalculator {
	public static void main(String[] args) {
		int x=0;
	System.out.print("길이를 입력하세요 :");
	Scanner input = new Scanner(System.in);
	x = input.nextInt();
	System.out.print("정육면체의부피 :");
	System.out.println(x*x*x);
		int x1=0;
		int y1=0;
		int z1=0;
	System.out.print("가로길이를 입력하세요 :");
	x1 = input.nextInt();
	System.out.print("세로길이를 입력하세요 :");
	y1 = input.nextInt();
	System.out.print("높이를 입력하세요 :");
	z1 = input.nextInt();
	System.out.print("직육면체의 부피 :");
	System.out.println(x1*y1*z1);
		
	}

}
