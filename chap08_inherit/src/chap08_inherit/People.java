package chap08_inherit;

public class People {
	String name;
	String gender;
	int age;
	
	public People() {
		this.name = "홍길동";
		this.gender = "남";
		this.age = 20;
	}
	public People(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public void setPeople(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public void selfIntro() {
		System.out.println(this.name+"입니다.");
	}
	// 클래스를 상속받지 않을때 object 클래스를 상속 받는다
	// 필요하다면 Override를 통해 내용을 수정해서 사용할 수 있다
	public boolean equals(Object object) {
		// 오브젝트 객체로 받아오는 경우는 클래스를 구분해서 사용
		// .getClass().getName()을 이용하여 구분
		System.out.println("people의 내용이 출력되었습니다");
		return true;
	}
	// 동일한 이름을 가진 중복정의
	public boolean equals(People people) {
		System.out.println("people의 equals 중복정의입니다");
		return true;
	}
}
