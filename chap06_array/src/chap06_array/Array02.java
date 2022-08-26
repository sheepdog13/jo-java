package chap06_array;

public class Array02 {
	public static void main(String[] args) {
		// 2차원 배열
		// 2차원 배열의 선언과 생성
		int[][] numArray = new int[3][5];
		// 내용 확인을 위해 중첩 반복문 사용
		int count = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				numArray[i][j] = count;
				count++;
				System.out.print(numArray[i][j]+"  ");
			} System.out.println();
		}
		numArray[0][0] = 100;
		System.out.println("프로그램을 종료합니다");
		
		// 2차원 배열 초기화
		int[][] tableArray = { {10, 20, 30}, {40, 50, 60, 65}, {70, 80, 90}};
		for (int i = 0; i < tableArray.length; i++) {
			for (int j = 0; j < tableArray[i].length; j++) {
				System.out.print(tableArray[i][j]+"  ");
				}System.out.println();
			}
		// 실습 2차원 배열 단어장
		String[][] words = {{"chair", "의자"}, {"computer", "컴퓨터"}, {"integer", "정수"}};
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j <words[i].length; j++) {
				System.out.print(words[i][j]+"  ");
			}System.out.println();
			}
		
		// 선택정렬코드
		int[] numberSort = {5, 2, 6, 1};
		int temp, least;
		
		for (int i = 0; i < numberSort.length-1; i++) {
			least = i;
			for (int j = i + 1; j < numberSort.length; j++) {
				// 값들을 하나씩 비교하면서 최소값 확인
				if(numberSort[j] < numberSort[least]) {
					least = j; // 현재 값이 더 작다면 인덱스값을 넣어줌
				}
			}
			// 반복문이 끝난후에 가장 작은 값의 위치를 바꾸줌
			temp = numberSort[i]; // 첫번째의값
			// 첫번째 자리에 가장작은 값 할당
			numberSort[i] = numberSort[least];
			numberSort[least] = temp;
		}
		}			
}
