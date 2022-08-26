package chap07_1_access;

public class BankAccTest {
	public static void main(String[] args) {
		// BankAcc 클래스 확인
		BankAcc mybankAcc = new BankAcc("123456789");
		mybankAcc.inMoney(15000);
		System.out.println(mybankAcc.getMoney());
		// outMoney메소드 수정하여 출금금액이 클때 못빠져나가게 할수있다
		mybankAcc.outMoney(5000);
		System.out.println(mybankAcc.getMoney());
		mybankAcc.outMoney(50000);
		
	}
}
