package practice;

public class Book {
	String title;
	String author;
	int page;
	boolean checkOut;
	
	static int bookCount = 0;
	
	static int getBookCount() {
		return bookCount;
	}
	
	Book () {
		title = "미정";
		author = "미상";
		page = 0;
		checkOut = false;
		bookCount++;
	}
	Book (String title, String author, int page) {
		this.title = title;
		this.author = author;
		this.page = page;
		this.checkOut = false;
		bookCount++;
	}
	
	boolean getCheckOut() {
		return this.checkOut;
	}
	void isCheckOut() {
		if (checkOut == true) {
			checkOut = false;
			System.out.println("책을 반납하였습니다");
		} else {
			checkOut = true;
			System.out.println("책을 대여하였습니다");
		}
	}
	void printBook() {
		if (checkOut == false) {
			System.out.println(author+"의 "+title+"책이 현재 있습니다");
		} else {
			System.out.println(author+"의 "+title+"책이 대여중 입니다");
		}
	}
}
