package java_chobo.ch06.teacher.test;

public class Student {
	// 멤버 변수 + 멤버 메서드

	String name; // 학새명
	int ban; // 반
	int no; // 번호
	int kor; // 국어점수
	int eng; // 영어점수
	int math; // 수학점수

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String info() {
		return String.format("%s, %d, %d, %d, %d, %d, %d, %.1f",
				name, ban, no, kor, eng, math, kor+eng+math, (kor+eng+math)/3F
				);
	}

	public int getTotal() {
		return kor + eng + math;
	}

	public float getAverage() {
//		String res = String.format("%.1f", getTotal()/3.0F);
//		return Float.parseFloat(res);
		return Float.parseFloat(String.format("%.1f", getTotal()/3.0F));
	}

}







