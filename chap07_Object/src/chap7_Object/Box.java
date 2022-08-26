package chap7_Object;

// 객체를 만들기 위한 클래스 선언
public class Box {
	// 필드 - 객체가 각각 사용하는 값
	int width;
	int length;
	int height;

	// 정적 변수
	// 모든 박스의 갯수를 저장 > 객체 생성시 1씩 증가
	static int boxCount = 0;
	
	// 전적변수를 이용한 상수
	// final 을 이용하여 초기화만 가능하다.
	static final int MAX_BOX_LINE = 300;
	
	
	// 생성자
	// new를 이용해서 객체를 생성할 때
	// 그 값을 초기화 할 수있다.
	Box() {
		// this를 사용하여 클래스의 필드와 메소드에 접근할수 있다.
		this.width = 10;
		this.height = 10;
		this.length = 10;
		
		boxCount++;
	}

	// 매개변수를 갖는 생성자
	// 외부에서 값을 받아와서 생성자 혹은 메소드 내에서 쓰는 변수
	// 일상예시) 커피(값)를 가져올때 - 컵(변수)에 담아서 들고옴
	Box(int z) {
		// 가져온 z 에 담긴 값은 {}블록 안에서 사용할 수 있다
		this.width = z;
		this.length = z;
		this.height = z;

		boxCount++;
	}

	// 메소드 - 객체의 행동/연산/명령
	// int - 반환값(return)의 자료형, 반드시 return 사용
	// void - 반환값이 없는 메소드, return 없음
	int calVoume() {
		int v = width * length * height;
		return v; // 필요한 값은 return을 통해서 내보내준다.
	}

	void printData() {
		System.out.println("현재 가로 세로 높이 길이 :" + this.width + ", " + this.length + ", " + this.height);
	}

	// 메소드를 이용해서 필드이 값을 바꿀수 있다.
	void setWidth(int width) {
		this.width = width;
	}

	// 기초형을 받아와서 숫자를 더한 후에 출력
	// Box 와 관계가 없고 매개변수로 받아온 값이 복사되어 들어온값인지 확인하기 위함
	int plus(int num) {
		// 매개변수로 받아온 num값은 1이 증가됨
		return num + 1;
	}

	// 참조형을 받아와서 값을 수정한 후에 출력
	// Box객체를 받아와서 그 값을 현재 객체의 값으로 복사
	void cloneBox(Box box) {
		box.height = this.height;
		box.length = this.length;
		box.width = this.width;
		System.out.println("메소드에서 수정된 높이 :" + box.height);
	}
	
	// 실습 참조형을 받는 메소드 작성
	boolean equalsBox(Box box) {
		// 객체 box를 가져와서 가로세로높이가 같은 경우 true를 return
		// 아닐경우 false를 return
		if (height == box.height && length == box.length && width == box.width) {
			return true;
		} else {
			return false;
		}
		
	}
	static int getBoxCount() {
		return boxCount;
	}
}
