package java_chobo.ch08.exam;

public class Ex03 {

	public static void main(String[] args) throws Exception {
		/*
		 * BankAccount ba = new BankAccount(-100000); try { ba.withdraw(500000); } catch
		 * (Exception e) { e.printStackTrace(); System.err.println("인출오류"); }
		 * System.out.println(ba.save);
		 */
		
		
		BankAccount bb = new BankAccount(-100000);
		bb.deposit(100000);
		bb.withdraw(100000);
		bb.withdraw(200000);
		
		System.out.println(bb.save);
		
		
		
	}

}
