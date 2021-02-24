package java_chobo.ch08.exam;

public class BankAccount {
	int minsave = -100000;
	int save;

	public BankAccount(int minsave) {
		this.minsave = minsave;
	}

	public void withdraw(int money) throws Exception {
		save -= money;
		if (money < 0 || save < -100000) {
			try {
				System.err.println("초과출금예외");
				throw new Exception();
			} catch (Exception e) {
				
			}
		}
		System.out.printf("정상출금처리 : 인출금액 = %d, 잔금 = %d%n", money, save);

	}

	public void deposit(int money) {
		save += money;
		System.out.printf("정상입금처리 : 입금금액 = %d, 잔금 = %d%n", money, save);
	}

	@Override
	public String toString() {
		return String.format("BankAccount [save=%s]", save);
	}

}
