package test;

public class Student {
	String name;
	int number;
	int score;
	
	// 정적 변수 - 생성된 학생들의 수를 저장
	
	static int studentCount = 0;
	
	Student() {
		this.name = "홍길동";
		this.number = 0;
		this.score = 0;
		
		studentCount++;
	}
	
	Student(String name, int number){
		this.name =name;
		this.number = number;
		this.score = 0;
		
		studentCount++;
	}
	void setScore(int score) {
		this.score = score;
	}
	
	int getScore() {
		return this.score;
	}
	
	void printResult () {
		if (this.score >= 60) {
			System.out.println(this.name+"님은 합격입니다");
		} else {
			System.out.println(this.name+"님은 불합격입니다");
		}
	}
}
