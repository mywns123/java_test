package java_chobo.problem;

import java.util.Random;
import java.util.Scanner;

public class Problem02_3 {

	public static void main(String[] args) {
		Random ran = new Random(123);
		int i = ran.nextInt(100) + 1;
		int j = 0;
		for (; j != i;) {
			Scanner sc = new Scanner(System.in);
			System.out.println("정수를 입력하세요.");
			j = sc.nextInt();
			if (j < 0) {
				break;
			} else if (j < i) {
				System.out.println("정답보다 낮은 수입니다.");
			} else if (j > i) {
				System.out.println("정답보다 높은 수입니다.");
			} else if (j == i) {
				System.out.println("정답입니다.");
			}
			sc.close();
		}

	}

}
