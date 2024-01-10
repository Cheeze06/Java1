package Ch13;

public class C05AccountMain {

	// 속성(멤버 변수) 선언
	// 계좌번호
	private String accountNumber;

	// 계좌잔액
	private double balance;
	
	public C05AccountMain() {
		
	}

	// 매개변수 생성자(Constructor)
	public C05AccountMain(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	// 출금메소드
	public void withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount;
			System.out.println("출금 완료. 현재 잔액 : $" + balance);
		} else {
			System.out.println("잔액이 부족합니다");
		}

	}

	// 입금 메소드
	public void deposit(double amount) {
		balance += amount;
		System.out.println("입금 완료. 현재 잔액 : $" + balance);

	}
	// 계좌번호 확인 메서드 (getter)
	public String getAccountNumber() {
		return accountNumber;
	}
	// 계좌번호 설정 메서드 (setter)
	public void setAccountNumber(String accountNumber) {
		
		this.accountNumber = accountNumber;
		
	}
	// 계좌잔액 확인 메서드 (getter)
	public double getBalance() {
		return balance;
	}
	// 계좌잔액 설정 메서드 (setter)
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {
		// Account 클래스에 대한 인스턴스(객체) 생성
		C05AccountMain myAccount = new C05AccountMain("1000-2000-11", 1000.0);
		System.out.println("당신의 계좌번호는 : " +myAccount.getAccountNumber());
		
		// 입금
		myAccount.deposit(500.0);
		
		// 잔액
		System.out.println("현재 잔액은 $ : " + myAccount.getBalance());
		// 출금
		myAccount.withdraw(200.0);
		// 잔액
		System.out.println("현재 잔액은 $ : " + myAccount.getBalance());
		// 계좌번호 재설정
		myAccount.setAccountNumber("9000-8000-77");
		System.out.println("당신의 계좌번호는 : " + myAccount.getAccountNumber());
			
		
		
		
		
		
		
		
		
		

	}

}
