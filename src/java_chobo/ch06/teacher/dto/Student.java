package java_chobo.ch06.teacher.dto;

public class Student {
	public int stdNo; // 학번
	String name; // 성명
	int kor;
	int eng;
	int math;

	public Student() {
	}

	public Student(int stdNo) {
		this.stdNo = stdNo;
	}

	public Student(int stdNo, String name) {
		this.stdNo = stdNo;
		this.name = name;
	}

	public Student(int stdNo, String name, int kor, int eng, int math) {
		this.stdNo = stdNo;
		this.name = name;
		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int total() {
		return kor + eng + math;
	}

	public double avg() {
		return total() / 3D;
	}

	@Override
	public String toString() {
		return String.format("%3d %5s %3d %3d %3d %3d %.1f", stdNo, name, kor, eng, math, total(), avg());
	}

}
