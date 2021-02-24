package java_chobo.ch06.test;

public class Ecercise6_23 {

	public static void main(String[] args) {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		System.out.println(s);

		Student t = new Student();
		t.name = "이종윤";
		t.ban = 1;
		t.no = 1;
		t.kor = 60;
		t.eng = 70;
		t.math = 81;

		System.out.printf("이름 : %s%n ", t.name);
		System.out.printf("총점 : %s%n ", t.getTotal());
		System.out.printf("평균 : %.1f%n", t.getAverage());

	}

}
