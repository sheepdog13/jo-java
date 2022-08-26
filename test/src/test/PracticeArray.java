package test;

public class PracticeArray {
	public static void main(String[] args) {
		// 1. 배열의 선언과 new를 이용한 생성
		// int 자료형의 길이가 10인 배열을 선언하고 생성하세요.
		int nums[] = new int[10];
		System.out.println(nums.length);
		
		// 2. 배열의 초기화
		// 문자 ‘가’, ‘나’, ‘다’, ‘라’, ‘마’, ‘바’를 갖는 문자형 배열을 초기화 하세요
		String s1[] = {"가", "나", "다", "라", "바"};
		
		/* 3. 배열의 인덱스
		아래 내용을 읽고 O,X으로 답하세요
		1) 배열의 인덱스의 시작은 무조건 1이다  ( O, X ) X 0이다 
		2) 배열의 길이를 넘어가는 인덱스를 사용하면 오류가 난다 ( O, X ) O */
		
		/* 4. 배열 자료형의 특징 - 주소
		배열은 여러 개의 값을 저장하기 때문에, 배열 변수 (int[] numbers)와 배열의 요소 (numbers[0])의  값은 다르다.
		임의로 배열을 하나 만들어서 그 안에 들어가 값을 확인하고 작성하자.
		int[] numbers 안에 들어간 값 :  주소값
		numbers[0] 안에 들어간 값 : 요소값 초기화전은 0 */
		int scores[] = {88, 58, 47, 69, 50, 72, 87, 90, 84, 95};
		String names[] = {"홍길동", "흥부", "놀부", "콩쥐", "팥쥐", "장화", "홍련", "심청", "춘향", "이순신"};
		boolean pass[] = {false, true, true, false, true, false, false, false, false, false};
		// 1. 점수 인덱스 [0]의 값(88)을 91로 수정
		System.out.println(scores[0]);
		scores[0] = 91;
		System.out.println(scores[0]);
		// 2. 이름 인덱스 [9]의 값(이순신)을 몽룡으로 수정
		System.out.println(names[9]);
		names[9] = "몽룡";
		System.out.println(names[9]);
		// 3. 합격여부 인덱스 [1]의 값(true)을 false로 수정
		System.out.println(pass[1]);
		pass[1] = false;
		System.out.println(pass[1]);
		
		// ◆ 배열과 for-each문 
		// 1. 점수 배열을 출력할 때, 뒤에 00점 이라고 출력되게 한다
		for (int score : scores ) {
			System.out.println(score+"점");
		}
		// 2. 이름 배열을 출력 할 때, 뒤에 00님 이라고 출력되게 한다.
		for (String name : names ) {
			System.out.println(name+"님");
		}
		
		/* ◆ 배열과 for문 - i를 이용한 인덱스 : 배열 요소 값에 직접 접근할 수 있다
			 : length를 이용하여 배열의 길이를 구할 수 있다. */
		// 1. 점수 배열의 점수값을 5씩 더하세요.
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i]+5+" ");
		}System.out.println();
		// 2. 이름 배열의 전체를 출력하세요. 
		for ( String name1 : names) {
			System.out.print(name1+" ");
		}System.out.println();
		/* 3. 합격여부 배열의 주어진 값을 전부 반대로 바꿔서 넣어주세요
		* !를 이용하면 true값을 false로 바꿔줄수 있다.(바꾼 값을 할당해서 넣어주어야 저장된다) */
		for (boolean pass1 : pass) {
			System.out.print(!pass1+" ");
		}System.out.println();
		
		//◆ 배열과 반복문과 조건문
		//1. 점수 배열의 60이상인 점수만 더해서 평균을 구하세요 (합격자 평균)
		int sum = 0;
		int repeat = 0;
		for (int score2 : scores) {
			if (score2 >= 60) {
				sum += score2;
				repeat++;
				} 
			}System.out.println("60이상 점수의 평균 :"+sum/repeat);

		//2. 이름 배열에 ‘콩쥐’가 있는지 확인하고 출력하세요.
		boolean iskonggi = false;
		for (String name2 : names) {
			if (name2.equals("콩쥐")) {
				iskonggi = true;
			}
		} if(iskonggi == true) {
			System.out.println("콩쥐 있습니다");
		} else {
			System.out.println("콩쥐 없습니다");
		}
		//3. 합격 여부 배열의 true인 개수 출력하세요
		int sum2 = 0;
		for (boolean pass2 : pass) {
			if (pass2 == true) {
				sum2++;
			}
		}System.out.println("합격인원 :"+sum2+"명");
	}
}
