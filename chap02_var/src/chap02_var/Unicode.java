package chap02_var;

public class Unicode {
	public static void main(String[] args) {
		// 문자형과 문자열
		// 문자형은 유니코드로 된 한 글자를 표시할 수 있다
		char ch1 = '가';
		char ch2 = '\uac00';
		System.out.println(ch1);
		System.out.println(ch2);
		
		//문자열은 String 클래스를 이용해서 값을 할당할수 있다
		// "" 쌍따옴표 사용 쌍따옴표 안에 있는 모든 글은 문자열 취급
		String s = "Hello world!";
		String s1 = "ch1";
		System.out.println(s);
		System.out.println(s1);
		
		// int를 이용하여 number(변수이름)에 숫자값10을 할당하세요
			int number = 10;
		//boolean을 이용하여 isSunny true 값을 할당하세요
			boolean isSunny = true;
		//char를 이용하여 char_a에 a 값을 할당하세요
			char char_a = 'a';
		//String을 이용하여 sayHi에 hi를 할당하세요
			String sayHi = "hi";
			
		// 문자열의 특수문자
			String word =" \" : 쌍따옴표표시 \' : 따옴표표시 \n새 라인";
		System.out.println(word);
		
		//실습 특수 문자
			String H1 = "\"Hello world\"";
			System.out.println(H1);
		
	}	
}
