package chap03_operatorEx;

public class OperatorEx {

	public static void main(String[] args) {
		// 아메리카노 = 2000, 카페라떼 = 3000, 카푸치노=3500
		// 아메리카노 3개, 카페라떼 3개, 카푸치노 3개
		int am = 2000;
		int cl = 3000;
		int cp = 3500;
		
		am += 2000;
		am += 2000;
		
		cl += 3000;
		cl += 3000;
		
		cp += 3500;
		cp += 3500;
		
		System.out.println(am+cl+cp);
		}

}
