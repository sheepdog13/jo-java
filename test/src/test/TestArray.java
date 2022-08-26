package test;

public class TestArray {

	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		int[] scores = { 50, 60, 36, 90, 100 };
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 60) {
				System.out.println((i+1)+"번 : 합격");
				sum += scores[i];
				count++;
			}
		} System.out.println("합격자 평균 :"+(sum/count));

	}

}
