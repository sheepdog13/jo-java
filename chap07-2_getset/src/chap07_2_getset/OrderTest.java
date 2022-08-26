package chap07_2_getset;

import java.util.Calendar;

public class OrderTest {
	public static void main(String[] args) {
		Order[] consumers = new Order[10];
		consumers[0] = new Order("abc123", "홍길동", "PD-123");
		System.out.println(consumers[0].getOrderNumer());
		
		// 캘린더 클래스 확인
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.get(cal.YEAR));
		System.out.println(cal.get(cal.MONTH)+1);// 첫 시작달이 0으로 시작
		System.out.println(cal.get(cal.DATE));
		
		consumers[1] = new Order();
		System.out.println(consumers[1].getOrderNumer());
		
		// orders[2]~orders[9]까지 new Order();를 이용하여 객체를 생성하고
		// orders[2]~orders[9]까지 getOrderNumber를 출력하세요
		for(int i = 2; i < consumers.length; i++) {
			consumers[i] = new Order();
		}
		for(Order consumer : consumers) {
			System.out.println(consumer.getOrderNumer());
		}
	}
		
}

