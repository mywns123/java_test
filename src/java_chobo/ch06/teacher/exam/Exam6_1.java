package java_chobo.ch06.teacher.exam;

import java.util.Scanner;

public class Exam6_1 {
	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in); factorial(sc); decTobin(sc); sc.close();
		
		
		int res = fact(5);
		System.out.println("5! = " + res);
	}
	
	private static int fact(int n) {
		//종료조건 반드시 존재
		if (n == 1) {
			return 1;
		}else {
			return n * fact(n-1);
		}
	}


	private static void factorial(Scanner sc) {
		System.out.print("factorial 구할 수를 입력하세요. > ");
		int num = sc.nextInt();
		//코드 작성
	}

	private static void decTobin(Scanner sc) {
		System.out.print("십진수를 입력하세요.(0~255까지 입력)> ");
		int num = sc.nextInt();
		//코드 작성
	}

}
