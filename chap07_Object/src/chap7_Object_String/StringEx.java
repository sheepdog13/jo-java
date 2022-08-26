package chap7_Object_String;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		// 실습 String 메소드 charAt 문자열의 인덱스를 통해 문자를 출력한다
		//      String 메소드 length 문자열의 길이를 출력한다
		String s = new String("2022-08-05");
		for (int i = 0; i < s.length() ; i++) {
			if (s.charAt(i) == '-') {
				// 메소드는 필드값이 아니기에
				// 대입연산자를 이용해서 값을 수정할수 없다
				// dat.charAt(i) = "."; - 오류
				System.out.println(".");
				continue;
			}
				System.out.println(s.charAt(i));
		// 실습 String 메소드 concat 문자를 뒤에 추가해서 출력한다
		Scanner input = new Scanner(System.in);
		String allWord = "";
		String s1 = "";
		while (!s1.equals("종료")) {
			System.out.print("문자열을 입력해주세요 :");
			s1 = input.next();
			// allWord = allWord + inputWord와 동일한 결과
			allWord = allWord.concat(s1);
		}
		System.out.println(allWord);
		
		// 실습 String 메소드 replace 글자를 모두바꿔줌
		//      String 메소드 charAt 문자열의 인덱스를 통해 문자를 출력한다
		System.out.print("이름을 입력해주세요 :");
		String name = input.next();
		System.out.println(name.replace(name.charAt(1), '*'));
	}
	}
	}
