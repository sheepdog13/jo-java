package chap7_Object;

public class Student {
	// 필드값
	// Private는 클래스 안에서만 사용가능
	// public은 클래스 안에서 뿐만아니라 객체를 통해서도 접근가능
	// 값을 적어주니 않았을때 package까지 접근할수 있는 접근지정자 사용
	public String name;
	public int age;
	public int grade;
	
	static int studentCount = 0;
	
	// 생성자
	// 매개변수를 갖지않는 생성자
	Student() {
		this.name = "홍길동";
		this.age = 0;
		this.grade = 0;
		studentCount++;
	}
	// name값을 매개변수로 받아오는 생성자
	Student(String name) {
		this.name = name;
		this.age = 0;
		this.grade = 1;
		studentCount++;
	}
	// 매개변수를 여러개 받아오는 생성자
	Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		studentCount++;
	}
	
	// 메소드
	void printGrade() {
		System.out.println(grade);
	}
	
	// 실습, return을 통해서 나이값을 메소드로 돌려주는 메소드
	int getAge() {
		return this.age;
	}
	
	// 매개변수를 통해서 학년을 수정하는 메소드
	void setGrade(int grade) {
		this.grade= grade;
	}
	
	// if, for, while 사용가능
	void pringLevel() {
		// grade에 따라서 고학년 저학년을 나눠서 출력
		// 3학년 초과는 고학년
		// 3학년 이하는 저학년
		if (this.grade > 3) {
			System.out.println("고학년입니다");
		} else {
			System.out.println("저학년입니다");
		}
	}
	static int getStudentCount () {
		return studentCount;
	}
	
	
}
