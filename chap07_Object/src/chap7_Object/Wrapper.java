package chap7_Object;

import java.util.Scanner;

public class Wrapper {

	public static void main(String[] args) {
		// 랩퍼 클래스 : 기초자료형을 참조형(객체)로 포장하는 클래스
		int num = 10; // 메소드를 쓸수 없음
		// 랩퍼 클래스를 사용하면 메소드를 쓸수 있음
		Integer objNum = new Integer(10);
		System.out.println(objNum.equals(0));
		System.out.println(objNum == 10);
			// Integer에서 메소드를 사용할 수 있다.
		num = Integer.parseInt("5");
		System.out.println(num + 3);
			// parse를 사용하면 문자열을 기초자료형으로 바꿀수있다
		double objDouble = Double.parseDouble("0.5");
		System.out.println(objDouble + 0.5);
		
		// 랩퍼클래스를 이용해서 문자열로 바꿔줄수있다
		String doubleNum = Double.toString(0.5);
		System.out.println(doubleNum+ 0.5);
		
		// 실습 parseInt
		Scanner input = new Scanner(System.in);
		System.out.print("생일을 입력해주세요 (예3월30일: 0330) :");
		String birthDay = input.next();
		// 전체를 숫자로 바꿈
		int intBirthDay = Integer.parseInt(birthDay);
		System.out.println(intBirthDay);
		// 달과 일을 잘라서 숫자로 바꿈
		// substring을 이용하여 글자를 자름
		int birthDayMonth = Integer.parseInt(birthDay.substring(0,2));
		// parseInt 글자를 숫자로 바꿔줌
		int birthDayDay = Integer.parseInt(birthDay.substring(2));
		System.out.println(birthDayMonth);
		System.out.println(birthDayDay);
	}

}
