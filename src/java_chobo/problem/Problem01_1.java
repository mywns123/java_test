package java_chobo.problem;

import java.util.Scanner;

public class Problem01_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("물건 판매 수를 입력하세요.");
		int number = sc.nextInt();
		int price = 0;
		if (number >= 100) {
			price = (int) (number * 100 * 0.8);
			System.out.printf("판매값은 = %d", price);
		} else if (number >= 20) {
			price = (int) (number * 100 * 0.85);
			System.out.printf("판매값은 = %d", price);

		} else if (number >= 10) {
			price = (int) (number * 100 * 0.9);
			System.out.printf("판매값은 = %d", price);
		} else {
			price = (int) (number * 100);
			System.out.printf("판매 값은 = %d", price);
		}
		sc.close();

	}
}
