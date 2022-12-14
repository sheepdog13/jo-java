package chap07_2_getset;

import java.util.Calendar;

public class Order {
	private String orderNumer;
	private String id;
	private String name;
	private String productNum;
	
	//정적 변수 orderCount;
	private static int orderCount = 0;
	public Order() {
	
		this.orderNumer = numString();
		this.id = " ";
		this.name = " ";
		this.productNum = " ";
		
	}
	public Order(String id, String name, String productNum) {
		this.orderNumer = numString();
		this.id = id;
		this.name = name;
		this.productNum = productNum;
	
	}
	
	public String getOrderNumer() {
		return this.orderNumer;
	}
	public void setOrderNumber(String orderNumer) {
		this.orderNumer = orderNumer;
	}
	
	// orderNumber 자동으로 작성하는 메소드
	private String numString() {
		Calendar cal = Calendar.getInstance();
		// 년도, 달, 일
		// cal개체를 이용하여 현재 날짜를 받아옴
		int year = cal.get(cal.YEAR);
		int month = cal.get(cal.MONTH)+1;
		int date = cal.get(cal.DATE);
		// 정적변수 orderCount를 만들어서 사용하여
		// String 20228110 이라는 값을 만드세요
		String numString = Integer.toString(year) + Integer.toString(month) + Integer.toString(date)
		+Integer.toString(orderCount);
		// 0이 포함된 202208110000 만들기
		// format : 무자열 안에 %d(정수), %s(문자열) 와 같이 기호를 통해 변수를 넣음
		// 숫자형의 경우 숫자가 차지할 공간을 지정해 줄수 있다 : %2d(공간2차지)
		// 앞에 0이 붙으면 빈 공간을 0으로  채워준다 : %02d(빈공간은 0으로)
		String numZeroString = String.format("%d%02d%02d%04d", year, month, date, orderCount);
		orderCount++;
		return numZeroString;
		
	}
	
	
	
	
}
