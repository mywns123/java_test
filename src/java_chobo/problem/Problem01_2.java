package java_chobo.problem;

import java.util.Scanner;

public class Problem01_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요.");
		String i = sc.nextLine();
		int j = (int) i.charAt(0);
		if (65 <= j && j <= 90) {
			System.out.printf("%s", i);
		} else if (97 <= j && j <= 122) {
			System.out.printf("대문자를 입력하세요.");
		}
		sc.close();

	}

}
