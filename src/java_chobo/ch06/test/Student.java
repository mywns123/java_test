package java_chobo.ch06.test;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;

	public Student() {

	}

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	@Override
	public String toString() {
		return String.format("Student [%s %d %d %d %d %d %d %.1f] ", name, ban, no, kor, eng, math, kor + eng + math,
				(kor + eng + math) / 3f);
	}

	public int getTotal() {
		return kor + eng + math;
	}

	public float getAverage() {
		String res = String.format("%.1f",getTotal() / 3.0f);
		return Float.parseFloat(res);
	//	return Float.parseFloat(String.format("%.1f",getTotal() / 3.0f));
	}
}