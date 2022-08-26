package chap3_operatorEx2;

import java.util.Scanner;

public class OperatorEx2 {

	public static void main(String[] args) {
		// 가로길이를 입력받으면 면적이 1000에 가깝게 하는 세로길이를 계산해서 출력
		// 면적 = 사격형의 넓이 = 가로(x)*세로(y)
		Scanner input = new Scanner(System.in);
		System.out.print("가로의 길이를 입력하세요 :");
		int x = input.nextInt();
		int y = 1000/x;
		double doubley = 1000.0/x;
		System.out.println("세로의 길이 :"+y);
		System.out.println("세로의 길이(실수) :"+ doubley);
		System.out.print("문자로 출력됩니다 :");
		String word = input.next();
		System.out.println(word+10); //문자끼리의 +는 문자의 연결
		                          //띄어쓰기 이전의값을 대입한다

	}

}
