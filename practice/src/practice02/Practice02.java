package practice02;

public class Practice02 {
	public static void main(String[] args) {
		// String names 선언하세요
		// "흥부", "놀부"로 초기화 하세요
		String[] names = {"흥부", "놀부"};
		
		System.out.println(names[0]);
		
		Book myBook = new Book();
		Book myBook1 = new Book("흥부", 100);
		System.out.println(myBook.title);
		System.out.println(myBook1.title);
		System.out.println(myBook.getTitle());
		System.out.println(myBook1.getTitle());
		myBook.setTItle("심청전");
		System.out.println(myBook.getTitle());
		
		System.out.println(myBook.checkPageCount());
		System.out.println(myBook1.checkPageCount());
		
		if(myBook.checkPageCount()) {
			System.out.println("페이지가 들어가 있습니다");
		} else {
			System.out.println("페이지가 입력되어있지않습니다");
		}
	}
}
