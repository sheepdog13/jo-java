package chap7_Object;

public class MathNum {
	// 정적 메소드
		// 클래스에서 바로 접근할수 있는 메소드
			// 정적 메소드는 클래스로 접근하는 메소드이기 때문에
			// 객체가 가지고 있는 필드에는 접근할 수 없다
			// 따라서 this를 사용할 수 없음.
			// 매개변수를 받아와 사용하거나, 지역변수를 사용할 수 있다.
			
	// 두 수중 큰 값을 return 하는 정적메소드
	private static int intMax(int a, int b) {
		if(a > b) {
			return a;
		} else {
			return b;
		}
	}
	// 두 수를 더한 값을 return 하는 정적메소드
	private static int intAdd(int a, int b) {
		return a+b;
	}
	// 정적 메소드를 가진 클래스 확인
	public static void main(String[] args) {
		System.out.println(MathNum.intAdd(MathNum.intMax(4123/134, 6234/231),MathNum.intMax(673/3, 424/2)));
	}
}
