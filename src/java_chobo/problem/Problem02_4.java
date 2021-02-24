package java_chobo.problem;

public class Problem02_4 {

	public static void main(String[] args) {
		exam04_A();
		exam04_B();
		exam04_C();
	}

	private static void exam04_C() { // ??
		for (int i = 1; i < 8; i++) {
			for (int j = 8; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}// end of exam04_C

	private static void exam04_B() {
		for (int i = 1; i < 8; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}// end of exam04_B

	private static void exam04_A() {
		for (int i = 1; i < 8; i++) {
			for (int j = 1; j < 8; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}// end of exam04_A

}
