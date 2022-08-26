package chap03_operator;

public class Operator4 {
	public static void main(String[] args) {
		// 관계연산자 (==, !=, >, <, >=, <=)
		// 관계연산자의 결과값은 항상 참/거짓이다 (boolean값)
		System.out.println(10==10);
		System.out.println(10==100);
		
		int score = 80;
		//score 값이 60보다 크면 합격(true)
		System.out.println(score > 60); // score값에 따라 결과가 바뀜
		
		int x =63*4;
		int y =38*6;
		System.out.println(x > y);
	}
}
