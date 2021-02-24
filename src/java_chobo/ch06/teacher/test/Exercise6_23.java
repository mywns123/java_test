package java_chobo.ch06.teacher.test;

public class Exercise6_23 {
	public static void main(String[] args) {
//		exam_02();
		
		Student s = new Student();
		s.name = "이종윤";
		s.ban = 2;
		s.no = 1;
		s.kor = 60;
		s.eng = 70;
		s.math = 81;
		
		System.out.printf("이름 : %s%n", s.name);
		System.out.printf("총점 : %s%n", s.getTotal());
		System.out.printf("평균 : %.1f%n", s.getAverage());
		System.out.println("평균 : " + s.getAverage());
		
	}

	public static void exam_02() {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		
		String str = s.info();
		System.out.println(str);
	}
}
