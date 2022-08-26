package chap05_while_forEx;

public class WhileEx {
	public static void main(String[] args) {
		int sum, even, odd;
		int num =1;
		sum = 0;
		even = 0;
		odd = 0;
		while (num <= 100) {
			// 전체의 합
			sum += num;
			if (num % 2 == 0) {
				// 짝수의 합
				even += num;
		} else {
			// 홀수의 합
			odd += num;
		}
			num++;
		}
		System.out.println(sum);
		System.out.println(even);
		System.out.println(odd);
	}

}
