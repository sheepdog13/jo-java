package chap07_1_access;

public class BankAcc {
	// 필드
	public String bankNum;
	private int money;
	
	// 생성자
	public BankAcc(String s) {
		this.bankNum = s;
		this.money = 0;
	}
	
	// 접근자
	public int getMoney() {
		return this.money;
	}
	
	// 메소드
	public void inMoney(int a) {
		//입금
		this.money += a;
	}
	public void outMoney(int a) {
		//출금
		if (this.money >= a) {
			this.money -= a;
		} else {
			System.out.println("금액이 부족합니다");
		}
	}
}
