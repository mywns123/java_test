package java_chobo.ch07.exam6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Person p = new Person();
		p.name = "김다정";
		p.age = 20;
		p.juso = "서울시 관악구";
		Student s = new Student("동양서울대학교", "전산정보학과", 20132222);
		System.out.println(p);
		System.out.println(s);
		System.out.println("-------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("8학기 학점을 순서대로 입력하세요.");
		for (int i = 0; i < 8; i++) {
			System.out.print(i + 1 + "학기 학점  -> ");
			s.avg[i] = sc.nextDouble();
		}
		System.out.printf("8학기 총 평균 평점은 %.4f점입니다.", s.average());

		sc.close();
	}

}
