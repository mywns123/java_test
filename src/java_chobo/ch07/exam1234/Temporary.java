package java_chobo.ch07.exam1234;

public class Temporary extends Employee {

	int time;
	int st = 10000;

	public Temporary(String name, int age, String juso, String title) {
		super(name, age, juso, title);
	}

	public void setTime(int time) {
		this.time = time;
		salary = time * st;
	}

	public void printinfo() {
		System.out.println("비정규직" + salary);
	}

}
