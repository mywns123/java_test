package java_chobo.problem;

import java.util.Scanner;

public class Problem01_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("키, 몸무게, 나이를 입력하세요.");
		double i = sc.nextInt();
		double j = sc.nextInt();
		int k = sc.nextInt();
		double w = (j / (i / 100 * i / 100));

		if (k < 30) {
			if (w <= 18) {
				System.out.println("저체중");
			} else if (w <= 23) {
				System.out.println("표준체중");
			} else if (w <= 30) {
				System.out.println("과체중");
			} else {
				System.out.println("비만");
			}
		} else if (30 <= k) {
			if (w < 18.5) {
				System.out.println("저체중");
			} else if (w <= 24) {
				System.out.println("표준체중");
			} else if (w <= 30) {
				System.out.println("과체중");
			} else {
				System.out.println("비만");
			}
		}

		sc.close();

	}

}
