package java_chobo.ch08.exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_exam {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int z = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("정수 두 개 입력 : ");

		try {
			x = input.nextInt();
			y = input.nextInt();
		} catch (InputMismatchException e) {
			e.printStackTrace();
			
		} finally {
			z = x * y;
			System.out.printf("%d * %d = %d%n", x, y, z);
		}

	}

}
