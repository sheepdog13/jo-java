package chap7_Object_String;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		// String 클래스의 메소드 확인
		String word = new String("단어");
		
		// charAt을 사용하면 문자열의 인덱스를 통해 문자를 출력할수 있다
		// 배열과 동일한 인덱스를 가지고 있다(0부터시작)
		System.out.println(word.charAt(1));
		
		// compareTo 사전적 순서로 비교
		// 앞에있으면 -1(음수), 같으면 0, 뒤에있으면 1(양수)
		System.out.println(word.compareTo("단억"));
		
		// concat을 문자를 뒤에 추가해서 출력한다
		// 현재의 단어를 바꾸지 않음
		System.out.println(word.concat("장"));
		System.out.println(word+"장"); // 메소드 사용과 동일
		
		// equals 문자열을 비교해서 boolean 값을 출력
		System.out.println(word.equals("단어"));
		
		word = ""; // 값이 없다.
		// isEmpty는 길이로 boolean 값을 출력,
		// "" : 빈값으로서 길이가 0 주소값을 가지고 힙이 null이다
		// null : 아예 가르키는 객체가 없다 = 값이 없다. 주소값을 안가진다
		System.out.println(word.isEmpty());
		
		word = "hello word!";
		// length는 길이를 숫자로 출력
		System.out.println(word.length());
		
		word = "단어어";
		// replace 글자를 모두바꿔줌
		System.out.println(word.replace("어", "아"));
		
		// substring 원하는 단어를 잘라서 가져옴
		// 처음 위치 ~ 마지막 위치
		System.out.println(word.substring(1,2));
		
		// toLowerCase(), toUpperCase()
		word = "Apple";
		// 소문자로만 출력
		System.out.println(word.toLowerCase());
		// 대문자로만 출력
		System.out.println(word.toUpperCase());
		System.out.println(word);
		
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
		}
		// 실습 String 메소드 concat
		Scanner input = new Scanner(System.in);
        String allWord = "";
        String s1 = "";
		while (!s1.equals("종료")) {
			System.out.print("문자열을 입력해주세요 :");
			s1 =input.next();
			// allWord = allWord + inputWord와 동일한 결과
			allWord = allWord.concat(s1);
		} System.out.println(allWord);
		// 실습 String 메소드 replace, charAt
		System.out.print("이름을 입력해주세요 :");
		String name = input.next();
		System.out.println(name.replace(name.charAt(1), '*'));
	}

}
