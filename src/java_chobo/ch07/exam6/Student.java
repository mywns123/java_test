package java_chobo.ch07.exam6;

public class Student {
	String school;
	String scname;
	int stdNo;
	double[] avg = new double[8];

	public Student(String school, String scname, int stdNo) {
		this.school = school;
		this.scname = scname;
		this.stdNo = stdNo;
	}

	public double average() {
		double sum = 0;
		for (int i = 0; i < avg.length; i++) {
			sum += avg[i];
		}
		return sum / 8;
	}

	@Override
	public String toString() {
		return String.format("학교 : %s%n학과 : %s%n학번 : %s", school, scname, stdNo);
	}

}
