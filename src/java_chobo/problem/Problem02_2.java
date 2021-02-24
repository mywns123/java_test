package java_chobo.problem;

import java.util.Scanner;

public class Problem02_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num = scanner.nextInt();
		do {
			System.out.printf("%d", num % 10);
			num /= 10;
		} while (num > 0);
		scanner.close();

	}

}
