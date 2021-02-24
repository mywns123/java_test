package java_chobo.problem;

import java.util.Scanner;

public class Problem01_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세 정수를 입력하세요.");
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();

		if (i < j && i < k) {
			System.out.printf("최소값은 %d", i);
		} else if (j < i && j < k) {
			System.out.printf("최소값은 %d", j);
		} else if (k < i && k < j) {
			System.out.printf("최소값은 %d", k);
		}
		sc.close();
	}

}
