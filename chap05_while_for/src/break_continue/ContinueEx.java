package break_continue;

public class ContinueEx {
	// 실습 continue
	public static void main(String[] args) {
		for (int i = 1; i <= 30; i++) {
			if (i % 3 == 0) {
				continue;
			} System.out.println(i);
		}
	}
}
