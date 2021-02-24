package java_chobo.problem;

import java.util.Scanner;

public class Problem01_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입장권 종류, 시간, 나이를 입력하세요.");
		String i = sc.next();
		int j = sc.nextInt();
		int k = sc.nextInt();
		String a = "자유입장권";
		String b = "입장권";

		if (i.equals(a)) {
			if (j <= 17) {
				if (k <= 12 || k >= 65) {
					System.out.println("가격은 25,000원");
				} else {
					System.out.println("가격은 34,000원");
				}
			} else {
				if (k <= 12 || k >= 65) {
					System.out.println("가격은 21,000원");
				} else {
					System.out.println("가격은 29,000원");
				}
			}
		} else if (i.equals(b)) {
			if (j <= 17) {
				if (k <= 12 || k >= 65) {
					System.out.println("가격은 20,000원");
				} else {
					System.out.println("가격은 27,000원");
				}
			} else {
				if (k <= 12 || k >= 65) {
					System.out.println("가격은 17,000원");
				} else {
					System.out.println("가격은 23,000원");
				}
			}
		}

		sc.close();

	}

}
