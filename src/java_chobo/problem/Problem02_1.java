package java_chobo.problem;

import java.util.Scanner;

public class Problem02_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		exam01_A();
		exam01_B(sc);
		exam01_C(sc);
		sc.close();
	}// end of main

	private static void exam01_C(Scanner sc) { // 100 200 300 0까지 합
		System.out.println("정수를 입력하세요.");
		int sum = 0;
		for (int i = 1; i != 0; i++) {
			int num = sc.nextInt();
			sum += num;
			if (num == 0) {
				break;
			} // end of if
		}
		System.out.printf("정수들의 합은 =  %d%n", sum);
	} // end of exam01_C

	private static void exam01_B(Scanner sc) { // 3 100 200 300 합
		System.out.println("횟수를 입력하세요.");
		int number = sc.nextInt();
		System.out.println("정수를 입력하세요.");
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			int number1 = sc.nextInt();
			sum += number1;
		}
		System.out.printf("정수들의 합은 =  %d%n", sum);
	} // end of exam01_B

	private static void exam01_A() { // 1부터 100까지의 합
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			sum = sum + i;
		}
		System.out.printf("1부터 100까지의 합 =  %d%n", sum);
	} // end of exam01_A

}// end of class
